/*import java.util.Scanner;
import java.util. LinkedList;
import  java.util.Queue;

class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0 ; i<input ;i++ ){
            q.add(sc.nextInt());
        }
        int k = sc.nextInt();
        for (int i =0 ;i<k;i++){
            int rotatearr = q.remove();
        }
        while (!q.isEmpty()){
            System.out.println(q.remove()+"");
        }
    }
}
*/
/*import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Queue<Integer>q = new LinkedList<>();
        for (int i = 0; i<n;i++){
            q.add(sc.nextInt());
        }
        int x = sc.nextInt();
        int pos = 0 ;
        for (int i:q){
            if ( i==x){
                System.out.println("Position of "+ x + " in the queue:"+pos);
                return;
            }
            System.out.println("x not found");
        }
    }
}*/
import java.util.*;
class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<String>q = new LinkedList<>();
        while(true){
            int c = sc.nextInt();
            switch(c){
                case 1 :
                    String str = sc.nextLine();
                    if (q.size()<5){
                        q.add(str);
                        System.out.println("Order for "+ str +"is enqued");

                    }else{
                    System.out.println("its full ");}
            break;
                case 2 :
                    if (q.isEmpty()) {
                    System.out.print("Queue is empty so its cannot be dequed ");
                }else {
                    System.out.println("dequed order" + q.poll());
                }
                    break;
                case 3:
                    if (q.isEmpty()) {
                        System.out.print("queue is empty");
                    }else {
                        System.out.println("queue order are "+ String.join("",q));
                    }
                    break;
                case 4:
                    System.out.println("exiting");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;


            }
        }
    }
}
