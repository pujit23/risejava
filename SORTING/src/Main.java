/*import java.util.Scanner;

class Quicksort {

    public static int partition(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Correct final swap
        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void quickSort(char[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[] characters = new char[n];

        for (int i = 0; i < n; i++) {
            characters[i] = sc.next().charAt(0);
        }

        quickSort(characters, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(characters[i] + " ");
        }

        sc.close();
    }
}*/
/*import java.util.*;
class Main{
    static void selectionSort(int[]arr , int n){
        int min_idx;
        for (int i =0 ; i< n-1;i++){
            min_idx = i;
            for (int j = i+1;j<n;j++){
                if (arr[j]>arr[min_idx]){
                    min_idx = j;
                }
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
                System.out.print("After his step:"+(i+1));
                printArray(arr,n);
            }
        }
        static void printArray(int arr[],int n){
            for (int i =0 ; i<n ; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i =0 ;i<n ; i++)
                arr[i] = sc.nextInt();
            selectionSort(arr, n);
            System.out.println("Finally, he got it...") ;
            printArray(arr, n) ;
        }
    }*/


