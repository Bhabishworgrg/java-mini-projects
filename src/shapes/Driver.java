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


        try (Scanner scanner = new Scanner(System.in)){
            // Prompts the user to enter the height of the diamond.
            System.out.print("Enter a height: ");
            int height = scanner.nextInt();

            errorHandler.checkHeight(height);           // Validates the height value using ErrorHandler.

            shapeCreator.makeDiamond(height);           // Creates and prints the diamond shape using ShapeCreator.
        } catch (InputMismatchException e) {
            // Prints error when height is non-integer.
            errorHandler.printError("The input you have provided is not an integer. Please provide an integer.");
        } catch (InvalidSizeException e) {
            // Prints error when height is of invalid value.
            errorHandler.printError("A diamond shape of that height can not be made. Please try a valid height.");
        }
    }
}