package at.ac.fhcampuswien.inheritance;

public class eCar extends Car implements Chargeable{
    private double batteryStatus;

    public eCar(int speed) {
        super(speed);
    }

    @Override
    public double getBatteryStatus() {
        return 0;
    }
}
