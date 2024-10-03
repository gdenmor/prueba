public class Numero {
    private int max;
    private int min;
    public Numero() {

    }
    public Numero(int max, int min) {
        this.max = max;
        this.min = min;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int[] numerosPares(){
        int array[]=new int[100];
        for (int i=min;i<max;i++){
            if (i%2==0) {
                array[i] = i;
            }
        }
        return array;
    }
}
