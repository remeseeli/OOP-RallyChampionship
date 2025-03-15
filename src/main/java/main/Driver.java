package main;

public class Driver {
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

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public RallyCar getCar() {
        return car;
    }
    public void setCar(RallyCar car) {
        this.car = car;
    }
    public void addPoints(int points) {
        this.points += points;
    }
    public int getPoints() {
        return points;
    }

}
