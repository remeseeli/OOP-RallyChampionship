package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RallyRaceResult implements RaceResult {

    private String raceName;
    private String location;
    private Map<Driver, Integer> results;

    // CONSTRUCTOR
    public RallyRaceResult(String raceName, String location) {
        this.raceName = raceName;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
    public String getRaceName() {
        return raceName;
    }
    // IMPLEMENT INTERFACE METHODS
    @Override
    public void recordResult(Driver driver, int position, int points) {
        results.put(driver, points);
    }
    @Override
    public int getDriverPoints(Driver driver) {
        return results.get(driver);
    }
    @Override
    public List<Driver> getResults() {
        return new ArrayList<>(results.keySet());
    }
}
