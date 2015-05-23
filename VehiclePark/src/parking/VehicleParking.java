package parking;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

import contracts.*;

public class VehicleParking implements Parking {
    VehicleCharger charger;
    private int parkingPlaces;
    private Map<Integer, contracts.Vehicle> vehiclesParked;
    private Map<contracts.Vehicle, Date> timeOfParking; 
    
    public VehicleParking(
            VehicleCharger charger,
            int parkingPlaces, 
            Map<Integer, Vehicle> vehiclesParked, 
            Map<Vehicle, Date> timeOfParking) {
    this.charger = charger;
    this.parkingPlaces = parkingPlaces;
    this.vehiclesParked = vehiclesParked;
    this.timeOfParking = timeOfParking;
    }

    @Override
    public String insertVehicle(Vehicle vehicle, int parkingPlace, Date startTime) {
        if (parkingPlace < 1 || parkingPlace > this.parkingPlaces) {
            return "Non-existing parking place";
        }
        
        if (checkParkingPlace(parkingPlace)) {
            return "Parking place taken";
        }
        
        if (checkLicensePlate(vehicle.getLicensePlate())) {
            return "A car with such plate number is already in the parking";
        }
        
        this.vehiclesParked.put(parkingPlace, vehicle);
        this.timeOfParking.put(vehicle, startTime);
        
        return "Successful entry";
        
    }

    @Override
    public String exitVehicle(String licensePlate) {
        if (!checkLicensePlate(licensePlate)) {
            return "No such car in the parking";
        }
        
        int placeOfCar = this.findVehiclesPlace(licensePlate);     
        this.vehiclesParked.remove(placeOfCar);   
        
        return "Car successfully removed";
    }

    @Override
    public Map<Integer, Vehicle> getVehiclesParked() {
        return this.vehiclesParked;
       
    }

    @Override
    public int findVehiclesPlace(String licensePlate) {
        int placeOfCar = -1;
        
        for (Map.Entry<Integer, Vehicle> entry : this.vehiclesParked.entrySet()) {
            if (entry.getValue().getLicensePlate().equals(licensePlate)) {
                placeOfCar = entry.getKey();                
                break;
            }
        }
        
        return placeOfCar;
    }

    @Override
    public Collection<Vehicle> findVehiclesByOwner(String owner) {
        List<Vehicle> vehiclesByOwner = new ArrayList<Vehicle>();
        for (Vehicle vehicle : this.vehiclesParked.values()) {
            if (vehicle.getOwner().equals(owner)) {
                vehiclesByOwner.add(vehicle);
            }
        }
        
        return vehiclesByOwner;
    }
    
    @Override
    public BigDecimal chargeVehicle(Vehicle vehicle, Date exitTime) {
        BigDecimal bill = this.charger.chargeVehicle(
                vehicle, 
                this.timeOfParking.get(vehicle), 
                exitTime);
        
        this.timeOfParking.remove(vehicle);
        return bill;
    }

    private boolean checkLicensePlate(String licensePlate) {
        for (Vehicle vehicle : this.vehiclesParked.values()) {
            if (licensePlate.equals(vehicle.getLicensePlate())) {
                return true;
            }
        }
        
        return false;
    }
    
    private boolean checkParkingPlace(int parkingPlace) {
        return this.vehiclesParked.containsKey(parkingPlace);
    }
}