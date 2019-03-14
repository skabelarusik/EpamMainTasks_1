package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;

public class ActionWithVector {

    //check double vector
    public static void checkNullVector(VectorDouble vector) throws Exception {
        if (vector.size() == 0) {
            throw new Exception("Vector is empty");
        }
    }

    //check int vector
    public static void checkNullVector(VectorInt vector) throws Exception {
        if (vector.size() == 0) {
            throw new Exception("Vector is empty");
        }
    }


    public static double findMaxElement(VectorDouble vector) throws Exception {
        //Is vector empty?
        checkNullVector(vector);

        double max = vector.getElement(0);

        if (vector.size() != 1) {
            for (int i = 1; i < vector.size(); i++) {
                if (vector.getElement(i) > max) {
                    max = vector.getElement(i);
                }
            }
        }
        return max;
    }

    public static double findMinElement(VectorDouble vector) throws Exception {
        //Is vector empty?
        checkNullVector(vector);

        double min = vector.getElement(0);

        if (vector.size() != 1) {
            for (int i = 1; i < vector.size(); i++) {
                if (vector.getElement(i) < min) {
                    min = vector.getElement(i);
                }
            }
        }
        return min;
    }

    public static double findAverageAriph(VectorDouble vector) throws Exception {
        //Is vector empty?
        checkNullVector(vector);

        double sum = 0;

        for (int i = 0; i < vector.size(); i++) {
            sum += vector.getElement(i);
        }

        return sum / vector.size();
    }

    public static double findAverageGeometr(VectorInt vector) throws Exception {
        //Is vector empty?
        checkNullVector(vector);
        //Is numbers natural?
        isNaturalNumber(vector);


        int multiply = 1;

        for (int i = 0; i < vector.size(); i++) {
            multiply *= vector.getElement(i);
        }

        return Math.pow(multiply, 1.0 / vector.size());
    }

    protected static void isNaturalNumber(VectorInt vectorInt) throws Exception {
        for (int i = 0; i < vectorInt.size(); i++) {
            if (vectorInt.getElement(i) <= 0) {
                throw new Exception("Numbers isnot natural in vector");
            }
        }
    }

    //Increase
    public static boolean isSortIncrease(VectorDouble vector) throws Exception {
        //Is vector empty?
        checkNullVector(vector);
        boolean check = true;
        //Does vector have one elements?
        if (vector.size() == 1) {
            check = false;
        } else {
            for (int i = 1; i < vector.size(); i++) {
                if (vector.getElement(i - 1) > vector.getElement(i)) {
                    check = false;
                }
            }
        }
        return check;
    }

    //decrease
    public static boolean isSortDecrease(VectorDouble vector) throws Exception {
        //Is vector empty?
        checkNullVector(vector);
        boolean check = true;
        //Does vector have one elements?
        if (vector.size() == 1) {
            check = false;
        } else {
            for (int i = 1; i < vector.size(); i++) {
                if (vector.getElement(i - 1) < vector.getElement(i)) {
                    check = false;
                }
            }
        }
        return check;
    }

    //Is vector sorted?
    public static boolean isSortVector(VectorDouble vector) throws Exception {
        boolean res = false;

        if (isSortDecrease(vector) || isSortIncrease(vector)) {
            res = true;
        }
        return res;
    }

    public static int binarySearch(VectorDouble vector, double a) throws Exception {
        int res = -1;

        //check vector(is sort?) and var a(range)
        if (isSortVector(vector) && ((a >= vector.getElement(0)
                && a <= vector.getElement(vector.size() - 1)) || (a <= vector.getElement(0)
                && a >= vector.getElement(vector.size() - 1)))) {
            //is a vector[0] or vector[size - 1]?
            if (a == vector.getElement(0)) {
                res = 0;
            } else {
                if (a == vector.getElement(vector.size() - 1)) {
                    res = vector.size() - 1;
                } else {
                    //binary search
                    int low = 0;
                    int high = vector.size() - 1;
                    int middle;
                    boolean status = true;

                    while (status) {
                        //check, maybe there are not var a in this vector
                        if (low >= high) {
                            status = false;
                        }

                        middle = (low + high) / 2;
                        if (vector.getElement(middle) == a) {
                            res = middle;
                            status = false;
                        } else {
                            if (a < vector.getElement(middle)) {
                                high = middle - 1;
                            } else {
                                low = middle + 1;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }


    public static double findLocalMaximum(VectorDouble vector) throws Exception {
        //Is vector empty?
        checkNullVector(vector);
        double maximum = -1;

        if (vector.size() > 2) {
            for (int i = 1; i < vector.size() - 1; i++) {
                if (vector.getElement(i) > vector.getElement(i - 1) && vector.getElement(i) > vector.getElement(i + 1)) {
                    maximum = vector.getElement(i);
                    return maximum;
                }
            }
        }
        return maximum;
    }

    public static boolean findElementLineSearch(VectorDouble vector, double elem) throws Exception {
        //Is vector empty?
        checkNullVector(vector);

        for (int i = 0; i < vector.size(); i++) {
            if (vector.getElement(i) == elem)
                return true;
        }

        return false;
    }

    public static VectorDouble reverseVector(VectorDouble vector) throws Exception {
        //Is vector empty?
        checkNullVector(vector);

        if (vector.size() > 1) {
            for (int i = 0; i < vector.size() / 2; i++) {
                vector.setElement(vector.getElement(i) + vector.getElement(vector.size() - i - 1), i);
                vector.setElement(vector.getElement(i) -
                        vector.getElement(vector.size() - i - 1), vector.size() - i - 1);
                vector.setElement(vector.getElement(i) - vector.getElement(vector.size() - i - 1), i);
            }
        }

        return vector;
    }

    public static VectorDouble sortBubbleDecrise(VectorDouble vector) throws Exception {
        //Is vector empty?
        checkNullVector(vector);

        if (vector.size() > 1) {
            boolean status = false;
            int count = 0;
            while (!status) {
                status = true;
                for (int i = 1; i < vector.size() - count; i++) {
                    if (vector.getElement(i) > vector.getElement(i - 1)) {
                        vector.setElement(vector.getElement(i) + vector.getElement(i - 1), i);
                        vector.setElement(vector.getElement(i) - vector.getElement(i - 1), i - 1);
                        vector.setElement(vector.getElement(i) - vector.getElement(i - 1), i);
                        status = false;
                    }
                }
                count++;
            }
        }
        return vector;
    }

    public static VectorDouble sortInserte(VectorDouble vectorDouble) throws Exception {
        //Is vector empty?
        checkNullVector(vectorDouble);

        for (int i = 1; i < vectorDouble.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (vectorDouble.getElement(j) < vectorDouble.getElement(j - 1)) {
                    double temp = vectorDouble.getElement(j);
                    vectorDouble.setElement(vectorDouble.getElement(j - 1), j);
                    vectorDouble.setElement(temp, j - 1);
                    // System.out.println(vectorDouble);
                }
            }
        }
        return vectorDouble;
    }


    public static VectorDouble sortSelect(VectorDouble vectorDouble) throws Exception {
        //Is vector empty?
        checkNullVector(vectorDouble);
        double min;
//  public static double [] mas = {-3.0 , -24.7, 8, 15, -21, 999.0, -4000};
        for (int i = 0; i < vectorDouble.size() - 1; i++) {
            min = vectorDouble.getElement(i);
            for (int j = i; j < vectorDouble.size(); j++) {
                if (min > vectorDouble.getElement(j)) {
                    vectorDouble.setElement(vectorDouble.getElement(j), i);
                    vectorDouble.setElement(min, j);
                    min = vectorDouble.getElement(i);
                }
            }
        }
        return vectorDouble;
    }

    public static VectorDouble sortMerge(VectorDouble vector1, VectorDouble vector2) throws Exception {
        //check if vector is null
        if (vector1.size() == 0) {
            if (vector2.size() == 0) {
                return vector2;
            } else {
                isSortVector(vector2);
                return vector2;
            }
        } else {
            if (vector2.size() == 0) {
                if (vector1.size() == 0) {
                    return vector1;
                } else {
                    isSortVector(vector1);
                    return vector1;
                }
            }
        }

        checkAreVectorsSort(vector1, vector2);

        VectorDouble vector = new VectorDouble(vector1.size() + vector2.size());
        int i = 0, j = 0;

        while (i + j < (vector1.size() + vector2.size())) {
            if (i < vector1.size() && j < vector2.size()) {
                if (vector1.getElement(i) < vector2.getElement(j)) {
                    vector.setElement(vector1.getElement(i), i + j);
                    i++;
                } else {
                    vector.setElement(vector2.getElement(j), i + j);
                    j++;
                }
            } else {
                if (i == (vector1.size())) {
                    vector.setElement(vector2.getElement(j), i + j);
                    j++;
                } else {
                    vector.setElement(vector1.getElement(i), i + j);
                    i++;
                }
            }
        }
        return vector;
    }

    public static void checkAreVectorsSort(VectorDouble vector1, VectorDouble vector2) throws Exception {
        if (!isSortIncrease(vector1) || !isSortIncrease(vector2)) {
            throw new Exception("Vector is not sorted");
        }
    }

    public static VectorDouble sortQuick(VectorDouble vectorDouble) throws Exception {
        checkNullVector(vectorDouble);

        int start = 0;
        int end = vectorDouble.size() - 1;
        int index = additionSortQuick(vectorDouble, start, end);
        if (start < index - 1) {
            additionSortQuick(vectorDouble, start, index);
        }
        if (index < end) {
            additionSortQuick(vectorDouble, index, end);
        }
        return vectorDouble;
    }

    private static int additionSortQuick(VectorDouble vector, int start, int end) throws Exception {
        int i = start, j = end;
        double tmp;
        double middle = vector.getElement((i + j) / 2);

        while (i <= j) {
            while ((vector.getElement(i) < middle)) {
                i++;
            }
            while (vector.getElement(j) > middle) {
                j--;
            }

            if (i <= j) {
                tmp = vector.getElement(i);
                vector.setElement(vector.getElement(j), i);
                vector.setElement(tmp, j);
                i++;
                j--;
            }
        }
        return i;
    }


}
