package quadraticequationsolver;

public class Solver {
    private int a, b, c, determinant;

    public void setCoefficients(int[] input) {
        a = input[0];
        b = input[1];
        c = input[2];
    }

    public int calculateDeterminant() {
        determinant = (b * b) - (4 * a * c);
        return determinant;
    }

    public int[] calculateRoots() {
        int[] roots = new int[2];
        roots[0] = (- b + determinant) / 2 * a;
        roots[1] = (- b - determinant) / 2 * a;
        return roots;
    }
}
