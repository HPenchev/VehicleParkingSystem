package vehicles;

import constants.Constants;

public class Car extends Vehicle {

    public Car(String licensePlate, String owner, int reservedHours) {
        super(licensePlate, owner, reservedHours);
        this.setRegularRate(Constants.CAR_REGULAR_RATE);
        this.setOvertimeRate(Constants.CAR_OVERTIME_RATE);
        this.SetVehicleType(Constants.CAR_TYPE);
    }    
}