import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import chargers.RegularOvertimeCharger;
import constants.Constants;
import contracts.*;
import contracts.Vehicle;
import parking.*;
import vehicles.*;

//For testing purposes only. Feel free to delete it.
public class Main {  

    Engine eng = Engine.getInstance();
    public final static BigDecimal test = new BigDecimal(3.5f);
    public static void main(String[] args) throws ParseException {
        Parking parking = new VehicleParking(
                new RegularOvertimeCharger(),
                Constants.PARKING_PLACES,
                new HashMap<Integer, contracts.Vehicle>(),
                new HashMap<contracts.Vehicle, Date>());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy/hh/mm/ss");
        Date d = sdf.parse("25/05/2015/20/00/00");
        
        Vehicle car = new Car("AA2322BB", "Pesho", 1);        
        Vehicle lorry = new Lorry("BB2343JJ", "Gosho", 3);
        Vehicle motorbike = new Motorbike("SS8888SS", "Mariika", 2);  
        
        System.out.println(parking.insertVehicle(car, 1, d));
        System.out.println(parking.insertVehicle(lorry, 2, new Date()));
        System.out.println(parking.insertVehicle(motorbike, 3, new Date()));
        
        //System.out.println(car.getOvertimeRate());
        
        System.out.println(parking.exitVehicle("AA2322BB"));
        System.out.println(parking.chargeVehicle(car, new Date()));
        System.out.println(parking.exitVehicle("sdfdsf"));
        
        BigDecimal a = new BigDecimal(3.5f);
        int b = 3;
        
        //System.out.println(a.multiply(new BigDecimal(b)));
        
        
//        BigDecimal rate = Constants.CAR_OVERTIME_RATE;
//        System.out.println(rate);
    }
}