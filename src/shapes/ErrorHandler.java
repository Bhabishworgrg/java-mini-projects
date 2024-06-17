package shapes;

/**
 * Provides methods to handle errors in the application.
 */
public class ErrorHandler {
    /**
     * Prints an error message in red color to the standard error stream.
     * 
     * @param error The error message to be printed.
     */
    public void printError(String error) {
        System.err.println("\u001B[31m" + error + "\u001B[0m");
    }

    /**
     * Checks if the provided height is valid for creating the diamond shape.
     * Throws InvalidSizeException if the height is not a positive odd number.
     * 
     * @param height The height of the diamond shape.
     * @throws InvalidSizeException If the height is even or negative.
     */
    public void checkHeight(int height) throws InvalidSizeException {
        if (height % 2 == 0 || height < 0) {
            throw new InvalidSizeException();
        }
    }
}
