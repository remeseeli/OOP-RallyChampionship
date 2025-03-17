package main;

public abstract class RallyCar {

    private String make;
    private String model;
    private int horsepower;

    // CONSTRUCTOR
    public RallyCar(String make, String model, int horsepower) {
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
    }

    // GETTERS

    // Returns make of car
    public String getMake() {
        return make;
    }
    // Returns model of car
    public String getModel() {
        return model;
    }
    // Returns horsepower of car
    public int getHorsepower() {
        return horsepower;
    }
    // ABSTRACT METHOD FOR SUBCLASSES TO IMPLEMENT
    public abstract double calculatePerformance();

}
