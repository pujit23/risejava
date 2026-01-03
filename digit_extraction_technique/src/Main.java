import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int num ;
        int count;
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        count = 0;
        if (num==0) {
            count = 1;
        }
        else {
            while (num>0){
                int last_digit= num%10;
                num = num/10;
                count++;
            }
        }
        System.out.println(count);



    }
}