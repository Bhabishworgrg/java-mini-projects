package quadraticequationsolver;

import java.util.Scanner;

/**
 * Handles printing of output.
 */
public class UserInterface {
    public int[] promptInteger(Scanner scanner) {
        int[] input = new int[3];
        System.out.print("Enter the coefficient of quadratic term (a): ");
        input[0] = scanner.nextInt();
        System.out.print("Enter the coefficient of linear term (b): ");
        input[1] = scanner.nextInt();
        System.out.print("Enter the constant term (c): ");
        input[2] = scanner.nextInt();
        return input;
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

    public void printNoRoot() {
        System.out.println("There are no natural roots for the equation.");
    }

    public void printRoots(int[] roots) {
        System.out.printf("The roots for the equation are %d and %d\n.", roots[0], roots[1]);
    }

    public void printRoot(int root) {
        System.out.printf("The root for the equation is %d\n.", root);
    }
}
