import interfaces.Driveable;

public class Ferarri extends F1Car {
    public Ferarri(String make, String model, int value) {
        super(make, model, value);
        possibleDrivers.add("Carlos Sainz");
        possibleDrivers.add("Charles Legreg");
        strategyTeamAbility = 0;
    }
    @Override
    public String boxBox() {
        if (currentDriver == "Carlos Sainz") {
            return "No, I will box when I decide.";
       } else return "Boxing";
    }
    public String breakDown() {
        return "Catch fire";
    }

    public String disappointTifosi() {
        return "There's always next season...";
    }


    // overloading abstract method from F1Car.java
    public String accelerate() {
        return "Ferarri F1 Turbo V6 Engine Sounds";
    }
    public String accelerate(String justFerarriThings) {
        return "Ferarri F1 Turbo V6 Engine Sounds then... " + justFerarriThings ;
    }
}
