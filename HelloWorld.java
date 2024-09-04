import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {

        int[] arr = new int[]{1, 2,3,3,7,8,4,5, 6,7, 8};

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];

            for(int k=i+1; k<arr.length; k++) {
                if(arr[k]==temp) System.out.println(arr[k]);
            }

        }
    }

}
