import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Operations {
    
    int array[];
    
    public void setArray(int[] array) {
        this.array = array;
    }
    

    int sum1 = 0;
    public static int getSum1() {
        for(int i = 1; i < array.length; i++){
            sum1 = sum1 + array[i];
        }
        return sum1;
    }
    int sum2 = 0;
    public static int getSum2(){
        for (int i = 1; i < array.length; i++){
            sum2 = sum2 + array[i];
        }
        return sum2;
    }

    int diff = 0;

    public static int getdiff(){
        diff = sum1 - sum2;
        return diff;
    }

    public static void main(String [] args){
        int[] array = new int[10];
    
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < array.length; i++){
            int x = in.nextInt();
        
        }

        Arrays.sort(array);
        Operations obj = new Operations();
        obj.setArray(array);
        
        System.out.println("1st sum without smallest =  " + obj.getSum1() );
        System.out.println("The smallest element is = " + array[0]);
        System.out.println("Upadate the smallest element : ");
        Random xp = new Random();
        array[0] = xp.nextInt(20);
        Arrays.sort(array);
        obj.setArray(array);

        System.out.println("2nd sum without smallest = " + obj.getSum2());
        System.out.println("difference between 2 sum = " + obj.getdiff() );
    }
}   
