import java.util.ArrayList;

public class Showroom {
    private ArrayList<MotorVehicle> vehicles;

    // Constructor

    public Showroom() {
        this.vehicles = new ArrayList<>();

    }
    
    public void addVehicle(MotorVehicle vehicle) {
        vehicles.add(vehicle);
    }
    public int sumVehiclesQuantity() {
        return vehicles.size();
    }
    public int sumVehiclesValue() {
        int sum = 0;
        for (MotorVehicle vehicle : vehicles) {
            sum += vehicle.value;
        }
        return sum;
    }
}
