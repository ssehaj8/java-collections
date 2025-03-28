package com.bridgelabz.list;
import java.util.*;

public class ReverseList {
    public static void reverseList(List<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        System.out.println("Original List: " + list);
        reverseList(list);
        System.out.println("Reversed List: " + list);

        scanner.close();
    }
}
/*
Enter the number of elements:
5
Enter the elements:
1 8 6 4 6
Original List: [1, 8, 6, 4, 6]
Reversed List: [6, 4, 6, 8, 1]

 */
