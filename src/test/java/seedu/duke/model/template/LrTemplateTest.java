package seedu.duke.model.template;

import org.junit.jupiter.api.Test;
import seedu.duke.DukeException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LrTemplateTest {
    public static final double DELTA = 5;

    @Test
    void calcImpedance_zeroInductance_expectException() {
        LrTemplate t = new LrTemplate();
        assertThrows(AssertionError.class, t::calcImpedance);
    }

    @Test
    void calcImpedance_lRValuesEqualOne_returnsDouble() throws DukeException {
        LrTemplate t = new LrTemplate(1,1,1);
        double impedance = Math.sqrt(Math.pow(1, 2)
                + (1 / Math.pow((t.ANGULAR_FREQUENCY * 1), 2)));
        assertEquals(impedance, t.calcImpedance(), DELTA);
    }

    @Test
    void setComponent_lRValuesEqualOne_setCapacitorValue() {
        LrTemplate t = new LrTemplate();
        t.setComponent("l", 5);
        assertEquals(5, t.getInductor().getValue(), DELTA);
    }

    @Test
    void getCurrent_lRValuesEqualOne_returnsDouble() throws DukeException {
        LrTemplate t = new LrTemplate(1,1,1);
        double current = 1 / t.calcImpedance();
        assertEquals(current, t.getCurrent());
    }

    @Test
    void getPower_lRValuesEqualOne_returnsDouble() throws DukeException {
        LrTemplate t = new LrTemplate(1,1,1);
        double power = 1 * 1 / t.calcImpedance();
        assertEquals(power, t.getPower());
    }

}