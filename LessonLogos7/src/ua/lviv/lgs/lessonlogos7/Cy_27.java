package ua.lviv.lgs.lessonlogos7;

import java.text.DecimalFormat;

public class Cy_27 extends Aircraft implements SpecialAbilities {

    private int maximumSpeed;
    private String color;

    public Cy_27(int length, int width, int weight, int maximumSpeed, String color) {
        super(length, width, weight);
        this.maximumSpeed = maximumSpeed;
        this.color = color;
    }

    @Override
    public void turboAcceleration() {
        String formattedDouble;
        RandomNumbers turboAcceleration = new RandomNumbers(2500, 1500, 0);
        formattedDouble = new DecimalFormat("#0.000").format(turboAcceleration.getRandomNumbersDouble());
        System.out.println("Turbo acceleration : " + formattedDouble + " km;");
    }

    @Override
    public void stealthTechnology() {
        RandomNumbers stealthTechnology = new RandomNumbers(20, 0);
        System.out.println("The plane is not visible during : " + stealthTechnology.getRandomNumbers() + " min;");
    }

    @Override
    public void Strike() {
        RandomNumbers strike = new RandomNumbers(10, 0);
        System.out
                .println("The number of missiles launched from the aircraft : " + strike.getRandomNumbers() + " pic;");
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " Cy_27" + "\n Length : " + getLength() + " m \n Width : " + getWidth() + " m \n Weight : " + getWeight()
                + " kg \n Maximum Speed : " + getMaximumSpeed() + " km/h \n Color : " + getColor();
    }

}
