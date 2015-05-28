package engine;

import java.util.Date;
import java.util.Map;

import parking.VehicleParking;
import vehicles.*;
import chargers.RegularOvertimeCharger;
import constants.Constants;
import contracts.*;
import contracts.Vehicle;

import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.Set;

import database.DataBaseUtil;

//The point of the engine is to load the parking from the database. It also needs to manage
//vehicles entry and exit by updating parking field information as well as database.

public class Engine {
    private static Engine processor;
    private final Parking parking;

    private Engine() {
        this.parking = this.loadParking();
    }

    public static Engine getInstance() {
        if (processor == null) {
            processor = new Engine();
        }

        return processor;
    }

    private Parking loadParking() {
        VehicleCharger charger = new RegularOvertimeCharger();
        int parkingPlaces = Constants.PARKING_PLACES;
        Map<Integer, Vehicle> parkedVehicles = DataBaseUtil.loadParkedVehicles();
        Map<Vehicle, Date> parkingTime = DataBaseUtil.loadParkingTime();

        return new VehicleParking(charger, parkingPlaces, parkedVehicles, parkingTime);
    }

    public int addCar(String licensePlate, String owner, int reservedTime, String vehicleType, int parkingPlace,
            Date startTime) {
        Vehicle vehicle;
        switch (vehicleType) {
            case "Car":
                vehicle = new Car(licensePlate, owner, reservedTime);
                break;
                
            case "Lorry":
                vehicle = new Lorry(licensePlate, owner, reservedTime);
                break;
                
            case "Motorbike":
                vehicle = new Motorbike(licensePlate, owner, reservedTime);
                break;
                
            default:
                throw new IllegalArgumentException("Unknown type of vehicle");
        }

        String response = this.parking.insertVehicle(vehicle, parkingPlace, startTime);
        switch (response) {
            case "Parking place taken":
                return 1;
                
            case "A car with such plate number is already in the parking":
                return 2;
                
            case "Successful entry":
                database.DataBaseUtil.addVehicleToBase(vehicle, parkingPlace, startTime);
                return 3;
                
            default:
                throw new IllegalStateException();
        }
    }

    public Map.Entry<Integer, BigDecimal> chargeVehicle(String licensePlate) {
        Date currentTime = new Date();
        Vehicle v = parking.getParkedVehicle(licensePlate);
        Integer place = parking.findVehiclesPlace(licensePlate);
        String exitStatus = parking.exitVehicle(licensePlate);
        
        switch (exitStatus) {
            case "No such car in the parking":
                return null;
            case "Car successfully removed":
                BigDecimal bill = parking.chargeVehicle(v, currentTime);
                database.DataBaseUtil.removeVehicleFromBase(v);
                return new AbstractMap.SimpleEntry<>(place, bill);
            default:
                throw new IllegalStateException();
        }

        
    }

    public Set<Integer> getFreeParkingPlaces() {
        return this.parking.takeFreePlaces();
    }

    public int findVehiclePlace(String licensePlate) {
        return this.parking.findVehiclesPlace(licensePlate);
        // UI implementation to be done
    }
}
