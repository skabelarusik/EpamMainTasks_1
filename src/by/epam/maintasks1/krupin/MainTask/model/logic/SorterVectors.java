package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;

import static by.epam.maintasks1.krupin.MainTask.model.logic.VectorActioner.checkAreVectorsSort;
import static by.epam.maintasks1.krupin.MainTask.model.logic.VectorChecker.checkNullVector;
import static by.epam.maintasks1.krupin.MainTask.model.logic.VectorChecker.isSortVector;

public class SorterVectors {


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
