package seedu.classmate;

/**
 * Parses user input into a {@code Command} object.
 * The parser separates the command word from its arguments (e.g. module code / specialisation name)
 * so that the main program can execute the command accordingly
 */
public class Parser {

    /**
     * Parses the given user input and returns the corresponding {@code Command}.
     * @param input Raw input by user.
     * @return A {@code Command} object containing the command word and its arguments.
     * @throws ClassMateException For empty inputs.
     */
    public static Command parse(String input) {

        String trimmed = input.trim();

        if (trimmed.isEmpty()) {
            throw new ClassMateException("Please enter a non-empty input!");
        }

        if (trimmed.equals("view grad req")) {
            return new Command("viewGradReq", "");
        }

        String[] parts = trimmed.split("\\s+", 2);

        String commandWord = parts[0].toLowerCase();
        String args = parts.length > 1 ? parts[1] : "";

        return new Command(commandWord, args);
    }
}
