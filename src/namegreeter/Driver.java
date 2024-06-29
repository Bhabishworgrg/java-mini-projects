package namegreeter;

/**
 * Asks for user's name and greets them.
 */
public class Driver {
    /**
     * Main method that declares two String variables and prints out a welcome message.
     * 
     * @param args
     */
    public static void main(String[] args) {
        NamePrompter namePrompter = new NamePrompter();

        String name = namePrompter.getName();

        System.out.printf("Hello, %s. Welcome again to Java Mini Projects.\n", name);
    }
}