package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;

import static by.epam.maintasks1.krupin.MainTask.model.logic.CheckerVectors.*;
import static org.junit.Assert.*;


import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;
import org.junit.Test;

import java.util.Arrays;

public class ActionerWithVectorTest {

    @Test
    public void testIsSortVector() throws Exception {
        boolean expected = true;
        assertEquals(expected, CheckerVectors.isSortVector(new VectorDouble(ParametrsForActionTest.masIsSortDecrise)));
        assertEquals(expected, CheckerVectors.isSortVector(new VectorDouble(ParametrsForActionTest.mas3)));
    }

    @Test
    public void testBinarySearch() throws Exception {
        int expected = 1;

        assertEquals(expected, FinderForVectorElements.binarySearch(new VectorDouble(ParametrsForActionTest.masIsSortDecrise),
                ParametrsForActionTest.a2));

    }

    @Test
    public void testIsNotVectorSortAndVarAInRangeInBinarySearch() throws Exception {
        int expected = -1;
        assertEquals(expected, FinderForVectorElements.binarySearch(new VectorDouble(ParametrsForActionTest.masIsSortDecrise),
                ParametrsForActionTest.a));

    }

    @Test
    public void testBinarySearchWhenVarIsFirstOrLastElementByVector() throws Exception {
        int expected = 0;
        int expected1 = 1;
        assertEquals(expected, FinderForVectorElements.binarySearch(new VectorDouble(ParametrsForActionTest.mas3),
                ParametrsForActionTest.a3));
        assertEquals(expected1, FinderForVectorElements.binarySearch(new VectorDouble(ParametrsForActionTest.mas3),
                ParametrsForActionTest.a4));
    }



    @Test(expected = Exception.class)
    public void testReverseVectorIfVectorIsEmpty() throws Exception {
        ActionerWithVector.reverseVector(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testReverseVectorWhenSizeIs1() throws Exception {
        double[] expected = {1};
        assertTrue(Arrays.equals(expected, ActionerWithVector.reverseVector(
                new VectorDouble(ParametrsForActionTest.mas4)).getVector()));
    }

    @Test
    public void testReverseVector() throws Exception {
      double [] expected = {44, -600, 89};
      double [] expected2 = {10_000.76, -900.4, 8.0, 7600,  -4500, 0, 600, -5000};
        assertArrayEquals(expected, ActionerWithVector.reverseVector(
                new VectorDouble(ParametrsForActionTest.mas2)).getVector(), ParametrsForActionTest.delta);
        assertArrayEquals(expected2, ActionerWithVector.reverseVector(
                new VectorDouble(ParametrsForActionTest.mas1)).getVector(), ParametrsForActionTest.delta);
    }


}
