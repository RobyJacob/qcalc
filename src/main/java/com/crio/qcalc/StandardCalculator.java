package com.crio.qcalc;

public class StandardCalculator {
    protected double result;

    public void add(int a, int b) {
        long tmp = (long) a + (long) b;

        if (tmp > Integer.MAX_VALUE) throw new ArithmeticException();

        this.result = a + b;
    }

    public void subtract(int a, int b) {
        long tmp = (long) a - (long) b;

        if (tmp < Integer.MIN_VALUE) throw new ArithmeticException();

        this.result = a - b;
    }

    public void multiply(int a, int b) {
        this.result = a * b;
    }

    public void divide(int a, int b) {
        this.result = (double) a / (double) b;
    }

    public double getResult() {
        return this.result;
    }

    public void setResult(int val) {
        if (val != 0) return;

        this.result = val;
    }
}