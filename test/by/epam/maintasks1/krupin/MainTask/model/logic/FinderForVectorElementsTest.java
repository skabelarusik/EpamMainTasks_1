package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinderForVectorElementsTest {

    @Test
    public void testFindMaxElement() throws Exception {
        double expected1 = 10000.76;

        assertEquals(expected1, FinderForVectorElements.findMaxElement(new VectorDouble(ParametrsForActionTest.mas1)),
                ParametrsForActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void  testFindMaxElementWithZeroLengthVector() throws Exception {
        FinderForVectorElements.findMaxElement(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testFindMinElement() throws Exception {
        double expected1 = -5000;

        assertEquals(expected1, FinderForVectorElements.findMinElement(new VectorDouble(ParametrsForActionTest.mas1)),
                ParametrsForActionTest.delta);

    }

    @Test(expected = Exception.class)
    public void  testFindMinElementWithZeroLengthVector() throws Exception {
        FinderForVectorElements.findMinElement(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testFindAverageAriph() throws Exception {
        double expected1 = 976.045;

        assertEquals(expected1, ActionerWithVector.findAverageAriph(new VectorDouble(ParametrsForActionTest.mas1)),
                ParametrsForActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testFindAverageAriphByNullVector() throws Exception {
        CheckerVectors.checkNullVector(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testFindAverageGeometric() throws Exception {
        double expected1 = 3.3097509196;

        assertEquals(expected1, ActionerWithVector.findAverageGeometr(new VectorInt(ParametrsForActionTest.mas01)),
                ParametrsForActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testFindAverageGeometricByNullVector() throws Exception {
        ActionerWithVector.findAverageGeometr(new VectorInt(ParametrsForActionTest.masIntNull));
    }


    @Test
    public void testFindLocalMaximumIfTrue() throws Exception {
        double expected = 600;
        assertEquals(expected, FinderForVectorElements.findLocalMaximum(new VectorDouble(ParametrsForActionTest.mas1)),
                ParametrsForActionTest.delta);
    }

    @Test
    public void testFindLocalMaximumIfFalse() throws Exception {
        double expected = -1;
        assertEquals(expected, FinderForVectorElements.findLocalMaximum(new VectorDouble(ParametrsForActionTest.mas2)),
                ParametrsForActionTest.delta);

    }

    @Test(expected = Exception.class)
    public void testFindLocalMaximumIfVectorIsEmpty() throws Exception {
        FinderForVectorElements.findLocalMaximum(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test(expected = Exception.class)
    public void testFindElementLineSearchIfVectorIsEmpty() throws Exception {

        FinderForVectorElements.findElementLineSearch(new VectorDouble(ParametrsForActionTest.masDoubleNull), ParametrsForActionTest.a2);
    }

    @Test
    public void testFindElementLineSearch() throws Exception {
        boolean expexted = true;

        assertEquals(expexted, FinderForVectorElements.findElementLineSearch(new VectorDouble(ParametrsForActionTest.mas3),
                ParametrsForActionTest.a4));

    }
}
