package oop.Polymorphism.DianamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal;

        System.out.println("What animal do you want");
        System.out.println("(1 - Dog) or (2-Cat)");

        int Choice = scanner.nextInt();

        if(Choice == 1){
            animal = new Dog();
            animal.Speak();
        }else if(Choice == 2){
            animal = new Cat();
            animal.Speak();
        }else {
            animal = new Animal();
            System.out.println("That choice is invalid");
            animal.Speak();
        }


    }
}
