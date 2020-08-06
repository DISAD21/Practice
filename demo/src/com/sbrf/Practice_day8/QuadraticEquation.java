package com.sbrf.Practice_day8;

import java.util.ArrayList;
import java.util.List;

public class QuadraticEquation {
    public static void main(String[] args) {}
    public List<Double> quadraticEquation(double a, double b, double c) {
        ArrayList<Double> result = new ArrayList<>();
        double d = (b * b) - (4 * a * c);
        double e,f;
        if (a == 0 && b == 0 && c == 0 || a == 0) {
            return result;
        } else if (d == 0) {
            e = -1 * (b / (2 * a));
            result.add(e);
            return result;
        } else if (d > 0) {
                e = ((-1 * b) + Math.sqrt(d)) / (2 * a);
                f = ((-1 * b) - Math.sqrt(d)) / (2 * a);
            result.add(e);
            result.add(f);
                return result;
            } else {
                return result;
            }

    }
}