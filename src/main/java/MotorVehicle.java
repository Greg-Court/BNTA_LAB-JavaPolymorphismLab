public abstract class MotorVehicle {
    protected String make;
    protected String model;
    protected String licenseType;
    protected int maximumOccupancy;
    protected int value;
    protected int topSpeed;

    public MotorVehicle(String make, String model, int value) {
        this.make = make;
        this.model = model;
        this.value = value;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public int getValue() {
        return value;
    }

    public void setMaximumOccupancy(int maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    // Abstract method in superclass
    public abstract String accelerate();

}
