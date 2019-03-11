
package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import static org.junit.Assert.*;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;
import org.junit.Test;

import java.util.Arrays;

public class ActionWithVectorTest {

    private double delta = 0.000006;

    @Test(expected = Exception.class)
    public void testCheckNullDoubleVector() throws Exception {
        ActionWithVector.checkNullVector(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test(expected = Exception.class)
    public void testCheckNullIntVector() throws Exception {
        ActionWithVector.checkNullVector(new VectorInt(ParametrsForActionTest.masIntNull));
    }

    @Test
    public void testFindMaxElement() throws Exception {
        double expected1 = 10000.76;
        double expected2 = 89;
        double expected3 = 7600;
        double expected4 = 1;

        assertEquals(expected1, ActionWithVector.findMaxElement(new VectorDouble(ParametrsForActionTest.mas1)), delta);
        assertEquals(expected2, ActionWithVector.findMaxElement(new VectorDouble(ParametrsForActionTest.mas2)), delta);
        assertEquals(expected3, ActionWithVector.findMaxElement(new VectorDouble(ParametrsForActionTest.mas3)), delta);
        assertEquals(expected4, ActionWithVector.findMaxElement(new VectorDouble(ParametrsForActionTest.mas4)), delta);
    }

    @Test(expected = Exception.class)
    public void  testFindMaxElementWithZeroLengthVector() throws Exception {
        ActionWithVector.findMaxElement(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testFindMinElement() throws Exception {
        double expected1 = -5000;
        double expected2 = -600;
        double expected3 = -4500;
        double expected4 = 1;

        assertEquals(expected1, ActionWithVector.findMinElement(new VectorDouble(ParametrsForActionTest.mas1)), delta);
        assertEquals(expected2, ActionWithVector.findMinElement(new VectorDouble(ParametrsForActionTest.mas2)), delta);
        assertEquals(expected3, ActionWithVector.findMinElement(new VectorDouble(ParametrsForActionTest.mas3)), delta);
        assertEquals(expected4, ActionWithVector.findMinElement(new VectorDouble(ParametrsForActionTest.mas4)), delta);
    }

    @Test(expected = Exception.class)
    public void  testFindMinElementWithZeroLengthVector() throws Exception {
        ActionWithVector.findMinElement(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testFindAverageAriph() throws Exception {
        double expected1 = 976.045;
        double expected2 = -155.6666666666667;
        double expected3 = 1550;
        double expected4 = 1;

        assertEquals(expected1, ActionWithVector.findAverageAriph(new VectorDouble(ParametrsForActionTest.mas1)), delta);
        assertEquals(expected2, ActionWithVector.findAverageAriph(new VectorDouble(ParametrsForActionTest.mas2)), delta);
        assertEquals(expected3, ActionWithVector.findAverageAriph(new VectorDouble(ParametrsForActionTest.mas3)), delta);
        assertEquals(expected4, ActionWithVector.findAverageAriph(new VectorDouble(ParametrsForActionTest.mas4)), delta);
    }

    @Test(expected = Exception.class)
    public void testFindAverageAriphByNullVector() throws Exception {
        ActionWithVector.checkNullVector(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testFindAverageGeometric() throws Exception {
        double expected1 = 3.3097509196;
        double expected2 = 2.44948974;
        double expected5 = 7;

        assertEquals(expected1, ActionWithVector.findAverageGeometr(new VectorInt(ParametrsForActionTest.mas01)), delta);
        assertEquals(expected2, ActionWithVector.findAverageGeometr(new VectorInt(ParametrsForActionTest.mas02)),delta);
        assertEquals(expected5, ActionWithVector.findAverageGeometr(new VectorInt(ParametrsForActionTest.mas05)),delta);
    }

    @Test(expected = Exception.class)
    public void testFindAverageGeometricByNullVector() throws Exception {
        ActionWithVector.findAverageGeometr(new VectorInt(ParametrsForActionTest.masIntNull));
    }

    @Test(expected = Exception.class)
    public void testIsNaturalNumberInVectorInt() throws Exception {
        ActionWithVector.isNaturalNumber(new VectorInt(ParametrsForActionTest.mas03));
    }

    @Test(expected = Exception.class)
    public void testIsSortIncreaseIfNullVector() throws Exception {
       ActionWithVector.isSortIncrease(new VectorDouble(ParametrsForActionTest.masDoubleNull));

    }

    @Test
    public void testIsSortIncreaseIfSizeIsOne() throws Exception {
        boolean expected = false;
        assertEquals(expected, ActionWithVector.isSortIncrease(new VectorDouble(ParametrsForActionTest.mas4)));
    }

    @Test(expected = Exception.class)
    public void testIsSortDecreaseIfNullVector() throws Exception {
        ActionWithVector.isSortDecrease(new VectorDouble(ParametrsForActionTest.masDoubleNull));

    }

    @Test
    public void testIsSortIncreaseIfSizeMore1() throws Exception {
        boolean expected = true;
        assertEquals(expected, ActionWithVector.isSortIncrease(new VectorDouble(ParametrsForActionTest.mas3)));
    }

    @Test
    public void testIsSortDecreaseIfSizeIsOne() throws Exception {
        boolean expected = false;
        assertEquals(expected, ActionWithVector.isSortDecrease(new VectorDouble(ParametrsForActionTest.mas4)));
    }

    @Test
    public void testIsSortDecrease() throws Exception {
        boolean expected = true;
        assertEquals(expected, ActionWithVector.isSortDecrease(new VectorDouble(ParametrsForActionTest.masIsSortDecrise)));
    }

    @Test
    public void testIsSortVector() throws Exception {
        boolean expected = true;
        assertEquals(expected,ActionWithVector.isSortVector(new VectorDouble(ParametrsForActionTest.masIsSortDecrise)));
        assertEquals(expected, ActionWithVector.isSortVector(new VectorDouble(ParametrsForActionTest.mas3)));
    }

    @Test
    public void testBinarySearch() throws Exception {
        int expected = 1;

        assertEquals(expected, ActionWithVector.binarySearch(new VectorDouble(ParametrsForActionTest.masIsSortDecrise),
                ParametrsForActionTest.a2));

    }

    @Test
    public void testIsNotVectorSortAndVarAInRangeInBinarySearch() throws Exception {
        int expected = -1;
        assertEquals(expected, ActionWithVector.binarySearch(new VectorDouble(ParametrsForActionTest.masIsSortDecrise),
                ParametrsForActionTest.a));

    }

    @Test
    public void testBinarySearchWhenVarIsFirstOrLastElementByVector() throws Exception {
        int expected = 0;
        int expected1 = 1;
        assertEquals(expected, ActionWithVector.binarySearch(new VectorDouble(ParametrsForActionTest.mas3),
                ParametrsForActionTest.a3));
        assertEquals(expected1, ActionWithVector.binarySearch(new VectorDouble(ParametrsForActionTest.mas3),
                ParametrsForActionTest.a4));
    }

    @Test
    public void testFindLocalMaximumIfTrue() throws Exception {
        double expected = 600;
        assertEquals(expected, ActionWithVector.findLocalMaximum(new VectorDouble(ParametrsForActionTest.mas1)), delta);
    }

    @Test
    public void testFindLocalMaximumIfFalse() throws Exception {
        double expected = -1;
        assertEquals(expected, ActionWithVector.findLocalMaximum(new VectorDouble(ParametrsForActionTest.mas2)), delta);
        assertEquals(expected, ActionWithVector.findLocalMaximum(new VectorDouble(ParametrsForActionTest.masIsSortDecrise)), delta);
    }

    @Test(expected = Exception.class)
    public void testFindLocalMaximumIfVectorIsEmpty() throws Exception {
        ActionWithVector.findLocalMaximum(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test(expected = Exception.class)
    public void testFindElementLineSearchIfVectorIsEmpty() throws Exception {

        ActionWithVector.findElementLineSearch(new VectorDouble(ParametrsForActionTest.masDoubleNull), ParametrsForActionTest.a2);
    }

    @Test
    public void testFindElementLineSearch() throws Exception {
        boolean expexted = true;
        boolean expected1 = false;

        assertEquals(expexted, ActionWithVector.findElementLineSearch(new VectorDouble(ParametrsForActionTest.mas3),
                ParametrsForActionTest.a4));
        assertEquals(expected1, ActionWithVector.findElementLineSearch(new VectorDouble(ParametrsForActionTest.mas3),
                ParametrsForActionTest.a));
    }

    @Test(expected = Exception.class)
    public void testReverseVectorIfVectorIsEmpty() throws Exception {
        ActionWithVector.reverseVector(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testReverseVectorWhenSizeIs1() throws Exception {
        double[] expected = {1};
        assertTrue(Arrays.equals(expected, ActionWithVector.reverseVector(
                new VectorDouble(ParametrsForActionTest.mas4)).getVector()));
    }

    @Test
    public void testReverseVector() throws Exception {
      double [] expected = {44, -600, 89};
      double [] expected2 = {10_000.76, -900.4, 8.0, 7600,  -4500, 0, 600, -5000};
        assertArrayEquals(expected, ActionWithVector.reverseVector(
                new VectorDouble(ParametrsForActionTest.mas2)).getVector(), delta);
        assertArrayEquals(expected2, ActionWithVector.reverseVector(
                new VectorDouble(ParametrsForActionTest.mas1)).getVector(), delta);
    }

    @Test(expected = Exception.class)
    public void testSortBubbleDecriseIfVectorIsNull() throws Exception {
        ActionWithVector.sortBubbleDecrise(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testSortBubbleDecriseIfVectorSizeIs1() throws Exception {
        double [] expected = {1};
        assertArrayEquals(expected, ActionWithVector.sortBubbleDecrise(new VectorDouble(ParametrsForActionTest.mas4)).getVector(),delta);
    }

    @Test
    public void testSortBubbleDecrise() throws Exception {
        double [] expected = {10_000.76, 7600, 600,  8.0, 0, -900.4, -4500, -5000};
        assertArrayEquals(expected, ActionWithVector.sortBubbleDecrise(new VectorDouble(ParametrsForActionTest.mas1)).getVector(), delta);
    }







}
