package shapes;

/**
 * Provides methods to handle errors in the application.
 */
public class ErrorHandler {
    private String shape;   // The shape to be created
    private int height;     // The height of the shape


    /**
     * Prints an error message in red color to the standard error stream.
     * 
     * @param error The error message to be printed.
     */
    public void printError(String error) {
        System.err.println("\u001B[31m" + error + "\u001B[0m");
    }


    /**
     * Validates the provided shape for creating the shape.
     * Throws an {@link shapes.InvalidShapeException} if the shape is not valid.
     * 
     * @param shape The shape to be validated.
     * @throws InvalidShapeException If the shape is invalid.
     */
    public void validateShape(String shape) throws InvalidShapeException{
        this.shape = shape;

        if (!isValidShape()) {
            throw new InvalidShapeException();
        }
    }


    /**
     * Validates the provided height for creating the shape.
     * Throws an {@link shapes.InvalidHeightException} if the height is not valid.
     * 
     * @param height The height of the shape.
     * @throws InvalidHeightException If the height is invalid.
     */
    public void validateHeight(int height) throws InvalidHeightException {
        this.height = height;

        if (!isValidHeight()) {
            throw new InvalidHeightException();
        }
    }


    /**
     * Checks if the shape is either "diamond" or "square".
     * 
     * @return true if the shape is valid for creation, false otherwise.
     */
    private boolean isValidShape(){
        return shape.equals("diamond") || shape.equals("square");
    }


    /**
     * Checks if the height meets specific criteria for different shapes.
     * 
     * @return true if the height is valid for the shape, false otherwise.
     */
    private boolean isValidHeight(){
        switch (shape) {
            case "diamond":
                return !(height % 2 == 0 || height < 0);
            case "square":
                return !(height <= 0);
            default:
                return true;
        }
    }
}
