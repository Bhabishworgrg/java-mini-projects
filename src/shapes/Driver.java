package shapes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Contains the main method to drive the ShapeCreator application.
 * It handles user input for the height of a diamond shape and prints it.
 */
public class Driver {
    /**
     * Main method to run the diamond shape creation application.
     * 
     * @param args The command line arguments (not used).
     */
    public static void main(String[] args) {
        // Creates instances of ShapeCreator and ErrorHandler.
        ShapeCreator shapeCreator = new ShapeCreator();
        ErrorHandler errorHandler = new ErrorHandler();
        Scanner scanner = new Scanner(System.in);

        String shape = "";
        int height = 0;

        try {
            // Prompts the user to enter the required shape.
            System.out.print("Enter a shape: ");
            shape = scanner.nextLine().toLowerCase().strip();
            errorHandler.validateShape(shape);

            // Prompts the user to enter the height of the diamond.
            System.out.print("Enter a height: ");
            height = scanner.nextInt();
            errorHandler.validateHeight(height); // Validates the height value using ErrorHandler.

            switch (shape) {
                case "diamond":
                    shapeCreator.makeDiamond(height);           // Creates and prints the diamond shape using ShapeCreator.                    
                    break;
                case "square":
                    shapeCreator.makeSquare(height);
            }

        } catch (InputMismatchException e) {
            // Prints error when height is non-integer.
            String invalidInput = scanner.next();
            errorHandler.printError("'" + invalidInput + "' is not an integer. Please provide an integer.");
        } catch (InvalidHeightException e) {
            // Prints error when height is of invalid value.
            errorHandler.printError("A " + shape + " shape of height " + height + " can not be made. Please try a valid height.");
        } catch (InvalidShapeException e) {
            errorHandler.printError("Invalid Shape");
        }
    }
}