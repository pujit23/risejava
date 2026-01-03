import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        boolean[] p = new boolean[n+1];
        Arrays.fill(p,true);
        p[0]=p[1] = false;

        for (int i =2 ; i*i<=n;i++)
           if( p[i])
               for (int j =i*i;j<=n;j+=i)
                 p[j] = false;
           for (int i = 0; i<n;i++)
               if (p[i])
                   System.out.print(i+" ");




    }
}
