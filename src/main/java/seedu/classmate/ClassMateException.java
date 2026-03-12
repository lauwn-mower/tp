package seedu.classmate;

/**
 * Represents a custom exception used in ClassMate application.
 * Thrown when invalid input or application-specific errors happen.
 */
public class ClassMateException extends RuntimeException {
    public ClassMateException(String message) {
        super(message);
    }
}
