// SelectionReverseSort.java
// Anthony Hackman

package SortMethods;

// Class to perform selection sort in reverse order on an array of strings
public class SelectionReverseSort {
    // Variable to keep track of the number of comparisons made during sorting
    private static long count;

    // Method to sort the array in reverse order using selection sort algorithm
    public static void selectionReverseSort(String[] arr) {
        // Reset count to zero at the start of the sort
        count = 0;

        // Selection sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            // Initially assume the first element is the maximum
            int maxIdx = i;
            // Inner loop to find the actual maximum element's index
            for (int j = i + 1; j < arr.length; j++) {
                // Increment the comparison count
                count++;
                // If we find a string greater than current max, update maxIdx
                if (arr[j].compareTo(arr[maxIdx]) > 0) {
                    maxIdx = j;
                }
            }
            // Swap the found maximum element with the current position
            String temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
        
        // Output the number of comparisons to the console
        System.out.println("SelectionReverseSort comparison count: " + count);
    }

    // Getter method for retrieving the comparison count
    public static long getComparisonCount() {
        return count;
    }
}
