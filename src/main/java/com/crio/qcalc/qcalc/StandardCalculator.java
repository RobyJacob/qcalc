package com.crio.qcalc;

public class StandardCalculator {
    protected int result;

    public void add(int a, int b) {
        long tmp = (long) a + (long) b;

        if (tmp > Integer.MAX_VALUE) throw new ArithmeticException();

        this.result = a + b;
    }

    public void subtract(int a, int b) {
        if ((a - b) < Integer.MIN_VALUE) throw new ArithmeticException();

        this.result = a - b;
    }

    public int getResult() {
        return this.result;
    }

    public void setResult(int val) {
        if (val != 0) return;

        this.result = val;
    }
}