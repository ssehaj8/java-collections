package com.bridgelabz.setInterface;

import java.util.*;

public class SetToSortedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for set
        System.out.println("Enter elements for set:");
        Set<Integer> set = inputSet(sc);

        // Convert set to list
        List<Integer> sortedList = new ArrayList<>(set);

        // Sort the list
        Collections.sort(sortedList);

        // Display sorted list
        System.out.println("Sorted List: " + sortedList);
    }

    // Helper method to take input and return a set
    private static Set<Integer> inputSet(Scanner sc) {
        Set<Integer> set = new HashSet<>();
        while (sc.hasNext()) {
            String input = sc.next();
            if (input.equalsIgnoreCase("done")) break;
            try {
                set.add(Integer.parseInt(input));
            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter integers.");
            }
        }
        return set;
    }
}
/*
Enter elements for set:
5 6 7 8 3 5 2 done
Sorted List: [2, 3, 5, 6, 7, 8]
 */

