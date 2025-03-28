package com.bridgelabz.mapInterface;
import java.util.*;

public class WordFrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> wordCountMap = new HashMap<>();

        System.out.println("Enter text:");
        String inputText = sc.nextLine();

        // Convert to lowercase and remove punctuation
        inputText = inputText.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split into words
        String[] words = inputText.split("\\s+");

        // Count frequency
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        System.out.println("Word Frequencies: " + wordCountMap);
    }
}


/*
Enter text:
Hello, I am Sehaj
Word Frequencies: {i=1, hello=1, sehaj=1, am=1}
 */