package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class VectorSorterTest {


    @Test(expected = Exception.class)
    public void testSortBubbleDecriseIfVectorIsNull() throws Exception {
        VectorSorter.sortBubbleDecrise(new VectorDouble(ParametrsActionTest.masDoubleNull));
    }

    @Test
    public void testSortBubbleDecriseIfVectorSizeIs1() throws Exception {
        double [] expected = {1};
        assertArrayEquals(expected, VectorSorter.sortBubbleDecrise(new VectorDouble(ParametrsActionTest.mas4)).getVector(),
                ParametrsActionTest.delta);
    }

    @Test
    public void testSortBubbleDecrise() throws Exception {
        double [] expected = {10_000.76, 7600, 600,  8.0, 0, -900.4, -4500, -5000};
        assertArrayEquals(expected, VectorSorter.sortBubbleDecrise(new VectorDouble(ParametrsActionTest.mas1)).getVector(),
                ParametrsActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testSortInserteIfVectorIsNull() throws Exception {
        VectorSorter.sortInserte(new VectorDouble(ParametrsActionTest.masDoubleNull));
    }

    @Test
    public void testSortInserteIfVectorIs1() throws Exception {
        double[] expected = {1};
        assertArrayEquals(expected, VectorSorter.sortInserte(new VectorDouble(ParametrsActionTest.mas4)).getVector(),
                ParametrsActionTest.delta);
    }

    @Test
    public void testSortInserte() throws Exception {
        double [] expected = {-5000, -4500, -900.4, 0, 8, 600, 7600, 10_000.76};
        assertArrayEquals(expected, VectorSorter.sortInserte(new VectorDouble(ParametrsActionTest.mas1)).getVector(),
                ParametrsActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testSortSelectIfVectorIsNull() throws Exception {
        VectorSorter.sortSelect(new VectorDouble(ParametrsActionTest.masDoubleNull));
    }

    @Test
    public void testSortSelectIfVectorIs1() throws Exception {
        double[] expected = {1};
        assertArrayEquals(expected, VectorSorter.sortSelect(new VectorDouble(ParametrsActionTest.mas4)).getVector(),
                ParametrsActionTest.delta);
    }

    @Test
    public void testSortSelect() throws Exception {
        double [] expected = {-5000, -4500, -900.4, 0, 8, 600, 7600, 10_000.76};
        assertArrayEquals(expected, VectorSorter.sortSelect(new VectorDouble(ParametrsActionTest.mas1)).getVector(),
                ParametrsActionTest.delta);
    }

    @Test(expected = Exception.class)
    public void testMergeIfVectorsNonSorted() throws Exception {
        VectorSorter.sortMerge(new VectorDouble(ParametrsActionTest.mas2),
                new VectorDouble(ParametrsActionTest.mas3));
    }

    @Test
    public void testSortMergeIfVectorsIsNull() throws Exception {
        double[] expected = {};

        assertArrayEquals(expected, VectorSorter.sortMerge(new VectorDouble(ParametrsActionTest.masDoubleNull),
                new VectorDouble(ParametrsActionTest.masDoubleNull)).getVector(), ParametrsActionTest.delta);
    }

    @Test
    public void testSortMergeIfOneVectorIsNull() throws Exception {
        double[] expected = {9000, -500, -1500.6};

        assertArrayEquals(expected, VectorSorter.sortMerge(new VectorDouble(ParametrsActionTest.masDoubleNull),
                new VectorDouble(ParametrsActionTest.masIsSortDecrise)).getVector(), ParametrsActionTest.delta);
    }

    @Test
    public void testSortMerge() throws Exception {
        double[] expected = {-4500, -4500, 7600, 7600};

        assertArrayEquals(expected, VectorSorter.sortMerge(new VectorDouble(ParametrsActionTest.mas3),
                new VectorDouble(ParametrsActionTest.mas3)).getVector(), ParametrsActionTest.delta);

    }

    @Test(expected = Exception.class)
    public void testSortQuickIfVectorIsNull() throws Exception {
        VectorSorter.sortQuick(new VectorDouble(ParametrsActionTest.masDoubleNull));
    }

    @Test
    public void testSortQuickIfVectorIs1() throws Exception {
        double[] expected = {1};
        assertArrayEquals(expected, VectorSorter.sortQuick(new VectorDouble(ParametrsActionTest.mas4)).getVector(),
                ParametrsActionTest.delta);
    }

    @Test
    public void testSortQuick() throws Exception {
        double [] expected = {-5000 ,-4500 ,-900.4 ,0 ,8.0 ,600, 7600 ,10_000.76};
        assertArrayEquals(expected, VectorSorter.sortQuick(new VectorDouble(ParametrsActionTest.mas1)).getVector(),
                ParametrsActionTest.delta);
    }
}
