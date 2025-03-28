package com.bridgelabz.list;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class NthFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        // Taking user input for the linked list elements
        System.out.println("Enter the elements of the linked list (type 'done' to stop):");
        while (true) {
            String s = sc.next();
            if (s.equalsIgnoreCase("done")) {
                break;
            }
            list.add(s);
        }

        // Taking user input for N
        System.out.print("Enter the value of N: ");
        int k = sc.nextInt();

        // Finding the Nth element from the end
        String res = findNthFromEnd(list, k);
        System.out.println("The " + k + "th element from the end is: " + res);
    }

    // Method to find the Nth element from the end
    public static String findNthFromEnd(LinkedList<String> l, int k) {
        ListIterator<String> first = l.listIterator();
        ListIterator<String> second = l.listIterator();

        // Move the first pointer N steps ahead
        for (int i = 0; i < k; i++) {
            if (!first.hasNext()) {
                return "N is larger than the list size";
            }
            first.next();
        }

        // Move both pointers until the first pointer reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        // The second pointer now points to the Nth element from the end
        return second.hasNext() ? second.next() : "N is out of range";
    }
}
/*
Enter the elements of the linked list (type 'done' to stop):
A B S Y S T done
Enter the value of N: 2
The 2th element from the end is: S

 */