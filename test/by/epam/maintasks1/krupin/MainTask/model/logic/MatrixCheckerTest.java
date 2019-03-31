package by.epam.maintasks1.krupin.AdditionalTask.model.logic;

import by.epam.maintasks1.krupin.AdditionalTask.model.data.Matrix;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckerTest {

    @Test
    public void checkIsMatrixNullTest(){
        assertTrue(MatrixChecker.checkIsMatrixNull(new Matrix(ParamTest.matrNull)));
    }

    @Test
    public void isSquareMatrixTest(){
        assertTrue(MatrixChecker.isSquareMatrix(new Matrix(ParamTest.matrSquareSimm)));
    }

}
