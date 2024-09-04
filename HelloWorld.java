import java.util.Arrays;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {

            char[] name = "Ashiru".toCharArray();

            String reversed_string = "";
            for(int i=name.length-1; i>=0; i--) {

                reversed_string+=name[i];
            }
            System.out.print(reversed_string);


    }

}
