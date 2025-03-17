package main;

import java.util.List;

public interface RaceResult {

    // INTERFACE METHODS

    // Record result of driver
    public void recordResult(Driver driver, int position, int points);
    // Returns points of driver from results map
    public int getDriverPoints(Driver driver);
    // Returns list of drivers from results map
    public List<Driver> getResults();

}
