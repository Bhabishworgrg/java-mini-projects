package integerinputchecker;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Checks whether the input is integer or not.
 */
public class Driver {
    /**
     * Main method that checks for InputMismatchException to determine whether the input is integer or not.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Printer printer = new Printer();
        Prompter prompter = new Prompter();
        Scanner scanner = new Scanner(System.in);

        // Handles exception that might occur from getting integer.
        try {
            int integer = prompter.getInteger(scanner);
            printer.printInteger(integer);      // Prints if input is an integer.
        } catch(InputMismatchException e) {
            printer.printNotInteger(scanner);   // Prints if input is not an integer.
        }

        scanner.close();
    }   
}
