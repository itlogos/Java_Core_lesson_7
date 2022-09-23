package ua.lviv.lgs.lessonlogos7;

import java.text.DecimalFormat;

public abstract class Aircraft {

    private int length;
    private int width;
    private int weight;

    public Aircraft(int length, int width, int weight) {
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public void engineStart() {
        RandomNumbers startEngin = new RandomNumbers(88, 20);
        System.out.println("Starts engin. Left until the engine starts: " + startEngin.getRandomNumbers() + " second;");
    }

    public void planeLanding() {
        System.out.println("The plane is landing.");
    }

    public void flightLeft() {
        String formattedDouble;
        RandomNumbers flightLeft = new RandomNumbers(1000, 0, 0);
        formattedDouble = new DecimalFormat("#0.000").format(flightLeft.getRandomNumbersDouble());
        System.out.println("Plane take off. sOf flight left : " + formattedDouble + " km;");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
