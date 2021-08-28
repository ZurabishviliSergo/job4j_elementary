package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double x = p * (p - a);
        double y = p * (p - b);
        double z = p * (p - c);
        double w = x + y + z;
        double rsl = Math.sqrt(w);
        return rsl;
    }
    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
