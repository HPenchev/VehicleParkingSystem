package vehicles;

import constants.Constants;

public class Motorbike extends Vehicle{
    public Motorbike(String licensePlate, String owner, int reservedHours) {
        super(licensePlate, owner, reservedHours);
        this.setRegularRate(Constants.MOTORBIKE_REGULAR_RATE);
        this.setOvertimeRate(Constants.MOTORBIKE_OVERTIME_RATE);
        this.SetVehicleType(Constants.MOTORBIKE_TYPE);
    }
}