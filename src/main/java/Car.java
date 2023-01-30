public class Car extends MotorVehicle {
    private boolean hasAirCon;

    private boolean hasIndicators = true;
    public Car(String make, String model, int value) {
        super(make, model, value);
        this.licenseType = "Car License";
        this.maximumOccupancy = 7;
    }

    public void setHasAirCon(boolean airCon) {
        this.hasAirCon = airCon;
    }
    public boolean getHasAirCon() {
        return this.hasAirCon;
    }

    public void setHasIndicators(boolean indicators) {
        this.hasIndicators = indicators;
    }

    public boolean getHasIndicators() {
        return this.hasIndicators;
    }
}
