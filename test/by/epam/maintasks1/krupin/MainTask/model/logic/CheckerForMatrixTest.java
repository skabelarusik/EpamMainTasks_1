package by.epam.maintasks1.krupin.AdditionalTask.model.logic;

import by.epam.maintasks1.krupin.AdditionalTask.model.data.Matrix;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckerForMatrixTest {

    @Test
    public void checkIsMatrixNullTest(){
        assertTrue(CheckerForMatrix.checkIsMatrixNull(new Matrix(ParamForTest.matrNull)));
    }

    @Test
    public void isSquareMatrixTest(){
        assertTrue(CheckerForMatrix.isSquareMatrix(new Matrix(ParamForTest.matrSquareSimm)));
    }

}
