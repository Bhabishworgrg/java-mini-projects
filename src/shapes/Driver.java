package shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Contains the main method to drive the ShapeCreator application.
 * It handles user input for the height of a diamond shape and prints it.
 */
public class Driver {
    private static String shape = "";
    private static int height = 0;

    
    /**
     * Main method to run the diamond shape creation application.
     * 
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ErrorHandler errorHandler = new ErrorHandler();

        try {
            // Prompts to enter the required shape.
            shape = getValidShape(scanner, errorHandler);

            // Prompts to enter the height of the shape.
            height = getValidHeight(scanner, errorHandler);

            // Creates the shape based on the provided input.
            createShape();
            
        } catch (InputMismatchException e) {
            // Prints error when height is non-integer.
            errorHandler.printError("'" + scanner.nextLine() + "' is not an integer. Please provide an integer.");
        } catch (InvalidShapeException e) {
            // Prints error when shape is invalid.
            errorHandler.printError("A " + shape + " shape can not be made. Please provide a valid shape.");
        } catch (InvalidHeightException e) {
            // Prints error when height is of invalid value.
            errorHandler.printError("A " + shape + " shape of height " + height + " can not be made. Please provide a valid height.");
        } finally {
            scanner.close();
        }
    }


    /**
     * Prompts the user to enter a shape, validates the input, and returns the shape in lowercase.
     * 
     * @param scanner A Scanner object to read the shape input (diamond/square).
     * @param errorHandler An ErrorHandler object to validate the shape input.
     * @return The shape entered by the user after validating it.
     * @throws InvalidShapeException If the shape is not valid.
     */
    private static String getValidShape(Scanner scanner, ErrorHandler errorHandler) throws InvalidShapeException {
        System.out.print("Enter a shape(diamond/square): ");
        shape = scanner.nextLine().toLowerCase().strip();
        errorHandler.validateShape(shape);
        
        return shape;
    }


    /**
     * Prompts the user to enter a height, validates the input, and returns the height.
     * 
     * @param scanner A Scanner object to read the height input.
     * @param errorHandler An ErrorHandler object to validate the height input.
     * @return The height entered by the user after validating it.
     * @throws InvalidHeightException If the height is not valid.
     */
    private static int getValidHeight(Scanner scanner, ErrorHandler errorHandler) throws InvalidHeightException {
        System.out.print("Enter a height: ");
        height = scanner.nextInt();
        errorHandler.validateHeight(height);

        return height;
    }


    /**
     * Uses a `ShapeCreator` object to create either a diamond or a square shape of the provided height.
     */
    private static void createShape() {
        ShapeCreator shapeCreator = new ShapeCreator();
        
        switch (shape) {
            case "diamond":
                shapeCreator.makeDiamond(height);
                break;
            case "square":
                shapeCreator.makeSquare(height);
                break;
        }
    }
}