package com.crio.qcalc;

public class StandardCalculator {
    protected int result;

    public void add(int a, int b) {
        this.result = a + b;
    }

    public int getResult() {
        return this.result;
    }

    public void setResult(int val) {
        if (val != 0) return;
        
        this.result = val;
    }
}