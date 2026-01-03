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
            }


        Arrays.sort(arr);
        System.out.println("The largest element in the array is: " + arr[n - 1]);
        sc.close();
    }
}*/
import java.util.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter the element ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + "");
        }
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {

                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is: " + max);
        sc.close();
    }
}