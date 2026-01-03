import java.util.Scanner;
import java.util.*;

class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of ele");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter the elmnts");
            arr[i]=sc.nextInt();
        }
      boolean isSorted = true;

        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted = false;
            }
        }
        if (isSorted){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }



    }
}