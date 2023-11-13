// QuickReverseSortTest.java
// Anthony Hackman

import org.junit.Test;
import SortMethods.QuickReverseSort;

import static org.junit.Assert.*;

public class QuickReverseSortTest {

    @Test
    public void testQuickReverseSort() {
        String[] input = { "apple", "banana", "cherry", "date" };
        String[] expected = { "date", "cherry", "banana", "apple" };
        QuickReverseSort.quickReverseSort(input);
        assertArrayEquals("The array should be sorted in reverse order", expected, input);
    }
}
