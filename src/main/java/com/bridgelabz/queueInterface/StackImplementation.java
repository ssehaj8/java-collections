package com.bridgelabz.queueInterface;
import java.util.*;

// Implementing a Stack using two Queues
class StackUsingQueues {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        q1.add(x);
    }

    // Removes and returns the top element of the stack
    public int pop() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        // Move elements from queue1 to queue2, leaving only the last one
        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        // Remove and return the last element
        int topElement = q1.remove();

        // Swap the queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Get the top element without removing it
    public int top() {
        if (q1.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        while (q1.size() > 1) {
            q2.add(q1.remove());
        }

        int topElement = q1.peek();
        q2.add(q1.remove());

        // Swap the queues
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Pop: " + stack.pop()); // Output: 3
        System.out.println("Top: " + stack.top()); // Output: 2
    }
}

/*
Pop: 3
Top: 2
 */