public class Car extends Vehicle{

    private double tankCapacity;

    public Car(String name, double speed, double acceleration, double tankCapacity) {
        super(name, speed, acceleration);
        this.tankCapacity = tankCapacity;
    }

    public boolean canDrive(double distance) {
        return (distance > (tankCapacity * 1000));
    }

    
}
