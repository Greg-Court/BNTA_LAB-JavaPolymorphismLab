public class Ferarri extends F1Car {
    public Ferarri(String make, String model, int value) {
        super(make, model, value);
    }
    @Override
    public String boxBox() {
        if (currentDriver == "Carlos Sainz") {
            return "No, I will box when I decide.";
       } else return "Boxing";
    }
    public String breakDown() {
        return "Engine failure";
    }

    public String disappointTifosi() {
        return "There's always next season...";
    }

}
