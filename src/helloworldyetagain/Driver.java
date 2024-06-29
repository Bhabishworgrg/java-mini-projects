package helloworldyetagain;

/**
 * Prints a welcome message by defining a method to return the message.
 */
public class Driver {
    /**
     * Main method that prints out a welcome message.
     * 
     * @param args The array of command-line arguments(unused).
     */
    public static void main(String[] args) {
        MessageProvider messageProvider = new MessageProvider();    // Creates an instance of 'MessageProvider'.
        System.out.println(messageProvider.getMessage());
    }
}