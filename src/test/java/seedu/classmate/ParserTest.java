package seedu.classmate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Contains unit tests for the Parser class.
 * Tests whether user input is correctly parsed into Command objects,
 * such as valid commands and invalid or empty inputs.
 */
class ParserTest {

    @Test
    public void parse_helpCommand_returnsHelpCommand() {
        Command command = Parser.parse("help");

        assertEquals("help", command.getCommandWord());
    }

    @Test
    public void parse_prereqCommand_returnsModuleCode() {
        Command command = Parser.parse("prereq CS2113");

        assertEquals("prereq", command.getCommandWord());
        assertEquals("CS2113", command.getArgs());
    }

    @Test
    public void parse_emptyInput_throwsException() {
        assertThrows(ClassMateException.class, () -> Parser.parse(""));
    }
}
