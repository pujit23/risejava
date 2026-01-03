import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int num ;
        int reverse= 0;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        int original = num;

        if (num==0) {
            reverse =0;
        }
        else {
            while (num>0){
                int last_digit= num%10;
                num = num/10;
                reverse= reverse*10+last_digit;
            }
        }
        System.out.println(reverse);

        if (original == reverse){
            System.out.println("the no entered is a palindrome");

        }
        else {
            System.out.println("the no entered is not a palindrome");

        }



    }
}