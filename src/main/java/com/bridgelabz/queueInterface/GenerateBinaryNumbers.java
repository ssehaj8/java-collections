package com.bridgelabz.queueInterface;

import java.util.*;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for N
        System.out.print("Enter the number of binary numbers to generate: ");
        int n = sc.nextInt();

        // Generate and print binary numbers
        List<String> binaryNumbers = generateBinaryNumbers(n);
        System.out.println("Binary Numbers: " + binaryNumbers);
    }

    // Method to generate binary numbers using a queue
    private static List<String> generateBinaryNumbers(int n) {
        List<String> res = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1"); // Start with "1"

        for (int i = 0; i < n; i++) {
            String front = queue.remove();
            res.add(front);

            // Generate next binary numbers and add to queue
            queue.add(front + "0");
            queue.add(front + "1");
        }

        return res;
    }
}


/*
Enter the number of binary numbers to generate: 8
Binary Numbers: [1, 10, 11, 100, 101, 110, 111, 1000]
 */