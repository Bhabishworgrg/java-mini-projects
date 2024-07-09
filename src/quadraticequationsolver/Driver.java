package quadraticequationsolver;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        Solver solver = new Solver();
        Scanner scanner = new Scanner(System.in);

        try {
            int[] input = ui.promptInteger(scanner);
            
            solver.setCoefficients(input);
            int determinant = solver.calculateDeterminant();
            int[] roots = solver.calculateRoots();

            if (determinant < 0) {
                ui.printNoRoot();
            } else if (determinant > 0) {
                ui.printRoots(roots);
            } else {
                ui.printRoot(roots[0]);
            }
        } catch(InputMismatchException e) {
            ui.printNotInteger(scanner);
        }

        scanner.close();
    }   
}
