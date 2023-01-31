import interfaces.Driveable;

public class RedBull extends F1Car {

    public RedBull(String make, String model, int value) {
        super(make, model, value);
        possibleDrivers.add("Max Verstappen");
        possibleDrivers.add("Sergio Perez");
    }
    @Override
    public String activateDRS() {
        if (currentDriver == "Max Verstappen") {
            return "DRS Stuck!";
        } else return "DRS Activating!";
    }

    public String winChampionship() {
        return "Max Verstappen, Champion of the World!";
    }

    public String exceedBudgetCap() {
        return "It was only £1.8m...";
    }

    public String accelerate() {
        return "Overtakes Ferarri";
    }



}
