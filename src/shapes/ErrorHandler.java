package shapes;

/**
 * Provides methods to handle errors in the application.
 */
public class ErrorHandler {
    private String shape;

    /**
     * Prints an error message in red color to the standard error stream.
     * 
     * @param error The error message to be printed.
     */
    public void printError(String error) {
        System.err.println("\u001B[31m" + error + "\u001B[0m");
    }

    public void validateShape(String shape) throws InvalidShapeException{
        this.shape = shape;

        if (!(shape.equals("diamond") || shape.equals("square"))) {
            throw new InvalidShapeException();
        }
    }

    /**
     * Checks if the provided height is valid for creating the diamond shape.
     * Throws InvalidSizeException if the height is not a positive odd number.
     * 
     * @param height The height of the diamond shape.
     * @throws InvalidSizeException If the height is even or negative.
     */
    public void validateHeight(int height) throws InvalidHeightException {
        if (shape.equals("diamond") && (height % 2 == 0 || height < 0)) {
            throw new InvalidHeightException();
        } else if (shape.equals("square") && height <= 0) {
            throw new InvalidHeightException();
        }
    }
}
