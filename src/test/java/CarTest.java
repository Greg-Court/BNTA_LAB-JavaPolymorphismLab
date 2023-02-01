import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    void setUp() {
        car = new Car("BMW", "3 Series",3000);
        car.setHasAirCon(true);
        car.hasIndicators = false;
        car.setMaximumOccupancy(5);
    }

    @Test
    void checkIndicatorsOverwritten() {
        assertThat(car.hasIndicators).isEqualTo(false);
    }

    @Test
    void checkCanGetAirCon() {
        assertThat(car.hasAirCon).isEqualTo(true);
    }

    @Test
    void checkCarValue() {
        assertThat(car.value).isEqualTo(3000);
    }

    @Test
    void checkMaxOccupancy() {
        assertThat(car.maximumOccupancy).isEqualTo(5);
    }

    @Test
    void checkAccelerate() {
        assertThat(car.accelerate()).isEqualTo("Road car engine sounds");
    }

    @Test
    void canDrive() {
        assertThat(car.drive(200)).isEqualTo("Reached a speed of 200");
    }
}
