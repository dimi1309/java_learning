package ru.homework2;

import java.text.DecimalFormat;

/**
 * Класс проводит расчёт площади произвольного треугольника по формуле Герона по известным длинам сторон
 * используется класс DecimalFormat для округления дробной части
 */
public class CalcAreaTriangle {

    public static void main(String[] args) {
        Segments s = new Segments(16, 12, 9);

        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String result = decimalFormat.format(Segments.areaTriangle(s.a, s.b, s.c));
        if ((s.a + s.b <= s.c) || (s.a + s.c <= s.b) || (s.b + s.c <= s.a)) {
            System.out.println("Треугольников с такими сторонами не бывает. Одна сторона больше суммы двух других сторон.");
        } else {
            System.out.println("Площадь треугольника со сторонами " + s.a + ", " + s.b + ", " + s.c + " равна " + result);
        }

    }
}