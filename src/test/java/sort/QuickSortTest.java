package sort;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {
    QuickSort quickSort;

    @Before
    public void setUp() {
        this.quickSort = new QuickSort();
    }

    @Test
    public void testQuickSort() {
        Integer[] arrTest = {1, 4, 5, 1};
        Integer[] result = quickSort.sort(arrTest);
        Integer[] expected = {1, 1, 4, 5};

        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
}
