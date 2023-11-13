// SelectionReverseSortTest.java
// Anthony Hackman

import org.junit.Test;
import SortMethods.SelectionReverseSort;
import static org.junit.Assert.*;

public class SelectionReverseSortTest {

    @Test
    public void testSelectionReverseSort() {
        String[] input = { "apple", "banana", "cherry", "date" };
        String[] expected = { "date", "cherry", "banana", "apple" };
        SelectionReverseSort.selectionReverseSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testComparisonCount() {
        String[] input = { "apple", "banana", "cherry", "date" };
        SelectionReverseSort.selectionReverseSort(input);
        long count = SelectionReverseSort.getComparisonCount();
        assertTrue("Number of comparisons should be greater than 0", count > 0);
    }
}
