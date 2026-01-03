import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int capacity=5;
        Queue<String> queue=new LinkedList<>();
        while(true){
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    String order=sc.nextLine();
                    if(queue.size()<capacity){
                        queue.offer(order);
                        System.out.println("Order for"+order+" is enqueued.");
                    }else{
                        System.out.println("Queue is full. Cannot enqueue more orders.");
                    }
                    break;
                case 2:
                    if(queue.isEmpty()){
                        System.out.println("No orders in the queue.");
                    }else{
                        String remove=queue.poll();
                        System.out.println("Dequeued Order: "+remove);
                    }
                    break;
                case 3:
                    if(queue.isEmpty()){
                        System.out.println("Queue is empty.No orders available.");
                    }else{
                        System.out.print("Orders in the queue are: ");
                        for(String s:queue){
                            System.out.print(s);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exiting program");
                    return;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }
    }
}
