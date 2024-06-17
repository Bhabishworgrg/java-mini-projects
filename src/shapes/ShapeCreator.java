package shapes;

/**
 * Provides methods to create various shapes using asterisks(*).
 */
public class ShapeCreator {
    /**
     * Prints a diamond shape made of asterisks.
     * 
     * @param height The total height of the diamond to be created.
     */
    public void makeDiamond(int height) {
		int mid = (height + 1) / 2;												// The midpoint of the diamond shape

        // Handles creating of the diamond shape.
		for (int i = 1; i <= height; i++) {
			int numAsterisks = i <= mid ? (2 * i - 1) : (2 * (height - i) + 1);	// Calculates the number of asterisks to be printed in each row.

			int numSpaces = (height - numAsterisks) / 2;						// Number of spaces to be printed before the asterisks in each row.

			printChar(' ', numSpaces);										// Prints spaces in each row
            printChar('*', numAsterisks);									// Prints asterisks in each row
            System.out.println();												// Changes line to print next row
        }
    }

    /**
     * Prints a given character a specified number of times.
     * 
     * @param ch The character to print.
     * @param num The number of times to print the character.
     */
    private void printChar(char ch, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(ch);
        }
    }
}