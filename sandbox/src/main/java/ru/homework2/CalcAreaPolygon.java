package ru.homework2;

import java.util.Scanner;

/**
 * Класс проводит расчёт площади правильного многоугольника по известному количеству сторон n и длине стороны a
 * Для округления дробной части используется форматирование числа с плавающей точкой
 */
public class CalcAreaPolygon {
    public static double result;
    public static int a;
    public static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину стороны многоугольника");
        a = in.nextInt();
        System.out.printf("Длина стороны многоугольника равна " + "%d \n", a);
        System.out.println("Введите количество сторон многоугольника");
        n = in.nextInt();
        if (n < 3) {
            System.out.println("Количество сторон многоугольника не может быть меньше трёх. Повторите ввод");
        } else {
            System.out.printf("Количество сторон многоугольника равно " + "%d \n", n);
        }
        in.close();
        SegmentsPolygon segmentsPolygon = new SegmentsPolygon(a, n);

        result = SegmentsPolygon.areaPolygon(segmentsPolygon.a, segmentsPolygon.n);
        System.out.printf("Площадь многоугольника с длиной стороны " + segmentsPolygon.a + " и количеством сторон " + segmentsPolygon.n + " равна " + "%.2f", result);
    }
}