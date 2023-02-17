public class App {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", 30, 5);
        Vehicle v2 = new Vehicle("Fiat", 40, 7);
        Vehicle v3 = new Vehicle("Volvo", 45, 9);
        Vehicle c1 = new Car("KIA", 25, 4, 250);
        System.out.println(v1.returnName());
        System.out.println(v1.returnSpeed());
        System.out.println(v3.returnSpeed());
        System.out.println(v1.returnAcceleration());
        System.out.println(v1.accelerate(5));
        System.out.println(v1.drivesDistance(1000));
        System.out.println(v1.passesBy(v3, 1500));
        System.out.println(v2.passesBy(v3, 1000));
        System.out.println(c1.canDrive(240000));
        System.out.println(c1.canDrive(350000));

    }
}
