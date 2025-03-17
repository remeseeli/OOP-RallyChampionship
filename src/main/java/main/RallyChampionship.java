package main;

import java.util.List;

public class RallyChampionship
{
    public static void main( String[] args ) {

        // CREATE CHAMPIONSHIPMANAGER INSTANCE
        ChampionshipManager csmanager =  ChampionshipManager.getInstance();
        // CREATE DRIVER LIST
        // CREATE DRIVERS WITH CARS FOR SIMULATION
        // CAR 1  - GRAVEL CAR
        RallyCar impreza = new GravelCar("Subaru", "Impreza", 300, 0.2);
        Driver mcrae = new Driver("Colin McRae", "UK", impreza);
        // CAR 2  - ASPHALT CAR
        RallyCar supra = new AsphaltCar("Toyota", "Supra", 320, 200.0);
        Driver nagata = new Driver("Smokey Nagata", "Japan", supra);
        // CAR 3 - GRAVEL CAR
        RallyCar peugeot206 = new GravelCar("Peugeot", "206", 280, 0.3);
        Driver gronholm = new Driver("Markus Grönholm", "Finland", peugeot206);
        // CAR 4 - ASPHALT CAR
        RallyCar skyline = new AsphaltCar("Nissan", "Skyline R32", 320, 250.0);
        Driver nakazato = new Driver("Takeshi Nakazato", "Japan", skyline);
        // CAR 5 - GRAVEL CAR
        RallyCar lancerevo = new GravelCar("Mitsubishi", "Lancer Evo IV", 290, 0.25);
        Driver makinen = new Driver("Tommi Mäkinen", "Finland", lancerevo);
        // CAR 6 - ASPHALT CAR
        RallyCar rx7 = new AsphaltCar("Mazda", "RX-7", 300, 180.0);
        Driver boswell = new Driver("Sean Boswell", "USA", rx7);

        // REGISTER DRIVERS TO CHAMPIONSHIP
        csmanager.registerDriver(mcrae);
        csmanager.registerDriver(nagata);
        csmanager.registerDriver(gronholm);
        csmanager.registerDriver(nakazato);
        csmanager.registerDriver(makinen);
        csmanager.registerDriver(boswell);

        // SIMULATE RACE 1 - GRAVEL RACE IN JYVÄSKYLÄ (TARMAC DRIVERS AT DISADVANTAGE SINCE THEY HAVE TARMAC CARS)
        // Add race to championship manager
        RallyRaceResult race1 = new RallyRaceResult("Rally Finland", "Jyväskylä");
        csmanager.addRaceResult(race1);
        // Record driver's scores
        race1.recordResult(mcrae , 1 ,25);
        race1.recordResult(gronholm, 2, 18);
        race1.recordResult(makinen, 3, 15);
        race1.recordResult(nagata, 4 ,12);
        race1.recordResult(nakazato, 5, 10);
        race1.recordResult(boswell, 6, 8);

        // SWITCH CARS FOR RACE 2 (GRAVEL DRIVERS CHANGE TO NEW TARMAC CARS)
        mcrae.setCar(new AsphaltCar("Toyota", "Celica", 280, 225.0));
        gronholm.setCar(new AsphaltCar("Toyota", "GR Yaris", 290, 200.0));
        makinen.setCar(new AsphaltCar("Porsche", "911 R-GT", 320, 250.0));

        // SIMULATE RACE 2 - TARMAC RACE IN NAGOYA
        // Add new race to championship manager
        RallyRaceResult race2 = new RallyRaceResult("Rally Japan", "Nagoya");
        csmanager.addRaceResult(race2);
        // Record driver's scores
        race2.recordResult(nagata, 1, 25);
        race2.recordResult(boswell, 2, 18);
        race2.recordResult(nakazato, 3, 15);
        race2.recordResult(makinen, 4, 12);
        race2.recordResult(gronholm, 5, 10);
        race2.recordResult(mcrae, 6, 8);
        

        System.out.println("===== RALLY CHAMPIONSHIP STANDINGS =====");
        // PRINT STANDINGS BY POSITION
        // Initialize position for incrementing
        int position = 1;
        // Loop through drivers and print standings, incrementing position
        for (Driver driver : csmanager.getDriverStandings()) {
            System.out.println(position + ". " + driver.getName() + " (" + driver.getCountry() + "): " + driver.getPoints() + " points");
            position++;
        }

        // Linebreak for clarity
        System.out.println();

        // PRINT CHAMPIONSHIP LEADER
        // Get leading driver from championship manager and print
        System.out.println("===== CHAMPIONSHIP LEADER =====");
        System.out.println(ChampionshipManager.getLeadingDriver().getName() + " with " + ChampionshipManager.getLeadingDriver().getPoints() + " points");

        // Linebreak for clarity
        System.out.println();

        // PRINT CHAMPIONSHIP STATISTICS
        System.out.println("===== CHAMPIONSHIP STATISTICS =====");
        // Get total drivers from ChampionshipManager
        System.out.println("Total Drivers: " + ChampionshipStatistics.getTotalDriversRegistered());
        // Get total races held from Championshipmanager and print
        System.out.println("Total Races: " + ChampionshipStatistics.getTotalRacesHeld());
        // Print average points per driver
        System.out.println("Average Points Per Driver: " + ChampionshipStatistics.calculateAveragePointsPerDriver(csmanager.getDriverStandings()));
        // Print most successful country from driver standings
        System.out.println("Most Successful Country: " + ChampionshipStatistics.findMostSuccessfulCountry(csmanager.getDriverStandings()));
        // Print total championship points from ChampionshipManager
        System.out.println("Total Championship Points: " + ChampionshipManager.getTotalChampionShipPoints());

        // Linebreak for clarity
        System.out.println();

        // PRINT RACE 1 RESULTS
        System.out.println("===== RACE RESULTS ====="); 
        System.out.println("Race: " + race1.getRaceName() + " (" + race1.getLocation() + ")");
        // Reset position to 1 for incrementing (as it was used previously)
        position = 1;
        // SORTING ASSISTANCE BY COPILOT
        // Print standings 
        List<Driver> race1Results = race1.getResults();
        race1Results.sort((d1, d2) -> race1.getDriverPoints(d2) - race1.getDriverPoints(d1));
        for (Driver driver : race1Results) {
            System.out.println("Position " + position + ": " + driver.getName() + " (" + driver.getCountry() + ") - " + race1.getDriverPoints(driver) + " points");
            position++;
        }

        // Linebreak for clarity
        System.out.println();

        // PRINT RACE 2 RESULTS
        System.out.println("Race: " + race2.getRaceName() + " (" + race2.getLocation() + ")");
        // Reset position to 1 for incrementing (as it was used previously)
        position = 1;
        // SORTING ASSISTANCE BY COPILOT
        // Print standings
        List<Driver> race2Results = race2.getResults();
        race2Results.sort((d1, d2) -> race2.getDriverPoints(d2) - race2.getDriverPoints(d1));
        for (Driver driver : race2Results) {
            System.out.println("Position " + position + ": " + driver.getName() + " (" + driver.getCountry() + ") - " + race2.getDriverPoints(driver) + " points");
            position++;
        }

        // SWITCH CARS BACK TO GRAVEL CARS FOR PERFORMANCE MEASUREMENT
        mcrae.setCar(impreza);
        gronholm.setCar(peugeot206);
        makinen.setCar(lancerevo);
        // Linebreak for clarity
        System.out.println();
        // PRINT RATINGS FOR CAR PERFORMANCE
        System.out.println("===== CAR PERFORMANCE RATINGS =====");
        // Initialize total performance variables
        double totalgravelperformance = 0;
        double totaltarmacperformance = 0;
        // Initialize total car count variables
        int totalgravelcars = 0;
        int totaltarmaccars = 0;
        // Loop through drivers and calculate total performance for each car type
        for (Driver driver : csmanager.getDriverStandings()) {
            if (driver.getCar() instanceof GravelCar) {
                totalgravelperformance += driver.getCar().calculatePerformance();
                totalgravelcars++;
            }
            else if (driver.getCar() instanceof AsphaltCar) {
                totaltarmacperformance += driver.getCar().calculatePerformance();
                totaltarmaccars++;
            }
        }
        // Print out average performance for each car type
        System.out.println("Gravel Car Performance: " + Math.round(totalgravelperformance / totalgravelcars));
        System.out.println("Asphalt Car Performance: " + Math.round(totaltarmacperformance / totaltarmaccars));
    }
}
