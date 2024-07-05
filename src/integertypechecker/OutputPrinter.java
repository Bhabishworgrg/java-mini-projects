package integertypechecker;

import java.util.Scanner;

/**
 * Handles printing of output.
 */
public class OutputPrinter {
    /**
     * Prints informing that the integer is zero.
     */
    public void printZero() {
        System.out.print("The integer is zero.");
    }

    /**
     * Prints informing that the integer is positive.
     */
    public void printPositive(int integer) {
        System.out.printf("'%d' is a positive integer.", integer);
    }

    /**
     * Prints informing that the integer is negative.
     */
    public void printNegative(int integer) {
        System.out.printf("'%d' is a negative integer.", integer);
    }

    /**
     * Prints informing that the input is not an integer.
     * 
     * @param scanner The Scanner object used to take input.
     */
    public void printNotInteger(Scanner scanner) {
        String nonInteger = scanner.nextLine();
        System.out.printf("'%s' is not an integer.", nonInteger);
    }
}
