package ex6;

public class Array {
    private int countNegative;
    private int minimum;
    private boolean ascendingOrder;
    private int length;
    private int frequency;

    public Array(int countNegative, int minimum, boolean ascendingOrder, int length, int frequency) {
        this.countNegative = countNegative;
        this.minimum = minimum;
        this.ascendingOrder = ascendingOrder;
        this.length = length;
        this.frequency = frequency;
    }

    public int getCountNegative() {
        return countNegative;
    }

    public int getMinimum() {
        return minimum;
    }

    public boolean isAscendingOrder() {
        return ascendingOrder;
    }

    public int getLength() {
        return length;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setCountNegative(int countNegative) {
        this.countNegative = countNegative;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public void setAscendingOrder(boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
