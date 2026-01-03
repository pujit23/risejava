import java.util.Scanner;
public class Main {
    static void print(int i,int n,int sum){

        if(i>n) return;
        sum+=i;
        System.out.println(sum);

        print(i+1,n,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        print(1,n,0);
    }
}

