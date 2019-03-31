package by.epam.maintasks1.krupin.AdditionalTask.model.data;

public class Matrix {

    private double[][] matr;

    public Matrix(int x, int y) {
        if (x < 0 || y < 0) {
            throw new NegativeArraySizeException("Wrong x or y");
        }
        matr = new double[x][y];
    }

      public Matrix(double[][] matrix) {
        matr = new double[matrix.length][matrix[matrix.length-1].length];
        for(int i = 0; i < matrix.length ; i++){
            for(int j=0; j<matrix[matrix.length-1].length; j++){
                matr[i][j] = new Double(matrix[i][j]);
            }
        }
    }

    public Matrix(Matrix matrix){
        matr = new double[matrix.getMatr().length][matrix.getMatr()[matrix.getMatr().length-1].length];

        for(int i = 0; i < matrix.getMatr().length ; i++){
            for(int j=0; j<matrix.getMatr()[matrix.getMatr().length-1].length; j++){
                matr[i][j] = new Double(matrix.getMatr()[i][j]);
            }
        }
    }


    public void setElements(int x, int y, double value) {
        if (checkRangeXY(x, y)) {
            matr[x][y] = value;
        }
    }

    public double getElements(int x, int y) {
        if (!checkRangeXY(x, y)) {
            throw new NegativeArraySizeException("Wrong x or y");
        }

        return matr[x][y];
    }

    public double[][] getMatr() {
        return matr;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                stringBuilder.append(matr[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }


}
