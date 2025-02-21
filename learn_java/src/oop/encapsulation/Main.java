package oop.encapsulation;

public class Main {
    // encapsulation
    //attributes of class will be hidden or private
    // can be access only getters and setters like that
    public static void main(String[] args) {
        ens_car car1 = new ens_car("Chev","BMD",2000);
        System.out.println(car1.getMake());
        System.out.println(car1.getmodel());
        System.out.println(car1.getyear());

        car1.setyear(2001);
        System.out.println(car1.getyear());
        System.out.println();


//        ens_car car2 = new ens_car("ABC","PQL",1500);
//        System.out.println(car2.getMake());
//        System.out.println(car2.getmodel());
//        System.out.println(car2.getyear());
//
//        car2 = car1;
//        System.out.println(car2.getMake());
//        System.out.println(car2.getmodel());
//        System.out.println(car2.getyear());



    }
}
