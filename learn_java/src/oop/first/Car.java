//this is use for OOP
package oop.first;
public class Car {
    static int numberofcar;
    String make = "Chevrolet";
    String model = "Camaro";
    int year = 2022;
    String color = "Red";
    Double price = 50000.00;

    Car(String make){
        this.make = make;
        numberofcar++;
    }

    void drive(){
        System.out.println("you drive the car");
    }

    void braek(){
        System.out.println("you step on the break");
    }
}
