package namegreeter;

import java.util.Scanner;                           // Imports Scanner class

/**
 * Asks for user's name and greets them.
 */
public class Driver {
    /**
     * Main method that declares two String variables and prints out a welcome message.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   // Creates a Scanner object

        System.out.print("What's your name? ");
        String name = scanner.nextLine();           // Prompts for an input with the user
        scanner.close();                            // Closes the Scanner object to free up the resources

        System.out.printf("Hello, %s. Welcome again to Java Mini Projects.\n", name);
    }    
}
