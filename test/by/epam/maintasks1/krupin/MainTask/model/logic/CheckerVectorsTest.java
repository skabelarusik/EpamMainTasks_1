package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CheckerVectorsTest {

    @Test(expected = Exception.class)
    public void testCheckNullDoubleVector() throws Exception {
        CheckerVectors.checkNullVector(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test(expected = Exception.class)
    public void testCheckNullIntVector() throws Exception {
        CheckerVectors.checkNullVector(new VectorInt(ParametrsForActionTest.masIntNull));
    }

    @Test(expected = Exception.class)
    public void testIsNaturalNumberInVectorInt() throws Exception {
        CheckerVectors.isNaturalNumber(new VectorInt(ParametrsForActionTest.mas03));
    }


    @Test(expected = Exception.class)
    public void testIsSortIncreaseIfNullVector() throws Exception {
        CheckerVectors.isSortIncrease(new VectorDouble(ParametrsForActionTest.masDoubleNull));

    }

    @Test
    public void testIsSortIncreaseIfSizeIsOne() throws Exception {
        boolean expected = false;
        assertEquals(expected, CheckerVectors.isSortIncrease(new VectorDouble(ParametrsForActionTest.mas4)));
    }

    @Test(expected = Exception.class)
    public void testIsSortDecreaseIfNullVector() throws Exception {
        CheckerVectors.isSortDecrease(new VectorDouble(ParametrsForActionTest.masDoubleNull));

    }

    @Test
    public void testIsSortIncreaseIfSizeMore1() throws Exception {
        boolean expected = true;
        assertEquals(expected, CheckerVectors.isSortIncrease(new VectorDouble(ParametrsForActionTest.mas3)));
    }

    @Test
    public void testIsSortDecreaseIfSizeIsOne() throws Exception {
        boolean expected = false;
        assertEquals(expected, CheckerVectors.isSortDecrease(new VectorDouble(ParametrsForActionTest.mas4)));
    }

    @Test
    public void testIsSortDecrease() throws Exception {
        boolean expected = true;
        assertEquals(expected, CheckerVectors.isSortDecrease(new VectorDouble(ParametrsForActionTest.masIsSortDecrise)));
    }

}
