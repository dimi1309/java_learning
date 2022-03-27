package ru.homework2;

import java.text.DecimalFormat;

public class CalcDistance2 {
    /**
     * Класс проводит расчёт расстояния между двумя точками. Каждая точка содержит пару координат x, y. Вариант 2 с форматированием дробной части результата до 3 знаков
     * используется класс DecimalFormat
     */
    public static void main(String[] args) {
        Point2 p1 = new Point2(7, 1);
        Point2 p2 = new Point2(12, 14);

        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );
        String result = decimalFormat.format(Point.distance(p1, p2));

        System.out.println("Расстояние между точками p1 с координатами " + p1.x + ", " + p1.y + " и" + " p2 с координатами " + p2.x + ", " + p2.y + " равно " + result);
    }

}