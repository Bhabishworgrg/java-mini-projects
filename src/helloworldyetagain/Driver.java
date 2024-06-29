package helloworldyetagain;

/**
 * Prints a welcome message by defining a method to return the message.
 */
public class Driver {
    /**
     * Main method that prints out a welcome message.
     */
    public static void main(String[] args) {
        MessageProvider messageProvider = new MessageProvider();    // Creates an instance of 'MessageProvider'
        System.out.println(messageProvider.getMessage());
    }
}