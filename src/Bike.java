public class Bike extends Vehicle {
    
    private int numberOfGears;
    private double speedPerGear = 1.5;

    public Bike(String name, double speed, double acceleration, int numberOfGears) {
        super(name, speed, acceleration);
        this.numberOfGears = numberOfGears;
    }

    public double maxPedalingSpeed() {
        return (numberOfGears * speedPerGear);
    }
}
