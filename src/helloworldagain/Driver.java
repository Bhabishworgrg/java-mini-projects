package helloworldagain;

/**
 * Prints a welcome message by defining a method to return the message.
 */
public class Driver {
    /**
     * Main method that prints out a welcome message.
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(getMessage());    // Prints the string returned from 'getMessage()'
    }    

    /**
     * Returns the welcome message.
     * 
     * @return The welcome message.
     */
    public static String getMessage() {
        String message = "Hello, World!\nWelcome again to Java Mini Projects.";
        return message;
    }
}
