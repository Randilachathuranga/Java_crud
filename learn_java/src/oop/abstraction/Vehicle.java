package oop.abstraction;

public abstract class Vehicle {
    //if use abstract keyword then it cant created
    //new object from vehicle class in Main
    int number = 10;

     void go(){
        System.out.println("Driver is driving the car");
    }
}
