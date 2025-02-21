package oop.encapsulation;

public class ens_car {
    private String make;
    private String model;
    private int year;

    ens_car(String make,String model,int year){
        this.make=make;
        this.model=model;
        this.setyear(year);
    }

    //setters
    public void setyear(int year){
        this.year = year;
    }

    // getters
    public String getMake(){
        return make;
    }
    public String getmodel(){
        return model;
    }
    public int getyear(){
        return year;
    }

}
