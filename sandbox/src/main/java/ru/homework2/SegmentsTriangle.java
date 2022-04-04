package ru.homework2;

/**
 * Класс для представления длин строн треугольника и вычисления его площади по сторонам
 */
public class SegmentsTriangle {
    public double a;
    public double b;
    public double c;

    public SegmentsTriangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double semiPer(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public static double areaTriangle(double a, double b, double c) {
        return Math.sqrt(semiPer(a, b, c) * (semiPer(a, b, c) - a) * (semiPer(a, b, c) - b) * (semiPer(a, b, c) - c));
    }
}
