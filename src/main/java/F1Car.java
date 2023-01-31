import interfaces.Driveable;

import java.util.ArrayList;

public abstract class F1Car extends MotorVehicle implements Driveable {
    protected ArrayList<String> possibleDrivers;
    protected String livery;
    protected int strategyTeamAbility;
    protected String currentDriver;

    public F1Car(String make, String model, int value) {
        super(make, model, value);
        licenseType = "Super License";
        possibleDrivers = new ArrayList<>();
        maximumOccupancy = 1;
    }

    public String activateDRS() {
        return "DRS Activating!";
    }

    public String boxBox() {
        return "Boxing!";
    }

    public void setLivery(String livery) {
        this.livery = livery;
    }

    public String getLivery() {
        return livery;
    }

    public void setCurrentDriver(String currentDriver) {
        this.currentDriver = currentDriver;
    }

    @Override
    public String drive(int topSpeed) {
        return "Reached a speed of " + topSpeed;
    }
}
