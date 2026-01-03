/*import java.util.Scanner;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of elements you want in the array");
        int n = sc.nextInt();
        int[] revarr = new int[n];
        for (int i = 0;i<n;i++){
            System.out.println("enter the element you want in the array");
            revarr[i]= sc.nextInt();
     }
        System.out.print("The elements in the array are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(revarr[i] + " ");
        }
        System.out.println();

      System.out.println("Reversed array is");
      for (int i = n-1;i>=0;i--){
          System.out.print(revarr[i]+" ");

      }
      System.out.println();


    }
} */

import java.util.Scanner;
class Main{
   static void printarr(int[]sarry,int n ){
        for (int i=0;i<n;i++){
            System.out.print(sarry[i]+" ");
        }
        System.out.println();
    }
    static void revarr(int[]revarry,int n ){
        for (int i=n-1;i>=0;i--){
            System.out.print(revarry[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int n = sc.nextInt();
       int[] arr = new int[n];
       System.out.println("enter the elements of the array");
       for (int i =0; i<n;i++){
           System.out.println("enter the element");
           arr[i]= sc.nextInt();
       }
       printarr(arr, n);
       revarr(arr, n);


    }
}




