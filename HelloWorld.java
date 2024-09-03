import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {

        int[] arr = new int[] {1,2,4};

        for(int i=2; i<=arr.length-1; i++) {
            arr[i]=arr[i-1];
//            System.out.print()
        }

        for(int element: arr) {
            System.out.print(element);
        }




    }
}
