/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import contracts.Vehicle;

/**
 *
 * @author user
 */
public class DataBaseUtil {
    public static void addVehicleToBase(Vehicle vehicle, int parkingPlace, Date startTimeOfParking){
        //Mitko, implement this method! You know what to do!
    }
    
    //to be implemented
    public static void removeVehicleFromBase(Vehicle vehicle){
        //same shit
    }

    //To be implemented. Download parking places and vehicles from database;
    public static Map<Integer, Vehicle> loadParkedVehicles() {
        return new HashMap<Integer, Vehicle>();
    }
    
    //To be implemented. Download vehicles and parking time from database;
    public static Map<Vehicle, Date> loadParkingTime() {
        return new HashMap<Vehicle, Date>();
    }
}
