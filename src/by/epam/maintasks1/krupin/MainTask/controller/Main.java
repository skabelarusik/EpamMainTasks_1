package by.epam.maintasks1.krupin.MainTask.controller;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;
import by.epam.maintasks1.krupin.MainTask.model.logic.ActionWithVector;

/** There are a lot of operations with double or int vectors
 *  Autor  -  Andrey Krupin
 *  Development start is 2.03.2019
 */

public class Main {


    public static void main(String[] args) throws Exception {
        VectorDouble vectorDouble = new VectorDouble(5);
        vectorDouble.setRandomElements(50);
        System.out.println(vectorDouble);
    }


}
