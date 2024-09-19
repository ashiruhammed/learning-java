import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class AbstractClass {




    public static void main(String[] args) {
       int result =  CalculatePower(2,3);
       System.out.print(result);
    }

    public static int CalculatePower(int x, int y){

        if(y==0) {
            return x;
        }else {
            x*=x;
            return CalculatePower(x,y-1);
        }
    }

}
