package vehicles;

import java.math.BigDecimal;
import java.util.regex.Matcher;

import constants.Constants;
import enums.VehicleType;

public abstract class Vehicle implements contracts.Vehicle{
    private String licensePlate;
    private String owner;
    private BigDecimal regularRate; 
    private BigDecimal overtimeRate; 
    private int reservedHours;   
    private VehicleType type;

    protected Vehicle(String licensePlate, String owner, int reservedHours) {
        this.setLicensePlate(licensePlate);
        this.setOwner(owner);
        this.setReservedHours(reservedHours);
    }
    
    //License number must be in format one or two Latin letters, 
    //four digits and two more Latin letters.
    private void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;        
        Matcher m = Constants.LICENSE_PLATE_VALIDATION.matcher(licensePlate);
        if (!m.matches()) {
            throw new IllegalArgumentException("Invalid license number");
        }
    }
        
    private void setOwner(String owner) {
        if (owner==null || owner.isEmpty()) {
            throw new IllegalArgumentException("Owner is mandatory");
        }
        
        this.owner = owner;
    }
    
    protected void setRegularRate(BigDecimal regularRate) {
        if (regularRate.compareTo(new BigDecimal("0")) < 0) {
            throw new IllegalArgumentException("Regular price can't be less than 0");
        }
        
        this.regularRate = regularRate;
    }    
    
    protected void setOvertimeRate(BigDecimal overtimeRate) {
        if (regularRate.compareTo(new BigDecimal("0")) < 0) {
            throw new IllegalArgumentException("Regular price can't be less than 0");
        }
        
        this.overtimeRate = overtimeRate;
    }
    
    
    protected void setReservedHours(int reservedHours) {
        if (reservedHours < 1) {
            throw new IllegalArgumentException("Reserved hours have to be more than 0");
        }
        
        this.reservedHours = reservedHours;
    }
    
    protected void SetVehicleType(VehicleType type) {
        this.type = type;
    }    
    
    @Override
    public String getLicensePlate() {
        return this.licensePlate;
    }
    

    @Override
    public String getOwner() {
        return this.owner;
    }
    
    @Override
    public BigDecimal getRegularRate() {
        return this.regularRate;
    }


    @Override
    public BigDecimal getOvertimeRate() {
        return this.overtimeRate;
    }
    

    @Override
    public int getReservedHours() {
        return this.reservedHours;
    }

    @Override
    public VehicleType getVehicleType() {
        return this.type;
    } 
}