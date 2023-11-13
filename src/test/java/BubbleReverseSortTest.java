// BubbleReverseSortTest.java
// Anthony Hackman

import org.junit.Test;
import SortMethods.BubbleReverseSort;

import static org.junit.Assert.*;

public class BubbleReverseSortTest {

    @Test
    public void testBubbleReverseSort() {
        String[] input = { "apple", "banana", "cherry", "date" };
        String[] expected = { "date", "cherry", "banana", "apple" };
        BubbleReverseSort.bubbleReverseSort(input);
        assertArrayEquals("The array should be sorted in reverse order", expected, input);
    }

    @Test
    public void testComparisonCount() {
        String[] input = { "apple", "banana", "cherry", "date" };
        BubbleReverseSort.bubbleReverseSort(input);
        long count = BubbleReverseSort.getComparisonCount();
        assertTrue("Number of comparisons should be greater than 0", count > 0);
    }
}
