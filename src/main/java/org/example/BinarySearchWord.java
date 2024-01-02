package org.example;

public class BinarySearchWord {
    private static boolean binarySearch(String[] array, String target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparison = target.compareTo(array[mid]);

            if (comparison == 0) {
                return true; // Word found
            } else if (comparison < 0) {
                high = mid - 1; // Search in the left half
            } else {
                low = mid + 1; // Search in the right half
            }
        }

        return false; // Word not found
    }

    public static void main(String[] args) {
        String[] array={"Hello","my","name"};
        String target="ma";
        System.out.println("Is found? "+(binarySearch(array,target)?"Yes":"No"));
    }
}
