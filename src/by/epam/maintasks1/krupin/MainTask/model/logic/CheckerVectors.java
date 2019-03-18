package by.epam.maintasks1.krupin.MainTask.model.logic;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;

public class CheckerVectors {

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
}
