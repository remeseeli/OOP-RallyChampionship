package main;

public class AsphaltCar extends RallyCar {

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
        // FORMULA BY CHATGPT, NO CLEAR FORMULA
        return getHorsepower() * Math.sqrt(downforce);
    }
}
