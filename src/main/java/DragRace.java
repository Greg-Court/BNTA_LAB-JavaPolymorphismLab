import interfaces.Driveable;
import interfaces.Rideable;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class DragRace {
    private String name;
    private List<Driveable> cars;
    private List<Rideable> motorbikes;

    private List<MotorVehicle> vehicles;

    public DragRace(String name) {
        this.name = name;
        this.cars = new ArrayList<>();
        this.motorbikes = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }

    public void addCar (Driveable car) {
        this.cars.add(car);
    }

    public List<Driveable> getCars() {
        return this.cars;
    }

    public void addMotorbike (Rideable motorbike) {
        this.motorbikes.add(motorbike);
    }

    public List<Rideable> getMotorbikes() {
        return this.motorbikes;
    }

    public List<MotorVehicle> getVehicles() {
        return vehicles;
    }

    public void getReady() {
        for (Rideable motorbike : motorbikes) {
            vehicles.add((MotorVehicle) motorbike);
        }
        for (Driveable car: cars) {
            vehicles.add((MotorVehicle) car);
        }
    }
    public MotorVehicle getWinner(List<MotorVehicle> dragRaceVehicles) {
        MotorVehicle winner = dragRaceVehicles.get(0);
        for (int i = 1; i < dragRaceVehicles.size(); i++) {
            if (dragRaceVehicles.get(i).topSpeed > winner.topSpeed) {
                winner = dragRaceVehicles.get(i);
            }
        }
        return (MotorVehicle) winner;
    }


}
