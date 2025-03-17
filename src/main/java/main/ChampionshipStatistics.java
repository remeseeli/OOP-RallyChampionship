package main;

import java.util.List;

public class ChampionshipStatistics {

    // Calculate average points per driver
    public static double calculateAveragePointsPerDriver(List<Driver> drivers) {
        // Initialize total points
        double totalPoints = 0;
        // Loop through drivers and sum points
        for (Driver driver : drivers) {
            totalPoints += driver.getPoints();
        }
        // Return average points
        return Math.round(totalPoints / drivers.size());
    }
    // Find most successful country
    public static String findMostSuccessfulCountry(List<Driver> drivers) {
        // Initialize variables
        int maxPoints = 0;
        String country = "";
        // Loop through drivers and find the one with the most points and check his/her country
        for (Driver driver : drivers) {
            if (driver.getPoints() > maxPoints) {
                maxPoints = driver.getPoints();
                country = driver.getCountry();
            }
        }
        return country;
    }

    // Get amount of total races held from ChampionshipManager
    public static int getTotalRacesHeld() {
        return ChampionshipManager.getTotalRaces();
    }
    // Get amount of total drivers registered from ChampionshipManager
    public static int getTotalDriversRegistered() {
        return ChampionshipManager.getTotalDrivers();
    }

}
