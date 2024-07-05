package integertypechecker;

import java.util.Scanner;

/**
 * Handles prompting the user to get an input.
 */
public class TypeChecker {
    /**
     * Gets an integer from the user.
     * 
     * @param scanner The Scanner object to take the input.
     * @return The integer that is input by user.
     */
    public int promptInteger(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        
        return integer;
    }

    /**
     * Checks if the integer is positive or not.
     * 
     * @param integer The user input integer.
     * @return true if the integer is positive.
     */
    public boolean checkPositive(int integer) {
        return integer > 0;     // Relational operator '>' that returns true if integer is greater than 0
    }

    /**
     * Checks if the integer is negative or not.
     * 
     * @param integer The user input integer.
     * @return true if the integer is negative.
     */
    public boolean checkNegative(int integer) {
        return integer < 0;     // Relational operator '<' that returns true if integer is less than 0
    }
}
