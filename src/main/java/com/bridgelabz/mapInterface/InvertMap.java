package com.bridgelabz.mapInterface;
import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> originalMap = new HashMap<>();
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        System.out.println("Enter number of key-value pairs:");
        int n = sc.nextInt();
        sc.nextLine();


        for (int i = 0; i < n; i++) {
            System.out.println("Enter key (String):");
            String key = sc.nextLine();
            System.out.println("Enter value (Integer):");
            int value = sc.nextInt();
            sc.nextLine();

            originalMap.put(key, value);
        }

        // Invert the map
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            int value = entry.getValue();
            String key = entry.getKey();

            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }


        System.out.println("Inverted Map: " + invertedMap);

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
Inverted Map: {21=[B], 26=[S], 11=[G]}

 */