public class MyArrayDataException extends NumberFormatException {
    private int n;
    private int m;

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public MyArrayDataException(String s, int n, int m) {
        super(s);
        this.n = n;
        this.m = m;
    }

}
