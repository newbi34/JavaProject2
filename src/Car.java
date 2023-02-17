public class Car extends Vehicle{

    //1 unit of tankCapacity suffices for 10000 meters
    private double tankCapacity;

    public Car(String name, double speed, double acceleration, double tankCapacity) {
        super(name, speed, acceleration);
        this.tankCapacity = tankCapacity;
    }

    public boolean canDrive(double distance) {
        return (distance > (tankCapacity * 10000));
    }

    
}
