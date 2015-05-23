package contracts;

import java.math.BigDecimal;
import java.util.Date;

public interface VehicleCharger {
    BigDecimal chargeVehicle(
            Vehicle vehicle,
            Date entryTime,
            Date exitTime);
}