package main;

public class AsphaltCar extends RallyCar {

    // AsphaltCar specific variable
    private double downforce;

    // CONSTRUCTOR
    public AsphaltCar(String make, String model, int horsepower, double downforce) {
        super(make, model, horsepower);
        this.downforce = downforce;
    }
    // GETTER FOR DOWNFORCE
    public double getDownforce() {
        return downforce;
    }
    // OVERRIDING THE ABSTRACT METHOD
    @Override
    public double calculatePerformance() {
        // FORMULA MADE UP BY ME
        return (getHorsepower() * Math.sqrt(downforce)) / 10;
    }
}
