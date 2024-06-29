package namegreeter;

/**
 * Asks for user's name and greets them.
 */
public class Driver {
    /**
     * Main method that gets user's name and welcomes them.
     * 
     * @param args The array of command-line arguments(unused).
     */
    public static void main(String[] args) {
        NamePrompter namePrompter = new NamePrompter();

        String name = namePrompter.getName();

        System.out.printf("Hello, %s. Welcome again to Java Mini Projects.\n", name);
    }
}