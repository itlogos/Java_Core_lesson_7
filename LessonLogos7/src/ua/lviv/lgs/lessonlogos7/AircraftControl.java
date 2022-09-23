package ua.lviv.lgs.lessonlogos7;

public class AircraftControl {

    public void rise() {
        RandomNumbers distanceTop = new RandomNumbers(20, 0);
        System.out.println("Rise : " + distanceTop.getRandomNumbers() + " m;");
    }

    public void goDown() {
        RandomNumbers distanceDown = new RandomNumbers(0, 20);
        System.out.println("Go Down : " + distanceDown.getRandomNumbers() + " m;");
    }

    public void turnLeft() {
        RandomNumbers distanceLeft = new RandomNumbers(0, 20);
        System.out.println("Turn left : " + distanceLeft.getRandomNumbers() + " m;");
    }

    public void turnRight() {
        RandomNumbers distanceRight = new RandomNumbers(0, 20);
        System.out.println("Turn right : " + distanceRight.getRandomNumbers() + " m;");
    }

}
