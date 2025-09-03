import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        int sum;
        int last_digit = 0;
        sum = 0;

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        int original_num = num;

        int num_digits = String.valueOf(original_num).length();
        while (num > 0) {
            last_digit = num % 10;

            sum += Math.pow(last_digit, num_digits);

            num = num / 10;
        }

        if (sum == original_num) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}