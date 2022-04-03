package ru.homework2;

/**
 * Класс для представления данных и расчёта площади правильного многоугольника *
 */
public class SegmentsPolygon {

    public int a;
    public int n;

    public SegmentsPolygon(int a, int n) {
        this.a = a;
        this.n = n;
    }

    public static double areaPolygon(int a, int n) {
        return ((a * a * n) / (4 * Math.tan(Math.PI / n)));
    }
}