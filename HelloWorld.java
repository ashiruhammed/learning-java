import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {
        int[][] arr =  {{1,2,3}, {2,3,5}};
       for(int i = 0; i <2; i++) {
           for(int j = 0; j < 3; j++) {
               System.out.print(arr[i][j] + "") ;
           }
               System.out.println();
       }

       int[] arrY = new int[] {1,3,4};
       int[] arrX = new int[3];
    }
}
