
import java.util.ArrayList;
import java.util.Queue;

public class Challenge4 {

        private ArrayList<Integer> queue;

        // Constructor to initialize the queue
        public Challenge4() {
            queue = new ArrayList<>();
        }

        // Method to add an element to the back of the queue (enqueue)
        public void enqueue(int value) {
            queue.add(value);
        }

        // Method to remove the element from the front of the queue (dequeue)
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue element.");
                return -1; // Return a default value indicating failure
            }
            return queue.remove(0);
        }

        // Method to get the element at the front of the queue without removing it (peek)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot peek element.");
                return -1; // Return a default value indicating failure
            }
            return queue.get(0);
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public static void main(String[] args) {
            Challenge4 queue = new Challenge4();

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);

            System.out.println("Front element: " + queue.peek());

            System.out.println("Dequeueing elements from the queue:");
            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue());
            }
        }

}
