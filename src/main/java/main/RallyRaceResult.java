package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RallyRaceResult implements RaceResult {

    // Initialize variables
    private String raceName;
    private String location;
    private Map<Driver, Integer> results;

    // CONSTRUCTOR
    public RallyRaceResult(String raceName, String location) {
        this.raceName = raceName;
        this.location = location;
        this.results = new HashMap<>();
    }
    // Returns location of race
    public String getLocation() {
        return location;
    }
    // Returns name of race
    public String getRaceName() {
        return raceName;
    }
    // IMPLEMENT INTERFACE METHODS
    // Record result of driver
    @Override
    public void recordResult(Driver driver, int position, int points) {
        // Add driver and points to results map
        results.put(driver, points);
        // Add points to driver
        driver.addPoints(points);
    }
    // Returns points of driver from results map
    @Override
    public int getDriverPoints(Driver driver) {
        return results.get(driver);
    }
    // Returns list of drivers from results map
    @Override
    public List<Driver> getResults() {
        // The keySet() method returns a Set view of the keys (Driver objects) contained in the map
        return new ArrayList<>(results.keySet());
    }
}
