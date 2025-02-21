package Interfaces;

public class Fish implements Prey,Predator{
    @Override
    public void hunt() {
        System.out.println("The Fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("The Fish is fleeing");
    }
}
