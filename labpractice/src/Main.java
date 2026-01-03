import java.util.Scanner;
class TextEditor {
    static final int MAX_TEXT_LENGTH = 100;
    static char[] textStack = new char[MAX_TEXT_LENGTH];
    static int stackTop = -1;
    // Initialize the stack
    public static void initialize() {
        stackTop = -1;
    }
    // Check if the stack is full
    public static boolean isFull() {
        return stackTop == MAX_TEXT_LENGTH - 1;
    }

    // Check if the stack is empty
    public static boolean isEmpty() {
        return stackTop == -1;
    }

    // Push a character onto the stack
    public static void pushCharacter(char value) {
        if (!isFull()) {
            textStack[++stackTop] = value;
            System.out.println("Typed character: " + value);
        }
    }

    // Pop a character from the stack
    public static void popCharacter() {
        if (!isEmpty()) {
            char removed = textStack[stackTop--];
            System.out.println("Undo: Removed character " + removed);
        } else {
            System.out.println("Text editor buffer is empty. Nothing to undo.");
        }
    }

    // View the current text
    public static void view() {
        if (isEmpty()) {
            System.out.println("Text editor buffer is empty.");
        } else {
            System.out.print("Current text: ");
            for (int i = stackTop; i >= 0; i--) {
                System.out.print(textStack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        char input;

        initialize();

        while (true) {

            if (!scanner.hasNextInt()) {
                scanner.next(); // discard invalid input
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    input = scanner.next().charAt(0);
                    pushCharacter(input);
                    break;
                case 2:
                    popCharacter();
                    break;
                case 3:
                    view();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}