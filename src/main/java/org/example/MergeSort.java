package org.example;

import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of strings (space-separated): ");
        String input = scanner.nextLine();
        String[] strings = input.split(" ");

        mergeSort(strings, 0, strings.length - 1);

        System.out.println("Sorted List: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }

    private static void mergeSort(String[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);

            merge(array, low, mid, high);
        }
    }

    private static void merge(String[] array, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[low + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (leftArray[i].compareTo(rightArray[j]) <= 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
