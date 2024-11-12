package at.ac.fhcampuswien.inheritance;

public class SportCar extends Car {
    String make; // default -> sichtbar innerhalb des Pakets

    public SportCar(int speed, String make){
        super(speed);
        this.make = make;
        super.serialNo = 1;
    }
}
