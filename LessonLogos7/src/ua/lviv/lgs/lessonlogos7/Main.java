package ua.lviv.lgs.lessonlogos7;

public class Main {

    public static void main(String[] args) {

        Cy_27 start = new Cy_27(15, 12, 2000, 1500, "blue");
        AircraftControl control = new AircraftControl();

        System.out.println(start);

        start.engineStart();
        start.flightLeft();

        control.rise();
        control.turnLeft();
        control.goDown();
        control.turnRight();

        start.stealthTechnology();
        start.Strike();
        start.turboAcceleration();
        start.planeLanding();


    }

}
