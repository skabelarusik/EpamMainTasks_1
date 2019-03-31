package by.epam.maintasks1.krupin.AdditionalTask.model.logic;

import static org.junit.Assert.assertEquals;

import by.epam.maintasks1.krupin.AdditionalTask.model.data.Matrix;
import by.epam.maintasks1.krupin.MainTask.model.logic.ParametrsForActionTest;
import org.junit.Test;

public class MatrixFinderTest {

    @Test(expected = Exception.class)
    public void testFindMaxElementsIfMatrixIsNull() throws Exception {
        MatrixFinder.findMaxElement(new Matrix(ParamTest.matrNull));
    }

    @Test
    public void testFindMaxElement() throws Exception {
        double expected = 1500.0;

        assertEquals(expected, MatrixFinder.findMaxElement(new Matrix(ParamTest.matr)),
                ParamTest.delta);

    }

    @Test(expected = Exception.class)
    public void testFindMinElementsIfMatrixIsNull() throws Exception {
        MatrixFinder.findMinElement(new Matrix(ParamTest.matrNull));
    }

    @Test
    public void testFindMinElement() throws Exception {
        double expected = -1000;

        assertEquals(expected, MatrixFinder.findMinElement(new Matrix(ParamTest.matr)),
                ParamTest.delta);

    }
}
