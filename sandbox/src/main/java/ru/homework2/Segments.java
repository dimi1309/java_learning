package ru.homework2;

/**
 * Класс для представления длин строн многоугольника
 */
public class Segments {
    public double a;
    public double b;
    public double c;
  //  public double sp;

    public Segments(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    /**public static double sp(double a, double b, double c) {
    //  return (a + b + c) / 2;
   } */

    public static double areatriangle(double a, double b, double c) {
        return Math.sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c));
    }
}