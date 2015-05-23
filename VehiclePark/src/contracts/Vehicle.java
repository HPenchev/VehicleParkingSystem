package contracts;

import java.math.BigDecimal;

import enums.VehicleType;

public interface Vehicle {
    String getLicensePlate();    
    
    String getOwner();   
    
    BigDecimal getRegularRate(); 
    
    BigDecimal getOvertimeRate();
    
    int getReservedHours();
    
    VehicleType getVehicleType();
}