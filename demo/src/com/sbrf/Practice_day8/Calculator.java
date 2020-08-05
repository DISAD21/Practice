package com.sbrf.Practice_day8;

import com.sbrf.Practice_day8.test.CalculatorTest;
import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Calculator {
    public static void main(String[] args) {

    }
    public int sum(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a + b; // Ошибка для задания 2.b
    }
    public int div(int a, int b) {
        return a % b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
}

