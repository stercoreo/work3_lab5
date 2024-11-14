package work3;

import java.util.Iterator;

/**
 * Iterator that filters elements based on a condition defined by the filter.
 */
public class FilteredStringIterator implements Iterator<String> {
    private Iterator<String> iterator;
    private Filter filter;
    private String nextElement;
    private boolean hasNext;

    public FilteredStringIterator(Iterator<String> iterator, Filter filter) {
        this.iterator = iterator;
        this.filter = filter;
        advance();
    }

    /**
     * Advances to the next element that satisfies the filter.
     */
    private void advance() {
        hasNext = false;
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (filter.apply(element)) {
                nextElement = element;
                hasNext = true;
                break;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return hasNext;
    }

    @Override
    public String next() {
        String result = nextElement;
        advance();
        System.out.println("Method next with result: " + result);
        return result;
    }
}
