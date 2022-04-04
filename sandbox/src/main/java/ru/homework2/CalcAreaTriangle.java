package ru.homework2;

import java.text.DecimalFormat;

/**
 * Класс проводит расчёт площади произвольного треугольника по формуле Герона по известным длинам сторон
 * В первой строке вывода для округления дробной части используется класс DecimalFormat
 * Во второй строке вывода для округления дробной части используется форматирование числа с плавающей точкой
 */
public class CalcAreaTriangle {
    public static double resultCalculation;

    public static void main(String[] args) {
        SegmentsTriangle segmentsTriangle = new SegmentsTriangle(16, 12, 10);

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(SegmentsTriangle.areaTriangle(segmentsTriangle.a, segmentsTriangle.b, segmentsTriangle.c));
        resultCalculation = SegmentsTriangle.areaTriangle(segmentsTriangle.a, segmentsTriangle.b, segmentsTriangle.c);
        if ((segmentsTriangle.a + segmentsTriangle.b <= segmentsTriangle.c) ||
                (segmentsTriangle.a + segmentsTriangle.c <= segmentsTriangle.b) ||
                (segmentsTriangle.b + segmentsTriangle.c <= segmentsTriangle.a)) {
            System.out.println("Треугольников с такими сторонами не бывает." +
                    " Одна сторона больше суммы двух других сторон.");
        } else {
            System.out.println("Площадь треугольника со сторонами " + segmentsTriangle.a + ", " +
                    segmentsTriangle.b + ", " + segmentsTriangle.c + " равна " + result);
            System.out.printf("Площадь треугольника со сторонами " + segmentsTriangle.a + ", " +
                    segmentsTriangle.b + ", " + segmentsTriangle.c + " равна " + "%.4f", resultCalculation);

        }

    }
}