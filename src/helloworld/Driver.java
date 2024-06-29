package helloworld;

/**
 * Prints a welcome message using different methods of output.
 */
public class Driver {
    /**
     * Main method that declares two String variables and prints out a welcome message.
     * 
     * @param args The array of command-line arguments(unused).
     */
    public static void main(String[] args) {
        String text1= "Mini";
        String text2 = "Projects";

        System.out.println("Hello, World!");    // Prints followed by a newline.
        System.out.print("Welcome ");           // Prints without a newline.
        System.out.print("to " + "Java ");        // Concatenates and prints.
        System.out.print(text1);                  // Prints value of variable 'text1'.
        System.out.printf(" %s.\n", text2);// Uses Print Formatted method to print.
    }    
}
