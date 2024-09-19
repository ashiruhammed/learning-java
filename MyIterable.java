import java.util.Iterator;

public class MyIterable implements Iterable<String> {

    private String[] items;

    public MyIterable(String[] items) {
        this.items = items;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < items.length && items[currentIndex] != null;
        }

        @Override
        public String next() {
            System.out.print(currentIndex);
            return items[currentIndex++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args) {
        String[] items = {"apple", "banana", "orange"};
        MyIterable iterable = new MyIterable(items);

        Iterator<String> iterator = iterable.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
