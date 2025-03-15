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

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getHorsepower() {
        return horsepower;
    }
    // ABSTRACT METHOD FOR SUBCLASSES TO IMPLEMENT
    public abstract double calculatePerformance();

}
