package ru.homework2;

/**
 * Класс для представления длин строн треугольника и вычисления его площади. Вариант 2. В данном классе полупериметр треугольника вычисляется через отдельный метод semiPer.
 * Результат вызова метода применяется для вычисления во втором методе для расчёта площади треугольника.
 */
public class Segments2 {
    public double a;
    public double b;
    public double c;
    public static double sp;

    public Segments2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static double semiPer(double a, double b, double c) {
        sp = (a + b + c) / 2;
        return sp;
    }

    public static double areaTriangle2(double a, double b, double c) {
        return Math.sqrt(semiPer(a, b, c) * (semiPer(a, b, c) - a) * (semiPer(a, b, c) - b) * (semiPer(a, b, c) - c));
    }
}
