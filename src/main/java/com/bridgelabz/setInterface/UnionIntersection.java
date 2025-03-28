package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for Set1 and Set2
        System.out.println("Enter elements for Set1 (type 'done' to stop):");
        Set<Integer> set1 = inputSet(sc);

        System.out.println("Enter elements for Set2 (type 'done' to stop):");
        Set<Integer> set2 = inputSet(sc);

        // Union
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // Intersection
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        System.out.println("Union: " + unionSet);
        System.out.println("Intersection: " + intersectionSet);

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
2 3 4 5 6
done
Enter elements for Set2 (type 'done' to stop):
5 6 7 8 9 done
Union: [2, 3, 4, 5, 6, 7, 8, 9]
Intersection: [5, 6]
 */