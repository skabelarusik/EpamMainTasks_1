package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;

import static by.epam.maintasks1.krupin.MainTask.model.logic.CheckerVectors.checkNullVector;
import static by.epam.maintasks1.krupin.MainTask.model.logic.CheckerVectors.isSortVector;

public class FinderForVectorElements {


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
}
