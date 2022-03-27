package ru.homework2;

public class CalcDistance {
    /**
     * Класс проводит расчёт расстояния между двумя точками. Каждая точка содержит пару координат x, y
     */
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();
        p1.x = 4.0;
        p1.y = 5.0;
        p2.x = 6.0;
        p2.y = 7.0;


        System.out.println("Расстояние между точками p1 с координатами " + p1.x + ", " + p1.y + " и" + " p2 с координатами " + p2.x + ", " + p2.y + " равно " + Point.distance(p1, p2));
    }

}