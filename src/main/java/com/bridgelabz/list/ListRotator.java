package com.bridgelabz.list;
import java.util.*;

public class ListRotator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Take user input for number of elements and elements itself
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }

        System.out.println("Enter number of positions to rotate list by: ");
        int k = sc.nextInt();

        rotateList(l, k);
        System.out.println("Rotated list: ");
        for (int i = 0; i < n; i++) {
            System.out.print(l.get(i) + " ");
        }
    }

    public static void rotateList(List<Integer> l, int k) {
        int n = l.size();

        //To handle case where k>n
        k = k % n;


        reverse(l, 0, n - 1);
        reverse(l, 0, n - k - 1);
        reverse(l, n - k, n - 1);
    }


    static void reverse(List<Integer> list, int l, int r) {
        while (l < r) {
            int temp = list.get(l);
            list.set(l, list.get(r));
            list.set(r, temp);
            l++;
            r--;
        }
    }
}
/*
Enter number of elements:
6
Enter 6 integers:
8 5 7 4 0 2
Enter number of positions to rotate list by:
2
Rotated list:
7 4 0 2 8 5
 */



