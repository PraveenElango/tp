package seedu.duke.model.template;

import seedu.duke.DukeException;
import seedu.duke.model.component.LoadComponent;
import seedu.duke.model.component.Resistor;

public class RTemplate extends CircuitTemplate {
    private static final String R_TEMPLATE =
              "\t+---R---------+\n"
            + "\t|             |\n"
            + "\t|             |\n"
            + "\t+----+V_ac+---+\n";
    protected Resistor resistor;

    public RTemplate(double resistance, double powerSupply) {
        super(powerSupply);
        resistor = new Resistor(resistance);
    }

    public RTemplate() {
        this(0,0);
    }

    /**
     * Returns impedance of Resistor.
     *
     * @return impedance of Resistor.
     * @throws DukeException If component values are not yet set.
     */
    @Override
    public double calcImpedance() throws DukeException {
        if (resistor.getValue() == 0) {
            throw new DukeException("Component(s) not set yet.");
        }
        return resistor.getValue();
    }

    /**
     * Returns resistor object, an attribute of the instance of LrTemplate.
     *
     * @return resistor, an instance of the Resistor class.
     */
    public Resistor getResistor() {
        return resistor;
    }

    /**
     * Sets the value of the resistor in the circuit to the value specified.
     *
     * @param value double type value to be set to the resistor in the circuit.
     */
    protected void setResistor(double value) {
        resistor.setValue(value);
    }

    /**
     * Sets the value of the resistor in the circuit to the value specified.
     *
     * @param s String corresponding to component type.
     * @param value double type value to be set to the resistor in the circuit.
     */
    @Override
    public void setComponent(String s, double value) {
        setResistor(value);
    }

    /**
     * Returns String consisting of total inductance and resistance values of the LrTemplate object.
     *
     * @return String representation of LrTemplate object.
     */
    @Override
    public String toString() {
        return R_TEMPLATE
                + "Current Voltage: " + initialPowerSupply + System.lineSeparator()
                + "Total Resistance: " + resistor + System.lineSeparator();
    }


    /**
     * Returns LoadComponent object depending on input String.
     *
     * @param component String representing the component.
     * @return LoadComponent object.
     * @throws DukeException If input String does not match a component.
     */
    @Override
    public LoadComponent getComponent(String component) throws DukeException {
        if (!component.equals("r")) {
            throw new DukeException("Invalid component");
        }
        return getResistor();
    }
}

