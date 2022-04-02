package ru.homework2;

/**
 * Класс для представления точек на двумерной плоскости. Вариант 2
 */
public class Point {
    public double x;
    public double y;
    public static final int DEGREE = 2;

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, DEGREE) + (Math.pow(p2.y - p1.y, DEGREE)));
    }
}