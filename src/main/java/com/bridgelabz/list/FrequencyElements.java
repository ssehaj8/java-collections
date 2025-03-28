package com.bridgelabz.list;

import java.util.*;
import java.util.*;

public class FrequencyElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words:");
        String[] words = sc.nextLine().split(" ");

        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequencyMap);
        sc.close();
    }
}

/*
Enter words:
sehaj sanya bhawishyakumar
{bhawishyakumar=1, sanya=1, sehaj=1}

 */