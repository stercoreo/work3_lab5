package work3;

/**
 * Filter for selecting strings based on a minimum length.
 */
public class LengthFilter implements Filter {
    private int minLength;

    public LengthFilter(int minLength) {
        this.minLength = minLength;
    }

    @Override
    public boolean apply(String str) {
        boolean result = str.length() >= minLength;
        System.out.println("Method apply with parameter: " + str + ", result: " + result);
        return result;
    }
}
