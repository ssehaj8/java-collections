package com.bridgelabz.setInterface;

import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input for set1 and set2
        System.out.println("Enter elements for Set1 (type 'done' to stop):");
        Set<Integer> set1 = inputSet(sc);

        System.out.println("Enter elements for Set2 (type 'done' to stop):");
        Set<Integer> set2 = inputSet(sc);

        // Check if set1 is a subset of set2
        boolean isSubset = set2.containsAll(set1);
        System.out.println("Is Set1 a subset of Set2? " + isSubset);
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
Enter elements for Set1 (type 'done' to stop):
8 9 4 5 done
Enter elements for Set2 (type 'done' to stop):
5 6 8 9 done
Is Set1 a subset of Set2? false
 */