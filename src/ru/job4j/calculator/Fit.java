package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rls = (height - 100) * 1.15;
        return rls;
    }
    public static double womanWeight(short height) {
        double rls = (height - 110) * 1.15;
        return rls;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 187 is " + woman);
    }
}
