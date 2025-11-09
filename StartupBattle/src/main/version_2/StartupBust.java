package main.version_2;

import java.util.ArrayList;

import main.GameHelper;

public class StartupBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuess = 0;

    public void setUpGame() {
        Startup startup_1 = new Startup("strup1");
        Startup startup_2 = new Startup("strup2");
        Startup startup_3 = new Startup("strup3");
        startups.add(startup_1);
        startups.add(startup_2);
        startups.add(startup_3);

        for (Startup startup : startups) {
            ArrayList<String> newLocation = helper.placeStartup(3);
            startup.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Enter a guess: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess) {
        numOfGuess++;
        String result = "miss";

        for (Startup startupToTest : startups) {
            result = startupToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame() {

        System.out.println("U sink all the startups...Congrats!!! Silicium valley may fear u now...Or u may not get a job in there anymore :-(");

        if (numOfGuess >= 9 && numOfGuess <= 12) {
            System.out.println("Man...u really have x-man power don't ya?");
            System.out.println("Congrats u only took " + numOfGuess + " chances to guess");
        } else if (numOfGuess >= 13 && numOfGuess <= 18) {
            System.out.println("U are getting better, good job!");
            System.out.println("Congrats u only took " + numOfGuess + " chances to guess");
        } else {
            System.out.println("Need to practice more as u took " + numOfGuess + " chances to guess");
        }
    }
}
