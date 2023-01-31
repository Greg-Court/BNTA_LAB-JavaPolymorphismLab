import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DragRaceTest {

    DragRace dragRace;
    Car car;
    Motorbike motorbike;
    Ferarri F1Car1;
    RedBull F1Car2;

    @BeforeEach
    public void setUp() {
        dragRace = new DragRace("CarWOW Race");
        car = new Car("Koenigsegg", "Jesko Absolut", 3000000);
        motorbike = new Motorbike("Kawasaki", "Ninja ZX-14R Supersport", 20000);
        F1Car1 = new Ferarri("Ferarri", "SF22", 12000000);
        F1Car2 = new RedBull("RedBull", "RB18", 15000000);
        dragRace.addCar(car);
        car.setTopSpeed(310);
        dragRace.addMotorbike(motorbike);
        motorbike.setTopSpeed(249);
        dragRace.addCar(F1Car1);
        F1Car1.setTopSpeed(220);
        dragRace.addCar(F1Car2);
        F1Car2.setTopSpeed(228);

    }

    @Test
    public void canAddAllVehiclesToDragRace() {
        assertThat(dragRace.getCars().size() + dragRace.getMotorbikes().size()).isEqualTo(4);
    }

    @Test
    public void canGetReady() {
        dragRace.getReady();
        assertThat(dragRace.getVehicles().size()).isEqualTo(4);
    }

    @Test
    public void canGetWinner() {
        dragRace.getReady();
        List<MotorVehicle> startingLine = dragRace.getVehicles();
        MotorVehicle winner = dragRace.getWinner(startingLine);
        assertThat(winner).isEqualTo(car);
        System.out.println("The winner is the " + winner.make + " " + winner.model + "!");
    }

}
