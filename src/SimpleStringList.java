package work3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Implementation of StringList interface that stores strings in a list.
 */
public class SimpleStringList implements StringList {
    private List<String> list = new ArrayList<>();

    @Override
    public void add(String str) {
        list.add(str);
        System.out.println("Method add with parameter: " + str);
    }

    @Override
    public Iterator<String> iterator() {
        return list.iterator();
    }

    @Override
    public Iterator<String> filteredIterator(Filter filter) {
        return new FilteredStringIterator(list.iterator(), filter);
    }
}
