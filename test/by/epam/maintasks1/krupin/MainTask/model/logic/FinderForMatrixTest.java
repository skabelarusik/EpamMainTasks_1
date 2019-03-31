package by.epam.maintasks1.krupin.AdditionalTask.model.logic;

import static org.junit.Assert.assertEquals;

import by.epam.maintasks1.krupin.AdditionalTask.model.data.Matrix;
import by.epam.maintasks1.krupin.MainTask.model.logic.ParametrsForActionTest;
import org.junit.Test;

public class FinderForMatrixTest {

    @Test(expected = Exception.class)
    public void testFindMaxElementsIfMatrixIsNull() throws Exception {
        FinderForMatrix.findMaxElement(new Matrix(ParamForTest.matrNull));
    }

    @Test
    public void testFindMaxElement() throws Exception {
        double expected = 1500.0;

        assertEquals(expected, FinderForMatrix.findMaxElement(new Matrix(ParamForTest.matr)),
                ParamForTest.delta);

    }

    @Test(expected = Exception.class)
    public void testFindMinElementsIfMatrixIsNull() throws Exception {
        FinderForMatrix.findMinElement(new Matrix(ParamForTest.matrNull));
    }

    @Test
    public void testFindMinElement() throws Exception {
        double expected = -1000;

        assertEquals(expected, FinderForMatrix.findMinElement(new Matrix(ParamForTest.matr)),
                ParamForTest.delta);

    }
}
