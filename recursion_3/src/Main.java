import java.util.Scanner;
public class Main{
    static void print(int i , int n) {
        if (i<=0) return;
        System.out.println(i);
        print(i -1, n);
    }
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        print(n,n);


    }

}