/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import vehicles.Car;
import vehicles.Lorry;
import vehicles.Motorbike;
import contracts.Vehicle;

/**
 *
 * @author user
 */
public class DataBaseUtil {
   
	private static Connection con = null;
	private static Statement st = null;
	private static ResultSet rs = null;
	
	private static String  url = "jdbc:postgresql://localhost/hack";
	private static String user = "postgres";
	private static String password = "123456";
	private static final String createTableQuery = "CREATE TABLE IF NOT EXISTS public.parking(ParkingPlace int,LicensePlate varchar(255),Owner varchar(255),ReservedHours int,EnterTime varchar(255),VehicleType int,PricePerHour varchar(255),PriceOverTime varchar(255));";
	private static final String INSERTQUERY1 = "INSERT INTO public.parking VALUES (";
	private static final String INSERTQUERY2 = ");";
	private static final String REMOVEQUERY = "DELETE FROM public.parking WHERE licenseplate = ";
	private static final String SELECT_ALL = "select * from public.parking";
	
	private static Map<Integer, Vehicle> parkingPlaces = new HashMap<Integer, Vehicle>();
	private static Map<Vehicle, Date> parkingTime = new HashMap<Vehicle, Date>();
	
	private static void connect(){
		 try {
	            con = DriverManager.getConnection(url, user, password);
	            st = con.createStatement();
	            rs = st.executeQuery(createTableQuery);
	        } catch (SQLException ex) {}
	}
	
	private static void disconnect(){
		 try {
             if (rs != null) {
                 rs.close();
             }
             if (st != null) {
                 st.close();
             }
             if (con != null) {
                 con.close();
             }

         } catch (SQLException ex) {
         	ex.printStackTrace();
         }
	}
	
	public static void addVehicleToBase(Vehicle vehicle, int parkingPlace, Date startTimeOfParking) throws NumberFormatException, SQLException{
        connect();
        int vehicleTypeNumber = 0;
        switch (vehicle.getVehicleType()) {
		case MOTORBIKE:
			vehicleTypeNumber = 1;
			break;
		case CAR:
			vehicleTypeNumber = 2;
			break;
		case LORRY:
			vehicleTypeNumber = 3;
			break;
		}
        Calendar cal = Calendar.getInstance();
        cal.setTime(startTimeOfParking);
        long time = startTimeOfParking.getTime();
		st.executeUpdate(INSERTQUERY1 + parkingPlace +",'" + vehicle.getLicensePlate() + "','" + vehicle.getOwner() + "'," + vehicle.getReservedHours() + ",'" + time + "'," + vehicleTypeNumber + "," + Double.parseDouble(vehicle.getRegularRate().toString()) + "," + Double.parseDouble(vehicle.getOvertimeRate().toString()) +  INSERTQUERY2);
        disconnect();
    }
    
    public static void removeVehicleFromBase(Vehicle vehicle) throws SQLException{
        connect();
        st.executeUpdate(REMOVEQUERY + "'" + vehicle.getLicensePlate() + "'");
        disconnect();
    }

    public static Map<Integer, Vehicle> loadParkedVehicles() throws SQLException{
    	loadDatabaseInformation();
    	return parkingPlaces;
    }
    
    private static void loadDatabaseInformation() throws SQLException {
    	connect();
    	rs = st.executeQuery(SELECT_ALL);
    	while (rs.next()) {
    		Vehicle vehicle;
    		int parkingPlace = rs.getInt("parkingplace");
    		Date parkingDate = new Date(rs.getLong("entertime"));
    		
    		
    		switch (rs.getInt("vehicletype")) {
			case 1:
				vehicle = new Motorbike(rs.getString("licenseplate"), rs.getString("owner"), rs.getInt("reservedHours"));
				break;
			case 2:
				vehicle = new Car(rs.getString("licenseplate"), rs.getString("owner"), rs.getInt("reservedHours"));
				break;
			case 3:
				vehicle = new Lorry(rs.getString("licenseplate"), rs.getString("owner"), rs.getInt("reservedHours"));
				break;
			default:
				throw new IllegalStateException("Unknow type of vehicle");
			}
    		
    		parkingPlaces.put(parkingPlace, vehicle);
    		parkingTime.put(vehicle, parkingDate);
		}
    	disconnect();
    }
    
    public static Map<Vehicle, Date> loadParkingTime() throws SQLException {
    	loadDatabaseInformation();
    	return parkingTime;
    }
}