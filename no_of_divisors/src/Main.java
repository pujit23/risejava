import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num ;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1;i<=num;i++){
            if (num%i==0){
                divisors.add(i);
            }
        }

        System.out.println(divisors);



    }
}