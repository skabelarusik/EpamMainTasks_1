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

    public VectorInt(VectorInt vectorInt) throws Exception {
        vector = new int [vectorInt.size()];
        for(int i = 0; i < vectorInt.size(); i++){
            vector[i] = new Integer(vectorInt.getElement(i));
        }
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int x : vector){
            stringBuilder.append(x).append(" ");
        }
        return stringBuilder.toString();
    }
}
