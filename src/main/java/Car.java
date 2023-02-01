import interfaces.Driveable;

public class Car extends MotorVehicle implements Driveable {
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
    public String accelerate() {
        return "Road car engine sounds";
    }

    @Override
    public String drive(int topSpeed) {
        return "Reached a speed of " + topSpeed;
    }
}
