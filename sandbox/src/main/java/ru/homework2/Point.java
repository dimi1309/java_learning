package ru.homework2;

/**
 * Класс для представления точек на двумерной плоскости
 */
public class Point {
    public double x;
    public double y;

    public static double distance(Point p1, Point p2) {
        int degree = 2;
        return Math.sqrt(Math.pow(p2.x - p1.x, degree) + (Math.pow(p2.y - p1.y, degree)));
    }
}