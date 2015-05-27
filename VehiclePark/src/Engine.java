import java.util.Date;
import java.util.Map;

import parking.VehicleParking;
import chargers.RegularOvertimeCharger;
import constants.Constants;
import contracts.*;

//The point of the engine is to load the parking from the database. It also needs to manage
//vehicles entry and exit by updating parking field information as well as database.

public class Engine {    
    private static Engine processor;
    private Parking parking;
    
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
        Map<Integer, Vehicle> parkedVehicles = this.loadParkedVehicles();
        Map<Vehicle, Date> parkingTime = this.loadParkingTime();
        
        return new VehicleParking(charger, parkingPlaces, parkedVehicles, parkingTime);
    }
    
    //This method has to load information about parked vehicles from the database.
    private Map<Integer, Vehicle> loadParkedVehicles() {
        throw new UnsupportedOperationException();
    }
    
    //This method has to load information about time of parking of each vehicle from the database.
    private Map<Vehicle, Date> loadParkingTime() {
        throw new UnsupportedOperationException();
    }
}
