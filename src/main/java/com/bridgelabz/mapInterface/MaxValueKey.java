package com.bridgelabz.mapInterface;
import java.util.*;

public class MaxValueKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        System.out.println("Enter number of key-value pairs:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter key (String): ");
            String key = sc.nextLine();
            System.out.println("Enter value (Integer): ");
            int value = sc.nextInt();
            sc.nextLine();

            map.put(key, value);
        }

        // Find the key with the maximum value
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Key with the highest value: " + maxKey);
    }
}


/*
Enter number of key-value pairs:
 4
Enter key (String):
S
Enter value (Integer):
8
Enter key (String):
B
Enter value (Integer):
21
Enter key (String):
S
Enter value (Integer):
26
Enter key (String):
G
Enter value (Integer):
11
Key with the highest value: S
 */