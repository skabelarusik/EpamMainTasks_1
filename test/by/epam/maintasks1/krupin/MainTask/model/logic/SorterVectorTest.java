package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SorterVectorTest {


    @Test(expected = Exception.class)
    public void testSortBubbleDecriseIfVectorIsNull() throws Exception {
        SorterVectors.sortBubbleDecrise(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testSortBubbleDecriseIfVectorSizeIs1() throws Exception {
        double [] expected = {1};
        assertArrayEquals(expected, SorterVectors.sortBubbleDecrise(new VectorDouble(ParametrsForActionTest.mas4)).getVector(),
                ParametrsForActionTest.delta);
    }

    @Test
    public void testSortBubbleDecrise() throws Exception {
        double [] expected = {10_000.76, 7600, 600,  8.0, 0, -900.4, -4500, -5000};
        assertArrayEquals(expected, SorterVectors.sortBubbleDecrise(new VectorDouble(ParametrsForActionTest.mas1)).getVector(),
                ParametrsForActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testSortInserteIfVectorIsNull() throws Exception {
        SorterVectors.sortInserte(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testSortInserteIfVectorIs1() throws Exception {
        double[] expected = {1};
        assertArrayEquals(expected, SorterVectors.sortInserte(new VectorDouble(ParametrsForActionTest.mas4)).getVector(),
                ParametrsForActionTest.delta);
    }

    @Test
    public void testSortInserte() throws Exception {
        double [] expected = {-5000, -4500, -900.4, 0, 8, 600, 7600, 10_000.76};
        assertArrayEquals(expected, SorterVectors.sortInserte(new VectorDouble(ParametrsForActionTest.mas1)).getVector(),
                ParametrsForActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testSortSelectIfVectorIsNull() throws Exception {
        SorterVectors.sortSelect(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testSortSelectIfVectorIs1() throws Exception {
        double[] expected = {1};
        assertArrayEquals(expected, SorterVectors.sortSelect(new VectorDouble(ParametrsForActionTest.mas4)).getVector(),
                ParametrsForActionTest.delta);
    }

    @Test
    public void testSortSelect() throws Exception {
        double [] expected = {-5000, -4500, -900.4, 0, 8, 600, 7600, 10_000.76};
        assertArrayEquals(expected, SorterVectors.sortSelect(new VectorDouble(ParametrsForActionTest.mas1)).getVector(),
                ParametrsForActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testMergeIfVectorsNonSorted() throws Exception {
        SorterVectors.sortMerge(new VectorDouble(ParametrsForActionTest.mas2),
                new VectorDouble(ParametrsForActionTest.mas3));
    }

    @Test
    public void testSortMergeIfVectorsIsNull() throws Exception {
        double[] expected = {};

        assertArrayEquals(expected, SorterVectors.sortMerge(new VectorDouble(ParametrsForActionTest.masDoubleNull),
                new VectorDouble(ParametrsForActionTest.masDoubleNull)).getVector(), ParametrsForActionTest.delta);
    }

    @Test
    public void testSortMergeIfOneVectorIsNull() throws Exception {
        double[] expected = {9000, -500, -1500.6};

        assertArrayEquals(expected, SorterVectors.sortMerge(new VectorDouble(ParametrsForActionTest.masDoubleNull),
                new VectorDouble(ParametrsForActionTest.masIsSortDecrise)).getVector(), ParametrsForActionTest.delta);
    }

    @Test
    public void testSortMerge() throws Exception {
        double[] expected = {-4500, -4500, 7600, 7600};

        assertArrayEquals(expected, SorterVectors.sortMerge(new VectorDouble(ParametrsForActionTest.mas3),
                new VectorDouble(ParametrsForActionTest.mas3)).getVector(), ParametrsForActionTest.delta);

    }

    @Test(expected = Exception.class)
    public void testSortQuickIfVectorIsNull() throws Exception {
        SorterVectors.sortQuick(new VectorDouble(ParametrsForActionTest.masDoubleNull));
    }

    @Test
    public void testSortQuickIfVectorIs1() throws Exception {
        double[] expected = {1};
        assertArrayEquals(expected, SorterVectors.sortQuick(new VectorDouble(ParametrsForActionTest.mas4)).getVector(),
                ParametrsForActionTest.delta);
    }

    @Test
    public void testSortQuick() throws Exception {
        double [] expected = {-5000 ,-4500 ,-900.4 ,0 ,8.0 ,600, 7600 ,10_000.76};
        assertArrayEquals(expected, SorterVectors.sortQuick(new VectorDouble(ParametrsForActionTest.mas1)).getVector(),
                ParametrsForActionTest.delta);
    }
}
