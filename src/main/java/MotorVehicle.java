public abstract class MotorVehicle {
    protected String make;
    protected String model;
    protected String licenseType;
    protected int maximumOccupancy;
    protected int value;

    public MotorVehicle(String make, String model, int value) {
        this.make = make;
        this.model = model;
        this.value = value;
    }

    public String accelerate() {
        return "Vroom vroom";
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public int getValue() {
        return value;
    }

    public void setMaximumOccupancy(int maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }
}
