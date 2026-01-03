import java.util.Scanner;
public class Main {

static void print(int i, int n, String name) {
        if (i > n) return;
        System.out.println(name);
        print(i + 1, n, name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number time: ");
        int n = sc.nextInt();
        System.out.println("Enter the name: ");
        String name = sc.next();
        print(1,n,name);
    }

}








