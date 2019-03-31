package by.epam.maintasks1.krupin.AdditionalTask.model.logic;

import by.epam.maintasks1.krupin.AdditionalTask.model.data.Matrix;

import java.sql.SQLOutput;

public class MatrixActioner {


    public static boolean isMatrixSimmetricOnMainDiaginal(Matrix matrix) {
        boolean check = false;

        if (MatrixChecker.isSquareMatrix(matrix)) {
            if (matrix.getMatr().length == 1) {
                check = true;
            } else {
                check = true;

                for (int i = 0; i < matrix.getMatr().length; i++) {
                    for (int j = i + 1; j < matrix.getMatr().length; j++) {
                        if (j < matrix.getMatr().length) {
                            if (matrix.getElements(i, j) != matrix.getElements(j, i)) {
                                check = false;
                            }
                        }
                    }
                }
            }
        }

        return check;
    }

    public static Matrix transposeMatrix(Matrix matrix) throws Exception {
        if (MatrixChecker.checkIsMatrixNull(matrix)) {
           throw  new Exception("Error, matrix is null");
        }

        if (MatrixChecker.isSquareMatrix(matrix) == false) {

           throw  new Exception("Error, matrix is not square");
        }

        for (int i = 0; i < matrix.getMatr().length; i++) {
            for (int j = i + 1; j < matrix.getMatr().length; j++) {
                if (j < matrix.getMatr().length) {
                    matrix.setElements(i, j, matrix.getElements(i, j) + matrix.getElements(j, i));
                    matrix.setElements(j, i, matrix.getElements(i, j) - matrix.getElements(j, i));
                    matrix.setElements(i, j, matrix.getElements(i, j) - matrix.getElements(j, i));
                }
            }
        }

        return matrix;
    }
}
