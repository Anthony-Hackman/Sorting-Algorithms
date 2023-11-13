// MergeReverseSort.java
// Anthony Hackman

package SortMethods;

public class MergeReverseSort {
    private static long count;

    public static void mergeReverseSort(String[] arr) {
        count = 0;
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("MergeReverseSort comparison count: " + count);
    }

    private static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
    }

    private static void merge(String[] arr, int left, int middle, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temp arrays
        String[] L = new String[n1];
        String[] R = new String[n2];

        // Copy data to temp arrays
        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, middle + 1, R, 0, n2);

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = left;
        while (i < n1 && j < n2) {
            count++;
            if (L[i].compareTo(R[j]) >= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static long getComparisonCount() {
        return count;
    }
}
