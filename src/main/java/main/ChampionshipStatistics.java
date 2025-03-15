package main;

import java.util.List;

public class ChampionshipStatistics {

    public static double calculateAveragePointsPerDriver(List<Driver> drivers) {
        double totalPoints = 0;
        for (Driver driver : drivers) {
            totalPoints += driver.getPoints();
        }
        return totalPoints / drivers.size();
    }

    public static String findMostSuccessfulCountry(List<Driver> drivers) {
        int maxPoints = 0;
        String country = "";
        for (Driver driver : drivers) {
            if (driver.getPoints() > maxPoints) {
                maxPoints = driver.getPoints();
                country = driver.getCountry();
            }
        }
        return country;
    }

    public static int getTotalRacesHeld() {
        return ChampionshipManager.getTotalRaces();
    }

}
