package by.epam.maintasks1.krupin.MainTask.model.data;


import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class VectorDouble {
    private double [] vector;

    public VectorDouble(double[] vector){
        this.vector = vector;
    }

    public VectorDouble(int n) throws Exception {
       if(n < 0){
           throw new Exception("Wrong index");
       }
        this.vector = new double[n];
    }

    public VectorDouble(VectorDouble vectorDouble){
        this.vector = vectorDouble.getVector();
    }


    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }

    public int size(){
        return vector.length;
    }

    public void setRandomElements(double maxValue){
        Random random = new Random();

        for(int i = 0; i < vector.length; i++){
            vector[i] = random.nextDouble() * maxValue;
        }
    }

    public void setElement(double a, int numb) throws Exception {
        checkIndex(numb);

        vector[numb] = a;
    }

    public double getElement(int numb) throws Exception {
        checkIndex(numb);

        return vector[numb];
    }

    //Does vector have this element?
    private void checkIndex(int a) throws Exception {
        if(a < 0 || a >= vector.length){
            throw new Exception("Wrong number");
        }
    }

    @Override
    public String toString() {
        String string = "";
        for(double x : vector){
            string += (x + " ");
        }
        return string;
    }
}
