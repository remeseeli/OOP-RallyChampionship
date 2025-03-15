package main;

public class GravelCar extends RallyCar {

    private double suspensionTravel;

    // CONSTRUCTOR
    public GravelCar(String make, String model, int horsepower, double suspensionTravel) {
        super(make, model, horsepower);
        this.suspensionTravel = suspensionTravel;
    }

    public double getSuspensionTravel() {
        return suspensionTravel;
    }
    // OVERRIDING THE ABSTRACT METHOD
    @Override
    public double calculatePerformance() {
        // WORK IN PROGRESS; FORMULA TO BE DETERMINED
        return getHorsepower() * 0.8 + suspensionTravel * 0.2;
    }
}
