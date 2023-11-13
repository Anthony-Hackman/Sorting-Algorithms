// BubbleReverseSort.java
// Anthony Hackman

package SortMethods;

// Class to perform bubble sort in reverse order on an array of strings
public class BubbleReverseSort {
    // Variable to keep track of the number of comparisons made during sorting
    private static long count;

    // Method to sort the array in reverse order using bubble sort algorithm
    public static void bubbleReverseSort(String[] arr) {
        // Reset count to zero at the start of the sort
        count = 0;

        // Bubble sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Increment the comparison count
                count++;
                // Compare adjacent elements and swap if in wrong order
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    // Swapping elements to sort in descending order
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
        // Output the number of comparisons to the console
        System.out.println("BubbleReverseSort comparison count: " + count);
    }

    // Getter method for retrieving the comparison count
    public static long getComparisonCount() {
        return count;
    }
}