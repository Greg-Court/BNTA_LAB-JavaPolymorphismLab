public class Motorbike extends MotorVehicle {
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
}
