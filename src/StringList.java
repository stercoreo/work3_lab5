package work3;

import java.util.Iterator;

/**
 * Interface for a list of strings, allowing to add strings
 * and get a regular or filtered iterator.
 */
public interface StringList {
    void add(String str);
    Iterator<String> iterator();
    Iterator<String> filteredIterator(Filter filter);
}
