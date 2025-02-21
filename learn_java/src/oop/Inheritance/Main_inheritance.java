package oop.Inheritance;
public class Main_inheritance {
    public static void main(String[] args) {

        Bicycle_inheritance bicycle = new Bicycle_inheritance();
        bicycle.go();
        Car_inheritance car = new Car_inheritance();
        car.stop();
        System.out.println(car.wheel + " and " + bicycle.wheel);
    }
}
