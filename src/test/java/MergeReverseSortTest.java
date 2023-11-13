// MergeReverseSortTest.java
// Anthony Hackman

import org.junit.Test;
import SortMethods.MergeReverseSort;
import static org.junit.Assert.*;

public class MergeReverseSortTest {

    @Test
    public void testMergeReverseSort() {
        String[] input = { "apple", "banana", "cherry", "date" };
        String[] expected = { "date", "cherry", "banana", "apple" };
        MergeReverseSort.mergeReverseSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testComparisonCount() {
        String[] input = { "apple", "banana", "cherry", "date" };
        MergeReverseSort.mergeReverseSort(input);
        long count = MergeReverseSort.getComparisonCount();
        assertTrue("Number of comparisons should be greater than 0", count > 0);
    }
}
