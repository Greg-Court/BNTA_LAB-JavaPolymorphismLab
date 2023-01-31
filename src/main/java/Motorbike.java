import interfaces.Rideable;

public class Motorbike extends MotorVehicle implements Rideable {
    public Motorbike(String make, String model, int value) {
        super(make, model, value);
        this.licenseType = "Motorbike License";
        this.maximumOccupancy = 2;
    }
    public String toppleOver() {
        return "Ouch";
    }

    public String wheelie() {
        return "Weee";
    }

    public String accelerate() {
        return "Motorbike engine sounds";
    }

    @Override
    public String ride(int topSpeed) {
        return "Reached a speed of " + topSpeed;
    }
}
