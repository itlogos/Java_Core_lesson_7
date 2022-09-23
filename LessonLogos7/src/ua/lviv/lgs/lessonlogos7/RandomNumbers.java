package ua.lviv.lgs.lessonlogos7;

public class RandomNumbers {
    private int a;
    private int b;
    private double c;
    private double d;
    private double e;

    public RandomNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public RandomNumbers(double c, double d, double e) {
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public int getRandomNumbers() {
        int quantity = (int) (Math.random() * (a - b + 1) + b);
        return quantity;

    }

    public double getRandomNumbersDouble() {
        double quantityDouble = Math.random() * (c - d) + d;
        return quantityDouble;

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

}
