package oop.first;
public class Human {
    String Name;
    int Age;
    double Weight;

    public String toString(){
        return "Name: " + this.Name + " Age: " + this.Age + " Weight: " + this.Weight;
    }

    // this is constructor, Cuz its name is same as class
    Human(String name,int age, double weight) {
        this.Name=name;
        this.Age=age;
        this.Weight=weight;
    }

    void eat() {
        System.out.println(this.Name + " is eating");
    }

    void mycar(Car car){
        System.out.println(this.Name + " is driving " + car.make);
    }

    
}
