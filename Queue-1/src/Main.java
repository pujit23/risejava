// Class for Queue implementation
class Queue {
    private int arr[];     // array to store queue elements
    private int front;     // points to the front element in the queue
    private int rear;      // points to the last element in the queue
    private int capacity;  // maximum capacity of the queue
    private int count;     // current size of the queue

    // Constructor to initialize the queue
    Queue(int size) {
        arr = new int[size];  // create an array of given size
        capacity = size;      // set the maximum capacity
        front = 0;            // front starts at 0
        rear = -1;            // rear is -1 because queue is empty
        count = 0;            // no elements initially
    }

    // Add an element to the rear of the queue
    public void enqueue(int x) {
        if (isFull()) {   // check if queue is full
            System.out.println("Queue Overflow! Cannot insert " + x);
            return;
        }
        rear++;           // move rear pointer forward
        arr[rear] = x;    // place the element at the new rear position
        count++;          // increase the size
        System.out.println(x + " enqueued");
    }

    // Remove an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {  // check if queue is empty
            System.out.println("Queue Underflow! No element to dequeue");
            return -1;
        }
        int x = arr[front]; // get the front element
        front++;            // move front pointer forward
        count--;            // decrease the size
        return x;           // return removed element
    }

    // Get the front element without removing it
    public int peek() {
        if (isEmpty()) {    // check if queue is empty
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];  // return front element
    }

    // Return the number of elements in the queue
    public int size() {
        return count;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (count == 0);
    }

    // Check if the queue is full
    public boolean isFull() {
        return (count == capacity);
    }
}

// Main class to test the queue
public class Main {
    public static void main(String[] args) {
        // Create a queue of size 5
        Queue q = new Queue(5);

        // Insert elements into the queue
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        // Show the front element
        System.out.println("Front element is " + q.peek()); // Output: 10

        // Show current size
        System.out.println("Queue size is " + q.size()); // Output: 3

        // Remove two elements
        System.out.println(q.dequeue() + " dequeued"); // Output: 10
        System.out.println(q.dequeue() + " dequeued"); // Output: 20

        // Show new size
        System.out.println("Queue size is " + q.size()); // Output: 1
    }
}
