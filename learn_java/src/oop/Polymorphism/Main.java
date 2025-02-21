package oop.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] vehicles= {car,bicycle,boat};

        for(Vehicle x : vehicles){
            x.go();
        }
    }
}
