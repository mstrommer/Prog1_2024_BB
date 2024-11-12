package at.ac.fhcampuswien.inheritance;

public class Car {
    final int speed;
    protected int serialNo;
    private static int count = 1;

    public Car(int speed){
        this.speed = speed;
        this.serialNo = count++;
    }
}
