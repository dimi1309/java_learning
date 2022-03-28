package ru.homework2;

import java.text.DecimalFormat;

public class CalcAreaTriangle {

    /**
     * Класс проводит расчёт площади произвольного треугольника по формуле Герона по известным длинам сторон
     * используется класс DecimalFormat для округления дробной части
     */
    public static void main(String[] args) {
        Segments s = new Segments(7, 5, 9);

        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String result = decimalFormat.format(Segments.areatriangle(s.a, s.b, s.c));

        System.out.println("Площадь треугольника со сторонами " + s.a + ", " + s.b + ", " + s.c + " равна " + result);

    }
}