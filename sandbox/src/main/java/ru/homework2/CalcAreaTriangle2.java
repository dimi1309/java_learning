package ru.homework2;

import java.text.DecimalFormat;

/**
 * Класс проводит расчёт площади произвольного треугольника по формуле Герона по известным длинам сторон
 * В первой строке вывода для округления дробной части используется класс DecimalFormat
 * Во второй строке вывода для округления дробной части используется форматирование числа с плавающей точкой
 */
public class CalcAreaTriangle2 {
    public static double result2;

    public static void main(String[] args) {
        Segments2 s = new Segments2(16, 12, 9);

        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        String result = decimalFormat.format(Segments2.areaTriangle2(s.a, s.b, s.c));
        result2 = Segments2.areaTriangle2(s.a, s.b, s.c);
        if ((s.a + s.b <= s.c) || (s.a + s.c <= s.b) || (s.b + s.c <= s.a)) {
            System.out.println("Треугольников с такими сторонами не бывает. Одна сторона больше суммы двух других сторон.");
        } else {
            System.out.println("Площадь треугольника со сторонами " + s.a + ", " + s.b + ", " + s.c + " равна " + result);
            System.out.printf("Площадь треугольника со сторонами " + s.a + ", " + s.b + ", " + s.c + " равна " + "%.4f", result2);

        }

    }
}