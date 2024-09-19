import java.util.ArrayList;
import java.util.Iterator;

public class CodeTest {

    public class MyIterable implements  Iterable<String> {

        @Override
        public Iterator<String> iterator() {
            return null;
        }

        public class MyIterator implements  Iterator<String> {

            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return "";
            }

            @Override
            public void remove() {
                Iterator.super.remove();
            }
        }
    }

    public static void main(String[] args) {
    }
}
