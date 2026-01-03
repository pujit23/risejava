import java.util.*;
class Main{
    static boolean isInvertable(int[]p){
        int n = p.length;
        boolean [] seen = new boolean[n+1];
        for (int v : p){
            if (v<1||v>n||seen[v])
                return false;
            seen[v] = true;
        }
        return true ;

    }
    static int[]invbox(int[]p){
        int n = p.length;
        int[]inv = new int[n];
        for (int i = 0 ; i<n;i++)
            inv[p[i]-1] = i+1;
         return inv;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] p = new int[n];
        System.out.println("Enter P-box values:");
        for (int i = 0; i < n; i++)
            p[i] = sc.nextInt();

        if (!isInvertible(p)) {
            System.out.println("❌ P-box is NOT invertible");
        } else {
            System.out.println("✅ P-box is invertible");
            int[] inv = inversePBox(p);
            System.out.print("Inverse P-box: ");
            for (int x : inv) System.out.print(x + " ");
        }
    }
}