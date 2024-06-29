package namegreeter;

import java.util.Scanner;                           // Imports Scanner class.

/**
 * Provides a method to get name from the user.
 */
public class NamePrompter {
    /**
     * Prompts for name from the user and returns it.
     * 
     * @return The user's name.
     */
    public String getName() {
        Scanner scanner = new Scanner(System.in);   // Creates a Scanner object.

        System.out.print("What's your name? ");
        String name = scanner.nextLine();           // Prompts for name from the user.
        scanner.close();                            // Closes the Scanner object to free up the resources.

        return name;
    }
}
