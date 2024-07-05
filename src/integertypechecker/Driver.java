package integertypechecker;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Checks whether the input is integer or not.
 */
public class Driver {
    /**
     * Main method that checks for InputMismatchException to determine whether the input is integer or not.
     * 
     * @param args The array of command-line arguments(unused).
     */
    public static void main(String[] args) {
        OutputPrinter printer = new OutputPrinter();
        TypeChecker checker = new TypeChecker();
        Scanner scanner = new Scanner(System.in);

        try {
            int integer = checker.promptInteger(scanner);

            // If.. else if.. else statement to check the type of integer
            if (checker.checkPositive(integer)) {
                printer.printPositive(integer);
            } else if (checker.checkNegative(integer)) {
                printer.printNegative(integer);
            } else {
                printer.printZero();
            }
        } catch(InputMismatchException e) {
            printer.printNotInteger(scanner);
        }

        scanner.close();
    }   
}
