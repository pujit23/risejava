/*import java.util.*;
class Main{
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        char[] stack = new char[100];
        int top = -1;

        while (sc.hasNext()) {
            int choice = sc.nextInt();
            if (choice == 1) {
                char ch = sc.next().charAt(0);
                stack[++top] = ch;
                System.out.println("Typed character:" + ch + " ");
            } else if (choice == 2) {
                if (top == -1)
                    System.out.print("Text editor buffer is empty.Nothing to undo.");
                else {
                    System.out.print("Undo: Removed character" + stack[top--] + "");
                }
            } else if (choice == 3) {
                if (top == -1)
                    System.out.print("Text editor buffer is empty.");
                else {
                    System.out.println("current Text:");
                    for (int i = top; i >= 0; i--)
                        System.out.println(stack[i] + " ");
                }
            } else if (choice == 4) {
                break;
            } else {
                System.out.print("Invalid choice");

            }
        }
    }*/

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer>stack = new Stack<>();
        for ( int i = 0;i<n;i++){
            stack.push(sc.nextInt());
        }
        int min = Collections.min(stack);
        System.out.println("Minimum element in the stack:"+ min );
        int popped = stack.pop();
        System.out.println("Popped element:"+popped);

        if (!stack.isEmpty()) {
            int minafterPop = Collections.min(stack);
            System.out.println("Minimum element in the stack after popping" + minafterPop);

        }
    }
}*/
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] stack = new int[100];
        int top = -1;

        while (sc.hasNext()) {
            int choice = sc.nextInt();

            if (choice == 1) {  // Push
                int x = sc.nextInt();
                stack[++top] = x;
                System.out.print("Item " + x + " is pushed onto the shelf ");
            }
            else if (choice == 2) {  // Pop
                if (top == -1)
                    System.out.print("No items in the shelf ");
                else
                    System.out.print("Item " + stack[top--] + " is popped from the shelf ");
            }
            else if (choice == 3) {  // Display
                if (top == -1)
                    System.out.print("Shelf is empty ");
                else {
                    System.out.print("Items in the shelf: ");
                    for (int i = 0; i <= top; i++)
                        System.out.print(stack[i] + " ");
                }
            }
            else if (choice == 4) { // Exit
                System.out.print("Exiting the warehouse ");
                break;
            }
            else
                System.out.print("Invalid choice ");
        }
    }
}
















