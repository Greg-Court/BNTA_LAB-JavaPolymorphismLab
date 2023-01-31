import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FerarriTest {

    Ferarri ferarri;

    @BeforeEach
    void setUp() {
        ferarri = new Ferarri("Ferarri", "SF22", 12000000);
        ferarri.setCurrentDriver("Carlos Sainz");
        ferarri.setMaximumOccupancy(1);
        ferarri.setStrategyTeamAbility(0);
        ferarri.setLivery("Rosso Corsa");
        ferarri.setCurrentDriver("Carlos Sainz");
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
    void canGetDriver() {
        assertThat(ferarri.getCurrentDriver()).isEqualTo("Carlos Sainz");
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
    void canAccelerate() {
        assertThat(ferarri.accelerate()).isEqualTo("Vroom vroom");
    }

    @Test
    void checkCarlosSainzIsFerarriStrategyTeam() {
        assertThat(ferarri.boxBox()).isEqualTo("No, I will box when I decide.");
    }

    @Test
    void checkFerarriIsAFerarri() {
        assertThat(ferarri.breakDown()).isEqualTo("Engine failure");
    }

    @Test
    void checkFerarriFansAreTifosi() {
        assertThat(ferarri.disappointTifosi()).isEqualTo("There's always next season...");
    }

}
