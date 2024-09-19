import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class AbstractClass {




    public static void main(String[] args) {
       int result =  factorial(5);
       System.out.print(result);
    }

    public static int factorial(int x){

        if(x==0) {
            return 1;
        }else {
            return x * factorial(x-1);
        }
    }

}
