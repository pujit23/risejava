//Brute_force_approach
import java.util.*;
public class Main {
    public static int getSingleElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int cnt = 0;


            for (int j = 0; j < n; j++) {
                if (arr[j] == num)
                    cnt++;
            }
            if (cnt == 1) return num;
        }

        return -1;
    }
    public static void main(String args[]) {
        int[] arr = {5, 1, 1, 6, 6};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);

    }
}
