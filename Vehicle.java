// PARENT CLASS
public class Vehicle {
    double speed = 60.0;

    void startEngine() {
        System.out.println("Engine started.");
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        System.out.println("Speed: " + myCar.speed + " km/h");
        System.out.println("Number of doors: " + myCar.numberOfDoors);
    }
}
class Car extends Vehicle {
    int numberOfDoors = 4; 
}