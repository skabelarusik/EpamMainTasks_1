package by.epam.maintasks1.krupin.AdditionalTask.model.logic;

import by.epam.maintasks1.krupin.AdditionalTask.model.data.Matrix;

public class CheckerForMatrix {

    public static boolean checkIsMatrixNull(Matrix matrix){
        boolean check = false;

        if(matrix.getMatr().length == 0){
            check = true;
        }

        return check;
    }

    public static boolean isSquareMatrix(Matrix matrix){
        boolean check = true;

        if(matrix.getMatr().length != matrix.getMatr()[matrix.getMatr().length - 1].length){
            check = false;
        }

        return check;
    }

}
