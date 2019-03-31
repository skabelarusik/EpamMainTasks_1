package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VectorElementsFinderTest {

    @Test
    public void testFindMaxElement() throws Exception {
        double expected1 = 10000.76;

        assertEquals(expected1, VectorElementsFinder.findMaxElement(new VectorDouble(ParametrsForActionTest.mas1)),
                ParametrsActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void  testFindMaxElementWithZeroLengthVector() throws Exception {
        VectorElementsFinder.findMaxElement(new VectorDouble(ParametrsActionTest.masDoubleNull));
    }

    @Test
    public void testFindMinElement() throws Exception {
        double expected1 = -5000;

        assertEquals(expected1, VectorElementsFinder.findMinElement(new VectorDouble(ParametrsActionTest.mas1)),
                ParametrsActionTest.delta);

    }

    @Test(expected = Exception.class)
    public void  testFindMinElementWithZeroLengthVector() throws Exception {
        VectorElementsFinder.findMinElement(new VectorDouble(ParametrsActionTest.masDoubleNull));
    }

    @Test
    public void testFindAverageAriph() throws Exception {
        double expected1 = 976.045;

        assertEquals(expected1, VectorElementsFinder.findAverageAriph(new VectorDouble(ParametrsActionTest.mas1)),
                ParametrsActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testFindAverageAriphByNullVector() throws Exception {
        VectorChecker.checkNullVector(new VectorDouble(ParametrsActionTest.masDoubleNull));
    }

    @Test
    public void testFindAverageGeometric() throws Exception {
        double expected1 = 3.3097509196;

        assertEquals(expected1, VectorActioner.findAverageGeometr(new VectorInt(ParametrsActionTest.mas01)),
                ParametrsActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testFindAverageGeometricByNullVector() throws Exception {
        VectorActioner.findAverageGeometr(new VectorInt(ParametrsActionTest.masIntNull));
    }


    @Test
    public void testFindLocalMaximumIfTrue() throws Exception {
        double expected = 600;
        assertEquals(expected, VectorElementsFinder.findLocalMaximum(new VectorDouble(ParametrsActionTest.mas1)),
                ParametrsActionTest.delta);
    }

    @Test
    public void testFindLocalMaximumIfFalse() throws Exception {
        double expected = -1;
        assertEquals(expected, VectorElementsFinder.findLocalMaximum(new VectorDouble(ParametrsActionTest.mas2)),
                ParametrsActionTest.delta);

    }

    @Test(expected = Exception.class)
    public void testFindLocalMaximumIfVectorIsEmpty() throws Exception {
        VectorElementsFinder.findLocalMaximum(new VectorDouble(ParametrsActionTest.masDoubleNull));
    }

    @Test(expected = Exception.class)
    public void testFindElementLineSearchIfVectorIsEmpty() throws Exception {

        VectorElementsFinder.findElementLineSearch(new VectorDouble(ParametrsActionTest.masDoubleNull), ParametrsActionTest.a2);
    }

    @Test
    public void testFindElementLineSearch() throws Exception {
        boolean expexted = true;

        assertEquals(expexted, VectorElementsFinder.findElementLineSearch(new VectorDouble(ParametrsActionTest.mas3),
                ParametrsActionTest.a4));

    }
}
