package vehicles;

import constants.Constants;

public class Lorry extends Vehicle {
    public Lorry(String licensePlate, String owner, int reservedHours) {
        super(licensePlate, owner, reservedHours);
        this.setRegularRate(Constants.LORRY_REGULAR_RATE);
        this.setOvertimeRate(Constants.LORRY_OVERTIME_RATE);
        this.SetVehicleType(Constants.LORRY_TYPE);
    }
}