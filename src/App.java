public class App {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 30, 5, 150);
        Car car2 = new Car("Fiat", 40, 7, 300);
        Car car3 = new Car("Volvo", 45, 9, 100);
        Bike b1 = new Bike("GTX", 15, 2, 18);
        System.out.println(car1.returnName());
        System.out.println(car1.returnSpeed());
        System.out.println(car3.returnSpeed());
        System.out.println(car1.returnAcceleration());
        System.out.println(car1.accelerate(5));
        System.out.println(car1.drivesDistance(1000));
        System.out.println(car1.passesBy(car3, 1500));
        System.out.println(car2.passesBy(car3, 1000));
        System.out.println(car1.canDrive(2400000));
        System.out.println(car1.canDrive(3500000));
        System.out.println(b1.maxPedalingSpeed());
    }
}
