// QuickReverseSort.java
// Anthony Hackman

package SortMethods;

/**
 * Class to perform the quicksort algorithm in reverse order on an array of strings.
 * It also counts the number of comparisons made during the sorting process.
 */
public class QuickReverseSort {
    // Variable to keep track of the number of comparisons made during sorting
    private static long count;

    /**
     * Public method to start the sorting process.
     * @param arr The array of strings to be sorted.
     */
    public static void quickReverseSort(String[] arr) {
        count = 0; // Reset count to zero before sorting
        quickSort(arr, 0, arr.length - 1); // Begin quicksort recursion
        // After sorting, print the comparison count to the console
        System.out.println("QuickReverseSort comparison count: " + count);
    }

    /**
     * The recursive method that implements the quicksort algorithm.
     * @param arr The array of strings to be sorted.
     * @param low The starting index of the segment of the array to be sorted.
     * @param high The ending index of the segment of the array to be sorted.
     */
    private static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pi = partition(arr, low, high);
            // Recursively sort the two subarrays around the pivot
            quickSort(arr, low, pi - 1); // Left side of pivot
            quickSort(arr, pi + 1, high); // Right side of pivot
        }
    }

    /**
     * The partition method that reorders the array such that all elements greater than the pivot
     * come before it and all elements lesser than the pivot come after it.
     * @param arr The array of strings to be sorted.
     * @param low The starting index for the partitioning.
     * @param high The ending index for the partitioning (pivot element).
     * @return The index of the pivot element after partitioning.
     */
    private static int partition(String[] arr, int low, int high) {
        // Choose the rightmost element as pivot
        String pivot = arr[high];
        // Pointer for the greater element
        int i = low - 1; 
        // Traverse through all elements
        for (int j = low; j < high; j++) {
            // Increment the comparison count
            count++;
            // If current element is greater than the pivot, swap it with the greater element pointed by i
            if (arr[j].compareTo(pivot) > 0) { 
                i++; // Increment the pointer for the greater element
                // Swap the elements
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap the pivot element with the element pointed by the pointer for the greater element
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the position from where partition is done
        return i + 1;
    }

    /**
     * Getter method for retrieving the comparison count after the sort is complete.
     * @return The number of comparisons made during the sorting process.
     */
    public static long getComparisonCount() {
        return count;
    }
}
