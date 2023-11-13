// MergeReverseSort.java
// Anthony Hackman

package SortMethods;

// Class to perform merge sort in reverse order on an array of strings
public class MergeReverseSort {
    // Static variable to keep track of the number of comparisons made during sorting
    private static long count;

    // Public method to start the merge sort process on an array
    public static void mergeReverseSort(String[] arr) {
        count = 0; // Reset the comparison count at the start of sorting
        mergeSort(arr, 0, arr.length - 1); // Begin recursive merge sort
        System.out.println("MergeReverseSort comparison count: " + count); // Print comparison count
    }

    // Recursive method to perform merge sort
    private static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point to divide the array into two halves
            int middle = (left + right) / 2;

            // Sort first and second halves in reverse order
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    // Helper method to merge two halves of an array
    private static void merge(String[] arr, int left, int middle, int right) {
        // Calculate sizes of two subarrays to be merged
        int sizeLeft = middle - left + 1;
        int sizeRight = right - middle;

        // Create temporary arrays
        String[] leftArray = new String[sizeLeft];
        String[] rightArray = new String[sizeRight];

        // Copy data to temp arrays
        for (int i = 0; i < sizeLeft; ++i)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < sizeRight; ++j)
            rightArray[j] = arr[middle + 1 + j];

        // Merge the temp arrays back into original array
        int i = 0, j = 0;
        int k = left;
        while (i < sizeLeft && j < sizeRight) {
            count++; // Increment comparison count
            if (leftArray[i].compareTo(rightArray[j]) >= 0) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray, if any
        while (i < sizeLeft) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray, if any
        while (j < sizeRight) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Method to retrieve the comparison count after sorting
    public static long getComparisonCount() {
        return count;
    }
}
