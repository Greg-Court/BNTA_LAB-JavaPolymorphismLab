import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShowroomTest {

    Showroom myShowroom;
    Car myCar;
    Motorbike myMotorbike;

    F1Car myRedBull;

    F1Car myFerarri;
    @BeforeEach
    void setUp() {
        myCar = new Car("BMW", "3 Series", 5000);
        myMotorbike = new Motorbike("BMW", "S 1000 RR", 15000);
        myRedBull = new RedBull("RedBull", "RB18", 15000000);
        myFerarri = new Ferarri("Ferarri", "SF22", 12000000);
        myShowroom.addVehicle(myCar);
        myShowroom.addVehicle(myCar);
        myShowroom.addVehicle(myCar);
        myShowroom.addVehicle(myCar);
    }

    @Test
    void checkQuantity() {
        assertThat(myShowroom.sumVehiclesQuantity()).isEqualTo(4);
    }

    @Test
    void checkValue() {
        assertThat(myShowroom.sumVehiclesValue()).isEqualTo(27020000);
    }

}
