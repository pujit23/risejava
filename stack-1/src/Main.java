import java.util.Stack;

public class Main{
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements into stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after pushes: " + stack);

        // Peek (see top element without removing)
        System.out.println("Top element: " + stack.peek()); // 40

        // Pop elements (remove from top)
        System.out.println("Popped: " + stack.pop()); // 40
        System.out.println("Stack after pop: " + stack);

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Size of stack
        System.out.println("Size of stack: " + stack.size());
    }
}
