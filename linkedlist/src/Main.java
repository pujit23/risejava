import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            list.add(arr[i]);
            LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
            boolean first = true;
            for (int val : set) {
                if (!first) System.out.print("");
                System.out.print(val);
                first = false;
            }
        }
    }
}