package com.udacity.examples.Testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class HelperTest {

    @Test
    public void testGetCount() {
        Assert.assertEquals(0, Helper.getCount(Arrays.asList("String1", "String2")));
        Assert.assertEquals(2, Helper.getCount(Arrays.asList("String1", "", "String3", "", "String5")));
    }

    @Test
    public void testGetStats() {
        final IntSummaryStatistics stats = Helper.getStats(Arrays.asList(1, 2, 3));
        Assert.assertEquals(3, stats.getCount());
        Assert.assertEquals(1, stats.getMin());
        Assert.assertEquals(3, stats.getMax());
        Assert.assertEquals(2.0, stats.getAverage());
        Assert.assertEquals(3, stats.getMax());
    }

    @Test
    public void testGetStringsOfLength3() {
        Assert.assertEquals(1, Helper.getStringsOfLength3(Arrays.asList("spr", "queer")));
        Assert.assertEquals(0, Helper.getStringsOfLength3(Arrays.asList("super", "queer")));
    }

    @Test
    public void testGetSquareList() {
        List<Integer> expected = Arrays.asList(0, 1, 4, 9);
        List<Integer> squareList = Helper.getSquareList(Arrays.asList(0, 1, 2, 3));
        Assert.assertEquals(expected, squareList);
    }

    @Test
    public void testGetMergedList() {
        List<String> strings = Arrays.asList("String1", "", "String3", "", "String5", "test");
        Assert.assertEquals("String1, String3, String5, test", Helper.getMergedList(strings));
    }

    @Test
    public void testGetFilteredList() {
        List<String> strings = Arrays.asList("String1", "", "String3", "", "String5");
        Assert.assertEquals(Arrays.asList("String1", "String3", "String5"), Helper.getFilteredList(strings));
    }
}
