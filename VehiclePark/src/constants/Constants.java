package constants;

import java.math.BigDecimal;
import java.util.regex.Pattern;

import enums.VehicleType;

public class Constants {
    public final static Pattern LICENSE_PLATE_VALIDATION = 
            Pattern.compile("[A-Z]{1,2}\\d{4}[A-Z]{1,2}$");
    
    public final static BigDecimal CAR_REGULAR_RATE = new BigDecimal(2);
    public final static BigDecimal CAR_OVERTIME_RATE = new BigDecimal(3.5f);
    public final static VehicleType CAR_TYPE = VehicleType.CAR;
    
    public final static BigDecimal LORRY_REGULAR_RATE = new BigDecimal(4.75f);
    public final static BigDecimal LORRY_OVERTIME_RATE = new BigDecimal(6.2f);
    public final static VehicleType LORRY_TYPE = VehicleType.LORRY;
    
    public final static BigDecimal MOTORBIKE_REGULAR_RATE = new BigDecimal(1.35f);
    public final static BigDecimal MOTORBIKE_OVERTIME_RATE = new BigDecimal(3);
    public final static VehicleType MOTORBIKE_TYPE = VehicleType.MOTORBIKE;
    
    public static int PARKING_PLACES = 100;
}
