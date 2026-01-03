/*import java.util.Scanner;
public class Main {
    static void  print(int i,int n , String name){
        if (i>n) return;
        System.out.println(name);
        print(i+1,n,name);


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("no");
        int n = input.nextInt();
        System.out.print("name");
        String name = input.next();
        print(1,n,name);

    }
}*/

import java.util.Scanner;
public class Main {
    static void print(int i,int n){
        if(i==0) return;
        System.out.println(i+" ");
        print(i-1,n);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        print(n,n);
    }
}