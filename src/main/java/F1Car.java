import java.util.ArrayList;

public abstract class F1Car extends MotorVehicle {
    protected ArrayList<String> possibleDrivers;
    protected String livery;
    protected int strategyTeamAbility;
    protected String currentDriver;

    public F1Car(String make, String model, int value) {
        super(make, model, value);
        this.licenseType = "SuperLicense";
    }

    public String activateDRS() {
        return "DRS Activating!";
    }

    public String boxBox() {
        return "Boxing!";
    }

    public void setPossibleDrivers(ArrayList<String> possibleDrivers) {
        this.possibleDrivers = possibleDrivers;
    }

    public void setLivery(String livery) {
        this.livery = livery;
    }

    public void setStrategyTeamAbility(int strategyTeamAbility) {
        this.strategyTeamAbility = strategyTeamAbility;
    }

    public ArrayList<String> getPossibleDrivers() {
        return possibleDrivers;
    }

    public String getLivery() {
        return livery;
    }

    public int getStrategyTeamAbility() {
        return strategyTeamAbility;
    }

    public String getCurrentDriver() {
        return this.currentDriver;
    }

    public void setCurrentDriver(String currentDriver) {
        this.currentDriver = currentDriver;
    }
}
