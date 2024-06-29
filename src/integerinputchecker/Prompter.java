package integerinputchecker;

import java.util.Scanner;

/**
 * Handles prompting the user to get an input.
 */
public class Prompter {
    /**
     * Gets an integer from the user.
     * 
     * @param scanner The Scanner object to take the input.
     * @return The integer that is input by user.
     */
    public int getInteger(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        
        return integer;
    }
}
