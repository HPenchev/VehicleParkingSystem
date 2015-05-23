package chargers;

import java.math.BigDecimal;
import java.util.Date;

import contracts.Vehicle;
import contracts.VehicleCharger;
import enums.VehicleType;

public class RegularOvertimeCharger implements VehicleCharger {

    @Override
    public BigDecimal chargeVehicle(
            Vehicle vehicle, 
            Date entryTime, 
            Date exitTime) {
        int hours = 
                (int)Math.ceil((double)(exitTime.getTime() - entryTime.getTime())/1000/60/60);
        
        BigDecimal bill = 
                vehicle.getRegularRate().multiply(new BigDecimal(vehicle.getReservedHours()));
        
        if (hours > vehicle.getReservedHours()) {
            int extraTime = hours - vehicle.getReservedHours();
            BigDecimal overtimeRate = vehicle.getOvertimeRate();
            BigDecimal extraCharge = overtimeRate.multiply(new BigDecimal(extraTime));
            bill.add(extraCharge);
        }
        
        return bill;
    }
}