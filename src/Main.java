package work3;

import java.util.Iterator;

/**
 * Main class for testing the filtered iterator.
 */
public class Main {
    public static void main(String[] args) {
        StringList stringList = new SimpleStringList();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");

        Filter filter = new LengthFilter(6);
        Iterator<String> filteredIterator = stringList.filteredIterator(filter);

        while (filteredIterator.hasNext()) {
            System.out.println("Filtered element: " + filteredIterator.next());
        }
    }
}
