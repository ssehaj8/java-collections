package com.bridgelabz.list;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers:");
        List<Integer> list = new ArrayList<>();
        for (String num : sc.nextLine().split(" ")) {
            list.add(Integer.parseInt(num));
        }

        List<Integer> uniqueList = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : list) {
            if (seen.add(num)) {
                uniqueList.add(num);
            }
        }

        System.out.println(uniqueList);

    }
}
/*
Enter numbers:
2 7 8 9 3 8 3 7 2
[2, 7, 8, 9, 3]
 */