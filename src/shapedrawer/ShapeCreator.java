package shapedrawer;


/**
 * Provides methods to create various shapes using asterisks(*).
 */
public class ShapeCreator {
    /**
     * Prints a square made of asterisks.
     * 
     * @param height The total height of the square to be created
     */
    public void makeSquare(int height) {
        // Loops till all rows of square are printed.
        for (int i = 0; i < height; i++) {
            printChar('*', height);                                           // Prints asterisks in each row.
            System.out.println();                                                // Changes line to print next row.
        }
    }


    /**
     * Prints a diamond shape made of asterisks.
     * 
     * @param height The total height of the diamond to be created.
     */
    public void makeDiamond(int height) {
		int mid = (height + 1) / 2;												// The midpoint of the diamond shape

        // Loops till all rows of diamond are printed.
		for (int i = 1; i <= height; i++) {
			int numAsterisks = i <= mid ? (2 * i - 1) : (2 * (height - i) + 1);	// The no of asterisks to be printed in each row
            int numSpaces = (height - numAsterisks) / 2;						// The no of spaces to be printed before the asterisks

			printChar(' ', numSpaces);										// Prints spaces in each row.
            printChar('*', numAsterisks);									// Prints asterisks in each row.
            System.out.println();												// Changes line to print next row.
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