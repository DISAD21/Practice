package com.sbrf.practice_day2;

class Vector {
    // Три приватных поля
    private double x;
    private double y;
    private double z;
    // С тремя параметрами
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    // Длина вектора. Корень из суммы квадратов
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }
    // метод, вычисляющий скалярное произведение
    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }
    // метод, вычисляющий векторное произведение
    public Vector crossProduct(Vector vector) {
        return new Vector(
                y * vector.z - z * vector.y,
                z * vector.x - x * vector.z,
                x * vector.y - y * vector.x);
    }
    // метод, вычисляющий векторное сложение
    public Vector crossAddition(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }
    // метод, вычисляющий векторное вычитание
    public Vector crossSubtraction(Vector vector) {
        return new Vector(
                x - vector.x,
                y - vector.y,
                z - vector.z);
    }
    public static Vector[] generate(int n){
        Vector[] vectors = new Vector[n];
        for(int i =0; i < n; i++){
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }
    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
public static void main(String[] args) {
        Vector[] vectors = Vector.generate(5);
        System.out.println("Вектор 1 = " + vectors[0]);
        System.out.println("Вектор 2 = " + vectors[1]);
        System.out.println("Длинна вектора 1 = " + vectors[0].length());
        System.out.println("Длинна вектора 2 = " + vectors[1].length());
        System.out.println("Скалярное произведение векторов 1 и 2 = " + vectors[0].scalarProduct(vectors[1]));
        System.out.println("Векторное сложение векторов 1 и 2 = " + vectors[0].crossAddition(vectors[1]));
        System.out.println("Векторное вычитание векторов 1 и 2 = " + vectors[0].crossSubtraction(vectors[1]));
        System.out.println("Векторное произведение векторов 1 и 2 = " + vectors[0].crossProduct(vectors[1]));
        }
}

