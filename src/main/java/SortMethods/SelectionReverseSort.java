// SelectionReverseSort.java
// Anthony Hackman

package SortMethods;

public class SelectionReverseSort {
    private static long count;

    public static void selectionReverseSort(String[] arr) {
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                count++;
                if (arr[j].compareTo(arr[maxIdx]) > 0) {
                    maxIdx = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }
        System.out.println("SelectionReverseSort comparison count: " + count);
    }

    public static long getComparisonCount() {
        return count;
    }
}
