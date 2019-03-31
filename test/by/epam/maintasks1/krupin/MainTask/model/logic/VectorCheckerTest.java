package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class VectorCheckerTest {

    @Test(expected = Exception.class)
    public void testCheckNullDoubleVector() throws Exception {
        VectorChecker.checkNullVector(new VectorDouble(ParametrsActionTest.masDoubleNull));
    }

    @Test(expected = Exception.class)
    public void testCheckNullIntVector() throws Exception {
        VectorChecker.checkNullVector(new VectorInt(ParametrsActionTest.masIntNull));
    }

    @Test(expected = Exception.class)
    public void testIsNaturalNumberInVectorInt() throws Exception {
        VectorChecker.isNaturalNumber(new VectorInt(ParametrsActionTest.mas03));
    }


    @Test(expected = Exception.class)
    public void testIsSortIncreaseIfNullVector() throws Exception {
        VectorChecker.isSortIncrease(new VectorDouble(ParametrsActionTest.masDoubleNull));

    }

    @Test
    public void testIsSortIncreaseIfSizeIsOne() throws Exception {
        boolean expected = false;
        assertEquals(expected, VectorChecker.isSortIncrease(new VectorDouble(ParametrsActionTest.mas4)));
    }

    @Test(expected = Exception.class)
    public void testIsSortDecreaseIfNullVector() throws Exception {
        VectorChecker.isSortDecrease(new VectorDouble(ParametrsActionTest.masDoubleNull));

    }

    @Test
    public void testIsSortIncreaseIfSizeMore1() throws Exception {
        boolean expected = true;
        assertEquals(expected, VectorChecker.isSortIncrease(new VectorDouble(ParametrsActionTest.mas3)));
    }

    @Test
    public void testIsSortDecreaseIfSizeIsOne() throws Exception {
        boolean expected = false;
        assertEquals(expected, VectorChecker.isSortDecrease(new VectorDouble(ParametrsActionTest.mas4)));
    }

    @Test
    public void testIsSortDecrease() throws Exception {
        boolean expected = true;
        assertEquals(expected, VectorChecker.isSortDecrease(new VectorDouble(ParametrsActionTest.masIsSortDecrise)));
    }

}
