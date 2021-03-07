import java.util.Scanner;

public class SmmIceberg {
    private static final String EXIT_COMMAND = "0";
    private static final String ORDER_COMMAND = "1";
    private static final String BOOK_COMMAND = "2";

    private final Scanner scanner = new Scanner(System.in);

    private final Book book = new Book();

    public void start() {
        handleMenuConsole();
    }

    private void handleMenuConsole() {
        String command;
        do {
            System.out.println("\nInput '" + ORDER_COMMAND + "' to put your order, '" + BOOK_COMMAND + "' to view the book or '" + EXIT_COMMAND + "' to exit the program");
            command = scanner.nextLine();
            switch (command) {
                case ORDER_COMMAND:
                    handleOrder();
                    break;
                case BOOK_COMMAND:
                    printBook();
                    break;
                case EXIT_COMMAND:
                    return;
                default:
                    System.out.println("Incorrect command. Please, try again.");
            }
        } while (true);
    }

    private void handleOrder() {
        System.out.println("Please, put your order:");
        String orderLine = scanner.nextLine();

    }

    private void printBook() {
        System.out.println("Here is the book:\n" + book);
    }

    public static void main(String[] args) {
        System.out.println("Program SmmIceberg started");

        SmmIceberg program = new SmmIceberg();
        program.start();
    }

}
