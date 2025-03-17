package main;

public class GravelCar extends RallyCar {

    // GravelCar specific variable
    private double suspensionTravel;

    // CONSTRUCTOR
    public GravelCar(String make, String model, int horsepower, double suspensionTravel) {
        super(make, model, horsepower);
        this.suspensionTravel = suspensionTravel;
    }

    // Get suspension travel
    public double getSuspensionTravel() {
        return suspensionTravel;
    }
    // OVERRIDING THE ABSTRACT METHOD
    @Override
    public double calculatePerformance() {
        // FORMULA WAS MADE UP BY ME
        return (getHorsepower() * Math.sqrt(suspensionTravel)) * 4;
    }
}
