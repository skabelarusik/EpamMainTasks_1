package by.epam.maintasks1.krupin.AdditionalTask.model.logic;

import by.epam.maintasks1.krupin.AdditionalTask.model.data.Matrix;

public class FinderForMatrix {

    public static double findMaxElement(Matrix matrix) throws Exception {
        if(CheckerForMatrix.checkIsMatrixNull(matrix)){
            throw new Exception("Null matrix");
        }

        double max = matrix.getMatr()[0][0];

        for(int i = 0; i < matrix.getMatr().length; i++){
            for(int j = 0; j < matrix.getMatr()[i].length; j++){
                if(max < matrix.getMatr()[i][j]){
                    max = matrix.getMatr()[i][j];
                }
            }
        }

        return max;
    }

    public static double findMinElement(Matrix matrix) throws Exception {
        if(CheckerForMatrix.checkIsMatrixNull(matrix)){
            throw new Exception("Null matrix");
        }

        double min = matrix.getMatr()[0][0];

        for(int i = 0; i < matrix.getMatr().length; i++){
            for(int j = 0; j < matrix.getMatr()[i].length; j++){
                if(min > matrix.getMatr()[i][j]){
                    min = matrix.getMatr()[i][j];
                }
            }
        }

        return min;
    }

}
