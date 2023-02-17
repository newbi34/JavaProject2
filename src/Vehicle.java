public abstract class Vehicle {

    private String name;
    private double speed;
    private double acceleration;

    public Vehicle(String name, double speed, double acceleration) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
    }

    public String returnName() {
        return name;
    }

    public double returnSpeed() {
        return speed;
    }

    public double returnAcceleration() {
        return acceleration;
    }

    //Returns speed after a <time> seconds of accelerating
    public double accelerate(int time) {
        return (speed = speed + acceleration * time);
    }

    public double drivesDistance(double distance){
        return (distance / speed);
    }

    public String passesBy(Vehicle second, double distance) {
        if (this.speed > second.speed) {
            return String.format("first vehicle will pass the second one is %.2f seconds", (distance / (speed - second.speed)));
        } else {
            return String.format("first vehicle will never pass the second one");
        }
    }
}