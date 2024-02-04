
import java.util.Stack;

public class Challenge3 {

        private int maxSize;
        private int[] stackArray;
        private int top;

        // Constructor to initialize the stack with a maximum size
        public Challenge3(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }

        // Method to push an element onto the stack
        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push element.");
                return;
            }
            stackArray[++top] = value;
        }

        // Method to pop an element from the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop element.");
                return -1; // Return a default value indicating failure
            }
            return stackArray[top--];
        }

        // Method to peek at the top element of the stack
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot peek element.");
                return -1; // Return a default value indicating failure
            }
            return stackArray[top];
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return (top == -1);
        }

        // Method to check if the stack is full
        public boolean isFull() {
            return (top == maxSize - 1);
        }

        public static void main(String[] args) {
            Challenge3 stack = new Challenge3(5);

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            System.out.println("Top element: " + stack.peek());

            System.out.println("Popping elements from the stack:");
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        }

}
