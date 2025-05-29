import java.util.Stack;

public class StackOperations {
    Stack<Integer> stack = new Stack<>();

    // Push element
    public void pushElement(int element) {
        stack.push(element);
        System.out.println(element + " pushed onto the stack.");
    }

    // Pop element
    public void popElement() {
        if (!stack.isEmpty()) {
            int popped = stack.pop();
            System.out.println("Popped element: " + popped);
        } else {
            System.out.println("Stack is empty. Cannot pop.");
        }
    }

    // Check if stack is empty
    public void isEmpty() {
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

    // Main method for testing
    public static void main(String[] args) {
        StackOperations so = new StackOperations();

        so.pushElement(10);
        so.pushElement(20);
        so.isEmpty();
        so.popElement();
        so.popElement();
        so.popElement(); // Attempting to pop from empty stack
        so.isEmpty();
    }
}
