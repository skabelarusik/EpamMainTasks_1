package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;

import static by.epam.maintasks1.krupin.MainTask.model.logic.VectorChecker.*;
import static org.junit.Assert.*;


import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;
import org.junit.Test;

import java.util.Arrays;

public class VectorActionerTest {

    @Test
    public void testIsSortVector() throws Exception {
        boolean expected = true;
        assertEquals(expected, VectorChecker.isSortVector(new VectorDouble(ParametrsActionTest.masIsSortDecrise)));
    }

    @Test
    public void testBinarySearch() throws Exception {
        int expected = 1;

        assertEquals(expected, VectorElementsFinder.binarySearch(new VectorDouble(ParametrsActionTest.masIsSortDecrise),
                ParametrsActionTest.a2));

    }

    @Test
    public void testIsNotVectorSortAndVarAInRangeInBinarySearch() throws Exception {
        int expected = -1;
        assertEquals(expected, VectorElementsFinder.binarySearch(new VectorDouble(ParametrsActionTest.masIsSortDecrise),
                ParametrsActionTest.a));

    }

    @Test
    public void testBinarySearchWhenVarIsFirstOrLastElementByVector() throws Exception {
        int expected = 0;

        assertEquals(expected, VectorElementsFinder.binarySearch(new VectorDouble(ParametrsActionTest.mas3),
                ParametrsActionTest.a3));
    }



    @Test(expected = Exception.class)
    public void testReverseVectorIfVectorIsEmpty() throws Exception {
        VectorActioner.reverseVector(new VectorDouble(ParametrsActionTest.masDoubleNull));
    }

    @Test
    public void testReverseVectorWhenSizeIs1() throws Exception {
        double[] expected = {1};
        assertTrue(Arrays.equals(expected, VectorActioner.reverseVector(
                new VectorDouble(ParametrsActionTest.mas4)).getVector()));
    }

    @Test
    public void testReverseVector() throws Exception {
      double [] expected = {44, -600, 89};
        assertArrayEquals(expected, VectorActioner.reverseVector(
                new VectorDouble(ParametrsActionTest.mas2)).getVector(), ParametrsActionTest.delta);

    }


}
