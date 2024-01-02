package org.example;

import java.util.Scanner;

public class InsertionSort {
    private static void insertionSort(String[] array) {
        int n = array.length;

        for (int i = 1; i < n; i++) {
            String key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of words (comma-separated): ");
        String input = scanner.nextLine();
        String[] words = input.split(",");

        insertionSort(words);

        System.out.println("Sorted List: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

}
