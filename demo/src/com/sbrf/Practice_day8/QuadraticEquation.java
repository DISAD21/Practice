package com.sbrf.Practice_day8;

public class QuadraticEquation {
    public static void main(String[] args) {
    }
    public String quadraticEquation(double a, double b, double c) {
        double d = (b*b) - (4*a*c);
        double e;
        double f;
        if (a==0 && b==0 && c==0 || a==0){
            return "Уравнения нет";
        } else
        if (d == 0) {
            e = -1* (b / (2*a));
            return ""+e;
        } else {
            if (d > 0) {
                e = ((-1*b)+ Math.sqrt(d))/(2 * a);
                f = ((-1*b)- Math.sqrt(d))/(2 * a);
                return e+" "+f;
            } else {
                return "Уравнение не имеет квадратных корней";
            }
        }
    }
}