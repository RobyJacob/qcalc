package com.crio.qcalc;

import java.lang.Math;

public class ScientificCalculator extends StandardCalculator {

    @Override
    public void add(int a, int b) {
        this.add((double) a, (double) b);
    }

    @Override
    public void subtract(int a, int b) {
        this.subtract((double) a, (double) b);
    }

    @Override
    public void multiply(int a, int b) {
        this.multiply((double) a, (double) b);
    }

    @Override
    public void divide(int a, int b) {
        this.divide((double) a, (double) b);
    }

    public void pow(double a, double b) {
        this.result = (double) Math.pow(a, b);
    }

    public void add(double d, double e) {
        if ((d + e) > Integer.MAX_VALUE) throw new ArithmeticException();

        this.result = d + e;
    }

    public void subtract(double d, double e) {
        this.result = d - e;
    }

    public void multiply(double d, double e) {
        this.result = d * e;
    }

    public void divide(double d, double e) {
        this.result = d / e;
    }

}