package main;

import java.util.ArrayList;
import java.util.List;

public class ChampionshipManager {

    // Initialize variables
    private static ChampionshipManager instance;
    private List<Driver> drivers;
    private List<RallyRaceResult> races;
    private static int totalDrivers;
    private static int totalRaces;

    // CONSTRUCTOR IS PRIVATE TO FOLLOW SINGLETON DESIGN PATTERN
    private ChampionshipManager() {
        // Does not accept any parameters, but we can initialize the lists
        drivers = new ArrayList<>();
        races = new ArrayList<>();
    }
    // Returns instance of ChampionshipManager, follows Singleton design pattern
    public static ChampionshipManager getInstance() {
        // IF THERE IS NO INSTANCE, CREATE ONE
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }
    // Register a driver and increment totalDrivers
    public void registerDriver(Driver driver) {
        drivers.add(driver);
        // ADD ONE TO TOTAL COUNT OF DRIVERS
        totalDrivers++;
    }
    // Add race (location and name)
    public void addRaceResult(RallyRaceResult result) {
        races.add(result);
        // ADD ONE TO TOTAL COUNT OF RACES
        totalRaces++;
    }
    // Returns list of drivers sorted by points
    public List<Driver> getDriverStandings() {
        // THIS FUNCTION IS MADE BY COPILOT
        // SORT DRIVERS BY POINTS IN DESCENDING ORDER
        drivers.sort((d1, d2) -> d2.getPoints() - d1.getPoints());
        return drivers;
    }
    // Returns leading driver
    public static Driver getLeadingDriver() {
        // GET THE FIRST DRIVER  IN THE LIST (INDEX 0) AS IT IS SORTED
        return instance.drivers.get(0);
    }
    // Returns total championship points
    public static int getTotalChampionShipPoints() {
        int totalPoints = 0;
        // SUM ALL POINTS OF ALL DRIVERS
        for (Driver driver : instance.drivers) {
            totalPoints += driver.getPoints();
        }
        return totalPoints;
    }
    // Returns total races, this  method was not in the UML diagram but had to be implemented
    public static int getTotalRaces() {
        return totalRaces;
    }
    // Returns total drivers
    public static int getTotalDrivers() {
        return totalDrivers;
    }
}
