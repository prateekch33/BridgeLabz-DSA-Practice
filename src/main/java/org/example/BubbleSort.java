package org.example;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of integers (space-separated): ");
        String input = scanner.nextLine();
        String[] strNumbers = input.split(" ");

        int[] numbers = new int[strNumbers.length];
        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        bubbleSort(numbers);

        System.out.println("Sorted List: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
