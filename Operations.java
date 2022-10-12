public class Operations {
    
    int array[];
    
    public void setArray(int[] array) {
        this.array = array;
    }
    

    int sum1 = 0;
    public int getSum1() {
        for(int i = 1; i < array.length; i++){
            sum1 = sum1 + array[i];
        }
        return sum1;
    }
    int sum2 = 0;
    public int getSum2(){
        for (int i = 1; i < array.length; i++){
            sum2 = sum2 + array[i];
        }
        return sum2;
    }

    int diff = 0;

    public int getdiff(){
        diff = sum1 - sum2;
        return diff;
    }
    
    

}   
