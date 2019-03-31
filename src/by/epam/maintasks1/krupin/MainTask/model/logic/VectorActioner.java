package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;

import static by.epam.maintasks1.krupin.MainTask.model.logic.VectorChecker.*;

public class VectorActioner {


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


    public static void checkAreVectorsSort(VectorDouble vector1, VectorDouble vector2) throws Exception {
        if (!isSortIncrease(vector1) || !isSortIncrease(vector2)) {
            throw new Exception("Vector is not sorted");
        }
    }

}
