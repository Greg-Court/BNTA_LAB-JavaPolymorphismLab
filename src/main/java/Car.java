public class Car extends MotorVehicle {
    protected boolean hasAirCon;

    protected boolean hasIndicators = true;
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

}
