package by.epam.maintasks1.krupin.AdditionalTask.model.logic;

import by.epam.maintasks1.krupin.AdditionalTask.model.data.Matrix;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixActionerTest {

    @Test
    public void isMatrixSimetricOnMainDiagonalIfNonSquareMatrTest(){
        assertFalse(MatrixActioner.isMatrixSimmetricOnMainDiaginal(new Matrix(ParamTest.matr)));
    }

    @Test
    public void isMatrixSimetricOnMainDiagonalTest(){
        assertTrue(MatrixActioner.isMatrixSimmetricOnMainDiaginal(new Matrix(ParamTest.matrOneElement)));
    }

    @Test(expected = Exception.class)
    public void transposeMatrixIfMatrixIsNullTest() throws Exception {
        MatrixActioner.transposeMatrix(new Matrix(ParamTest.matrNull));
    }

    @Test(expected = Exception.class)
    public void transposeMatrixIfMatrixIsNonSquareTest() throws Exception {
        MatrixActioner.transposeMatrix(new Matrix(ParamTest.matr));
    }

    @Test
    public void transposeMatrixTest() throws Exception {
        double [][] expected = {{2,1,3},{1,1,1},{3,1,2}};
        assertArrayEquals(expected, MatrixActioner.transposeMatrix(new Matrix(ParamTest.matrSquareSimm)).getMatr(),
                ParamTest.delta);
    }
}
