package main;

import java.util.List;

public class ChampionshipManager {
    private static ChampionshipManager instance;
    private List<Driver> drivers;
    private List<RallyRaceResult> races;
    private static int totalDrivers;
    private static int totalRaces;

    private ChampionshipManager() {
    }

    public static ChampionshipManager getInstance() {
        // IF THERE IS NO INSTANCE, CREATE ONE
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }
    public void registerDriver(Driver driver) {
        drivers.add(driver);
        // ADD ONE TO TOTAL COUNT OF DRIVERS
        totalDrivers++;
    }
    public void addRaceResult(RallyRaceResult result) {
        races.add(result);
        // ADD ONE TO TOTAL COUNT OF RACES
        totalRaces++;
    }
    public List<Driver> getDriverStandings() {
        // THIS FUNCTION IS MADE BY COPILOT
        // SORT DRIVERS BY POINTS IN DESCENDING ORDER
        drivers.sort((d1, d2) -> d2.getPoints() - d1.getPoints());
        return drivers;
    }
    public static Driver getLeadingDriver() {
        // GET THE FIRST DRIVER  IN THE LIST (INDEX 0) AS IT IS SORTED
        return instance.drivers.get(0);
    }
    public static int getTotalChampionShipPoints() {
        int totalPoints = 0;
        // SUM ALL POINTS OF ALL DRIVERS
        for (Driver driver : instance.drivers) {
            totalPoints += driver.getPoints();
        }
        return totalPoints;
    }
    public static int getTotalRaces() {
        return totalRaces;
    }
}
