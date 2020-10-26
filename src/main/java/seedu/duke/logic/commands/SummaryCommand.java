package seedu.duke.logic.commands;

public class SummaryCommand extends Command {
    public static final String COMMAND_WORD = "summary";
    private static final String COMMAND_SUMMARY = "\n"
            + "+-----------+----------------------------+--------------------+\n"
            + "|  Action   |           Format           |      Examples      |\n"
            + "+-----------+----------------------------+--------------------+\n"
            + "| Summary   | summary                    | summary            |\n"
            + "| Tutorial  | tutorial MODE              | tutorial boolean   |\n"
            + "| Template  | template TEMPLATE          | template rc        |\n"
            + "| Set       | set COMPONENT VALUE        | set r 500          |\n"
            + "| Add       | add CONFIG COMPONENT VALUE | add parallel c 500 |\n"
            + "| Calculate | calc EFF_VALUE             | calc ceff          |\n"
            + "+-----------+----------------------------+--------------------+\n";

    public SummaryCommand() {
        super();
    }

    @Override
    public void execute() {
    }

    /**
     * String representation of the Command.
     *
     * @return String representation.
     */
    @Override
    public String toString() {
        return COMMAND_SUMMARY;
    }
}
