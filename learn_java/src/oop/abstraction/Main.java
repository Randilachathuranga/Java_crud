package oop.abstraction;

public class Main {
    public static void main(String[] args) {

        // you cannot create vehicle method
        // because it is abstract
        Car car1 = new Car();
//        Vehicle newvehicle = new Vehicle(); // because Vehicle is abstracted

        System.out.println(car1.number);
        car1.go();

    // and access modifire
        // default = default data can access in same package
        // Public = it can be used for every packages
        // Protected = only can access in sub classes
        // Private = only access that in own class
    }
}
