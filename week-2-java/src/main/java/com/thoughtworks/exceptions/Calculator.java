package com.thoughtworks.exceptions;

public class Calculator {
    public double caldouble(double num) throws MyArithmeticException {
        if (num == 0) {
            throw new MyArithmeticException("Zero not allowed");
        } else if (num < 0) {
            throw new MyArithmeticException("negative not allowed");
        }
        return num * 2;
    }
}
