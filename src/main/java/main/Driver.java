package main;

public class Driver {
    // Initialize variables
    private String name;
    private String country;
    private int points;
    private RallyCar car;

    // CONSTRUCTOR
    public Driver(String name, String country, RallyCar car) {
        this.name = name;
        this.country = country;
        this.car = car;
    }
    // GETTERS AND SETTERS

    // Returns drivers name
    public String getName() {
        return name;
    }
    // Returs drivers country
    public String getCountry() {
        return country;
    }
    // Returns drivers car
    public RallyCar getCar() {
        return car;
    }
    // Sets drivers car
    public void setCar(RallyCar car) {
        this.car = car;
    }
    // Adds points to driver
    public void addPoints(int points) {
        this.points += points;
    }
    // Returns drivers points
    public int getPoints() {
        return points;
    }

}
