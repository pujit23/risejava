import java.util.Scanner;
import java.util.*;
public class Main{
    public static int fact(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * i;
        }

        return res;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int n = sc.nextInt();
        fact(n);
        System.out.println(fact(n));

    }
}
