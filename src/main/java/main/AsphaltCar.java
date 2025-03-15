package main;

public class AsphaltCar extends RallyCar {

    private double downforce;

    // CONSTRUCTOR
    public AsphaltCar(String make, String model, int horsepower, double downforce) {
        super(make, model, horsepower);
        this.downforce = downforce;
    }

    public double getDownforce() {
        return downforce;
    }
    // OVERRIDING THE ABSTRACT METHOD
    @Override
    public double calculatePerformance() {
        // WORK IN PROGRESS; FORMULA TO BE DETERMINED
        return getHorsepower() * 0.9 + downforce * 0.1;
    }
}
