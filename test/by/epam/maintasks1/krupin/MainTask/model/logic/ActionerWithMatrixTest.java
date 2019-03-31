package by.epam.maintasks1.krupin.AdditionalTask.model.logic;

import by.epam.maintasks1.krupin.AdditionalTask.model.data.Matrix;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ActionerWithMatrixTest {

    @Test
    public void isMatrixSimetricOnMainDiagonalIfNonSquareMatrTest(){
        assertFalse(ActionerWithMatrix.isMatrixSimmetricOnMainDiaginal(new Matrix(ParamForTest.matr)));
    }

    @Test
    public void isMatrixSimetricOnMainDiagonalTest(){
        assertTrue(ActionerWithMatrix.isMatrixSimmetricOnMainDiaginal(new Matrix(ParamForTest.matrOneElement)));
    }

    @Test(expected = Exception.class)
    public void transposeMatrixIfMatrixIsNullTest() throws Exception {
        ActionerWithMatrix.transposeMatrix(new Matrix(ParamForTest.matrNull));
    }

    @Test(expected = Exception.class)
    public void transposeMatrixIfMatrixIsNonSquareTest() throws Exception {
        ActionerWithMatrix.transposeMatrix(new Matrix(ParamForTest.matr));
    }

    @Test
    public void transposeMatrixTest() throws Exception {
        double [][] expected = {{2,1,3},{1,1,1},{3,1,2}};
        assertArrayEquals(expected, ActionerWithMatrix.transposeMatrix(new Matrix(ParamForTest.matrSquareSimm)).getMatr(),
                ParamForTest.delta);
    }
}
