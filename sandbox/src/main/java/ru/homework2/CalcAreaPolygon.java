package ru.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Класс проводит расчёт площади правильного многоугольника по известному количеству
 * сторон numberSides и длине стороны sideLength
 * Для округления дробной части используется форматирование числа с плавающей точкой
 */
public class CalcAreaPolygon {
    public static double result;
    public static int sideLength;
    public static int numberSides;

    public static void main(String[] args) throws IOException {

        System.out.println("Введите длину стороны многоугольника");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        sideLength = Integer.parseInt(reader.readLine());
        System.out.printf("Длина стороны многоугольника равна " + "%d \n", sideLength);
        System.out.println("Введите количество сторон многоугольника");
        numberSides = Integer.parseInt(reader.readLine());
        if (numberSides < 3) {
            System.out.println("Количество сторон многоугольника не может быть меньше трёх. Повторите ввод." +
                    " Результат расчёта будет некорректен");
        } else {
            System.out.printf("Количество сторон многоугольника равно " + "%d \n", numberSides);
        }

        SegmentsPolygon segmentsPolygon = new SegmentsPolygon(sideLength, numberSides);

        result = SegmentsPolygon.areaPolygon(segmentsPolygon.sideLength, segmentsPolygon.numberSides);
        System.out.printf("Площадь многоугольника с длиной стороны " + segmentsPolygon.sideLength +
                " и количеством сторон " + segmentsPolygon.numberSides + " равна " + "%.2f", result);
    }
}