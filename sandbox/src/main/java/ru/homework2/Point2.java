package ru.homework2;

/**
 * Класс для представления точек на двумерной плоскости. Вариант 2.Используется конструктор
 */
public class Point2 {
    public double x;
    public double y;

    public Point2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static double distance(Point2 p1, Point2 p2) {
        int degree = 2;
        return Math.sqrt(Math.pow(p2.x - p1.x, degree) + (Math.pow(p2.y - p1.y, degree)));
    }
}