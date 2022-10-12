import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
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
