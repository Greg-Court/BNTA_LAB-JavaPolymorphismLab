import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FerarriTest {

    Ferarri ferarri;

    @BeforeEach
    void setUp() {
        ferarri = new Ferarri("Ferarri", "SF22", 12000000);
        ferarri.setLivery("Rosso Corsa");
    }
    @Test
    void checkDRS() {
        assertThat(ferarri.activateDRS()).isEqualTo("DRS Activating!");
    }
    @Test
    void canGetMake() {
        assertThat(ferarri.make).isEqualTo("Ferarri");
    }
    @Test
    void canGetModel() {
        assertThat(ferarri.model).isEqualTo("SF22");
    }
    @Test
    void canGetValue() {
        assertThat(ferarri.getValue()).isEqualTo(12000000);
    }
    @Test
    void canGetMaximumOccupancy() {
        assertThat(ferarri.maximumOccupancy).isEqualTo(1);
    }

    @Test
    void canGetStrategyTeamAbility() {
        assertThat(ferarri.strategyTeamAbility).isEqualTo(0);
    }

    @Test
    void canGetLivery() {
        assertThat(ferarri.getLivery()).isEqualTo("Rosso Corsa");
    }

    @Test
    void checkCarlosSainzIsFerarriStrategyTeam() {
        ferarri.setCurrentDriver(ferarri.possibleDrivers.get(0));
        assertThat(ferarri.boxBox()).isEqualTo("No, I will box when I decide.");
    }
    @Test
    void checkFerarriIsAFerarri() {
        assertThat(ferarri.breakDown()).isEqualTo("Catch fire");
    }

    @Test
    void checkFerarriFansAreTifosi() {
        assertThat(ferarri.disappointTifosi()).isEqualTo("There's always next season...");
    }
    @Test
    void checkGetLicenseType() {
        assertThat(ferarri.getLicenseType()).isEqualTo("Super License");
    }

    @Test
    void checkAccelerate__noArgument() {
        assertThat(ferarri.accelerate()).isEqualTo("Ferarri F1 Turbo V6 Engine Sounds");
    }
    @Test
    void checkAccelerate__withArgument() {
        String justFerarriThings = "Engine Failure.";
        assertThat(ferarri.accelerate(justFerarriThings)).isEqualTo("Ferarri F1 Turbo V6 Engine Sounds then... Engine Failure.");
    }

    @Test
    void canDrive() {
        assertThat(ferarri.drive(220)).isEqualTo("Reached a speed of 220");
    }
}
