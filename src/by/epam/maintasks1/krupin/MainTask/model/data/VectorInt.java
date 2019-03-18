package by.epam.maintasks1.krupin.MainTask.model.data;

public class VectorInt {
    private int [] vector;

    public VectorInt(int[] vector){
        this.vector = vector;
    }

    public VectorInt(int n) throws Exception {
        checkIndex(n);
        this.vector = new int[n];
    }

    public VectorInt(VectorInt vectorInt){
        this.vector = vectorInt.getVector();
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int size(){
        return vector.length;
    }

    public void setElement(int a, int numb) throws Exception {
        checkIndex(numb);

        vector[numb] = a;
    }

    public int getElement(int numb) throws Exception {
        checkIndex(numb);

        return vector[numb];
    }

    //Does vector have this element?
    public void checkIndex(int a) throws Exception {
        if(a < 0 || a >= vector.length){
            throw new Exception("Wrong number");
        }
    }

    @Override
    public String toString() {
        String string = "";
        for(int x : vector){
            string += (x + " ");
        }
        return string;
    }
}
