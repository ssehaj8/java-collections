package com.bridgelabz.queueInterface;
import java.util.*;

class CircularBuffer {
    private int[] buffer;
    private int size, start, end, count;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = capacity;
        start = 0;
        end = 0;
        count = 0;
    }

    // Insert an element into the buffer
    public void insert(int value) {
        buffer[end] = value;
        end = (end + 1) % size;

        if (count < size) {
            count++;
        }
        else {
            // Overwrite the oldest element
            start = (start + 1) % size;
        }
    }

    // Print the buffer content
    public void printBuffer() {
        System.out.print("Buffer: [");
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(start + i) % size]);
            if (i < count - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

public class CircularBufferSimulation {
    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);

        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.printBuffer();

        buffer.insert(4);
        buffer.printBuffer();
    }
}

/*
Buffer: [1, 2, 3]
Buffer: [2, 3, 4]
 */