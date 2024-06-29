package integerinputchecker;

import java.util.Scanner;

/**
 * Handles printing of output.
 */
public class Printer {
    /**
     * Prints informing that the input is an integer.
     * 
     * @param integer The integer that is input by user.
     */
    public void printInteger(int integer) {
        System.out.printf("'%d' is an integer.", integer);
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
