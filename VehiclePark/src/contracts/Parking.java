package contracts;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public interface Parking {
    String insertVehicle(Vehicle vehicle, int parkingPlace, Date startTime);
    
    String exitVehicle(String licensePlate);
    
    Map<Integer, Vehicle> getVehiclesParked();
    
    int findVehiclesPlace(String licensePlate);
    
    //Collection<contracts.Vehicle> findVehiclesByOwner(String owner);
    
    BigDecimal chargeVehicle(Vehicle vehicle, Date exitTime);
    
    Set<Integer> takeFreePlaces();
    
    contracts.Vehicle getParkedVehicle(String licensePlate);
}
