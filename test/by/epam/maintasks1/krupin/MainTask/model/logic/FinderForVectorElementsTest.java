package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinderForVectorElementsTest {

    @Test
    public void testFindMaxElement() throws Exception {
        double expected1 = 10000.76;
        double expected2 = 89;
        double expected3 = 7600;
        double expected4 = 1;

        assertEquals(expected1, FinderForVectorElements.findMaxElement(new VectorDouble(ParametrsForActionTest.mas1)),
                ParametrsForActionTest.delta);
        assertEquals(expected2, FinderForVectorElements.findMaxElement(new VectorDouble(ParametrsForActionTest.mas2)),
                ParametrsForActionTest.delta);
        assertEquals(expected3, FinderForVectorElements.findMaxElement(new VectorDouble(ParametrsForActionTest.mas3)),
                ParametrsForActionTest.delta);
        assertEquals(expected4, FinderForVectorElements.findMaxElement(new VectorDouble(ParametrsForActionTest.mas4)),
                ParametrsForActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void  testFindMaxElementWithZeroLengthVector() throws Exception {
        FinderForVectorElements.findMaxElement(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testFindMinElement() throws Exception {
        double expected1 = -5000;
        double expected2 = -600;
        double expected3 = -4500;
        double expected4 = 1;

        assertEquals(expected1, FinderForVectorElements.findMinElement(new VectorDouble(ParametrsForActionTest.mas1)),
                ParametrsForActionTest.delta);
        assertEquals(expected2, FinderForVectorElements.findMinElement(new VectorDouble(ParametrsForActionTest.mas2)),
                ParametrsForActionTest.delta);
        assertEquals(expected3, FinderForVectorElements.findMinElement(new VectorDouble(ParametrsForActionTest.mas3)),
                ParametrsForActionTest.delta);
        assertEquals(expected4, FinderForVectorElements.findMinElement(new VectorDouble(ParametrsForActionTest.mas4)),
                ParametrsForActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void  testFindMinElementWithZeroLengthVector() throws Exception {
        FinderForVectorElements.findMinElement(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testFindAverageAriph() throws Exception {
        double expected1 = 976.045;
        double expected2 = -155.6666666666667;
        double expected3 = 1550;
        double expected4 = 1;

        assertEquals(expected1, ActionerWithVector.findAverageAriph(new VectorDouble(ParametrsForActionTest.mas1)),
                ParametrsForActionTest.delta);
        assertEquals(expected2, ActionerWithVector.findAverageAriph(new VectorDouble(ParametrsForActionTest.mas2)),
                ParametrsForActionTest.delta);
        assertEquals(expected3, ActionerWithVector.findAverageAriph(new VectorDouble(ParametrsForActionTest.mas3)),
                ParametrsForActionTest.delta);
        assertEquals(expected4, ActionerWithVector.findAverageAriph(new VectorDouble(ParametrsForActionTest.mas4)),
                ParametrsForActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testFindAverageAriphByNullVector() throws Exception {
        CheckerVectors.checkNullVector(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testFindAverageGeometric() throws Exception {
        double expected1 = 3.3097509196;
        double expected2 = 2.44948974;
        double expected5 = 7;

        assertEquals(expected1, ActionerWithVector.findAverageGeometr(new VectorInt(ParametrsForActionTest.mas01)),
                ParametrsForActionTest.delta);
        assertEquals(expected2, ActionerWithVector.findAverageGeometr(new VectorInt(ParametrsForActionTest.mas02)),
                ParametrsForActionTest.delta);
        assertEquals(expected5, ActionerWithVector.findAverageGeometr(new VectorInt(ParametrsForActionTest.mas05)),
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
        assertEquals(expected, FinderForVectorElements.findLocalMaximum(new VectorDouble(ParametrsForActionTest.masIsSortDecrise)),
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
        boolean expected1 = false;

        assertEquals(expexted, FinderForVectorElements.findElementLineSearch(new VectorDouble(ParametrsForActionTest.mas3),
                ParametrsForActionTest.a4));
        assertEquals(expected1, FinderForVectorElements.findElementLineSearch(new VectorDouble(ParametrsForActionTest.mas3),
                ParametrsForActionTest.a));
    }
}
