package ru.homework2;

/**
 * Класс для представления данных и расчёта площади правильного многоугольника *
 */
public class SegmentsPolygon {

    public int sideLength;
    public int numberSides;

    public SegmentsPolygon(int sideLength, int numberSides) {
        this.sideLength = sideLength;
        this.numberSides = numberSides;
    }

    public static double areaPolygon(int sideLength, int numberSides) {
        return ((sideLength * sideLength * numberSides) / (4 * Math.tan(Math.PI / numberSides)));
    }
}