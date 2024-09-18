import java.util.ArrayList;
import java.util.Iterator;

public class CodeTest {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("element1");
        arr.add("element2");
        arr.add("element3");
        System.out.print(arr);

        for(int i=0; i<arr.size(); i++) {
            System.out.print(arr.get(i));
        }

        Iterator<String> iterator = arr.iterator();

        while(iterator.hasNext()) {
            System.out.print(iterator.next());
        }
    }
}
