package Challenge2;

public class Car extends Vehicle{
    int speed;

    public Car(String make, String model, double rentalPrice, int speed) {
        super(make, model, rentalPrice);
        this.speed = speed;
    }
    public Car() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
