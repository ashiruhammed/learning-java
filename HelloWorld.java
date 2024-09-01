import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]) {

        for (int i = 1 ; i <=24; i++) {
            int yz = i%6;
            for (int y = i ; y <= i; y++) {
                System.out.print("*");
            }
            for(int w = i; w<=i; w++) {
                System.out.print("#");
            }
            for(int z = 0; z==yz; z++) {
                System.out.println(" ");
            }
            System.out.println();
        }
    }
}
