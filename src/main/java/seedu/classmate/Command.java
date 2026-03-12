package seedu.classmate;

/**
 * Represents a use command parsed from input.
 * Stores the command word and corresponding arguments.
 */
public class Command {

    private String commandWord;
    private String args;

    /**
     * Constructs a {@code Command} with the specified command word and arguments.
     *
     * @param commandWord The main command keyword entered by the user.
     * @param args The arguments associated with the command.
     */
    public Command(String commandWord, String args) {
        this.commandWord = commandWord;
        this.args = args;
    }

    /**
     * Returns the command word of this command.
     *
     * @return The command word.
     */
    public String getCommandWord() {
        return commandWord;
    }

    /**
     * Returns the arguments associated with the command.
     *
     * @return The command arguments as a string.
     */
    public String getArgs() {
        return args;
    }
}
