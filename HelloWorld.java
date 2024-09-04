import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {

        int[] arr = new int[] {-2,2,3,4,5,6,17, 98,43,343,45232};

        int max=arr[0], min=arr[0];

        for(int i=0; i<=arr.length-1; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
          else if(arr[i]<=min) {
              min = arr[i];
            }
        }

        System.out.print("max-value = "+max+" min-value = "+min);





    }
}
