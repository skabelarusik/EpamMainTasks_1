package by.epam.maintasks1.krupin.MainTask.controller;

import by.epam.maintasks1.krupin.MainTask.model.data.VectorDouble;
import by.epam.maintasks1.krupin.MainTask.model.data.VectorInt;
import by.epam.maintasks1.krupin.MainTask.model.logic.ActionWithVector;

/** There are a lot of operations with double or int vectors
 *  Autor  -  Andrey Krupin
 *  Development start is 2.03.2019
 */

public class Main {
    public static double [] mas = {3.0 , -2, 8,-25,-15,  150,-4000};
    public static int [] mas1 = {2,3,4,5,6};
    public static double [] mas2 = {9, 25, 55, 78};
    public static double [] mas4 = {9000, -500, -1500.6};
    public static double [] mas5 = {-5000, 600, 0 , -4500, 7600, 8.0, -900.4, 10_000.76};

    public static void main(String[] args) throws Exception {

     //   System.out.println(ActionWithVector.sortInserte(new VectorDouble(mas2)));
      //  System.out.println(ActionWithVector.sortSelect(new VectorDouble(mas)));
     //   System.out.println(ActionWithVector.sortMerge(new VectorDouble(mas), new VectorDouble(mas2)));
      //  System.out.println(ActionWithVector.binarySearch(new VectorDouble(mas4), -500));
        System.out.println(ActionWithVector.sortBubbleDecrise(new VectorDouble(mas5)));

    }
}
