/*import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i =0 ; i<n; i++) {
            System.out.println("enter the element ");
            arr[i] = sc.nextInt();
        }

        for(int i =0 ; i < n; i++){
            System.out.println(arr[i] + "");
            System.out.println();
        }


        Arrays.sort(arr); // important shit!!!
        System.out.println("The largest element in the array is: " + arr[n - 2]);
        sc.close();
    }
}*/
import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of ele");
        int n = sc.nextInt();
        int[]arr =new int[n];

        for (int i=0;i<n;i++){
            System.out.println("enter the no");
            arr[i]=sc.nextInt();
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        int max = arr[0];
        for (int i =0 ; i<n;i++){
            if (arr[i]>max){
                max = arr[i];
            }


        }


    }
}