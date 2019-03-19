package by.epam.maintasks1.krupin.AdditionalTask.model.data;

public class Matrix {

    private double[][] matr;

    public Matrix(int x, int y) {
        if (x < 0 || y < 0) {
            throw new NegativeArraySizeException("Wrong x or y");
        }
        matr = new double[x][y];
    }

    public Matrix(double[][] matr) {

        this.matr = matr;
    }

    public Matrix(Matrix matrix){
        matr = matrix.getMatr();
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

    public boolean checkRangeX(int x) {
        boolean check = true;

        if (matr.length < x) {
            check = false;
        }

        return check;
    }

    public boolean checkRangeXY(int x, int y) {
        boolean check = true;
        if(x >= 0 && y >= 0) {
            if (matr[x].length <= y || matr.length <= x) {
                 check = false;
            }
        }else{
            check = false;
        }

        return check;
    }

    @Override
    public String toString() {
        String res = "";

        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                res += matr[i][j] + " ";
            }
            res += "\n";
        }

        return res;
    }


}
