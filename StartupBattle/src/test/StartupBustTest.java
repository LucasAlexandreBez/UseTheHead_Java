package test;

import java.util.ArrayList;

import main.GameHelper;
import main.version_2.Startup;

public class StartupBustTest {
    
    private GameHelper gameHelper = new GameHelper();
    private ArrayList<Startup> startups = new ArrayList<Startup>();
    private int numOfGuess = 0;

    public void setUpGame(){
        Startup startup_1 = new Startup("strup1");
        Startup startup_2 = new Startup("strup2");
        Startup startup_3 = new Startup("strup3");

        startups.add(startup_1);
        startups.add(startup_2);
        startups.add(startup_3);

        for (Startup startup : startups) {
            // PlaceStartup place = new PlaceStartup();
            // place(startup);
        }
    }

    public void startPlaying(){

        String userGuess = "A1";

        if (!startups.isEmpty()) {
            checkUserGuess(userGuess);
        } 
        else{
            finishGame();
        }
    }

    public void checkUserGuess(String userGuess){
        numOfGuess++;
        String result = "miss";

        for (Startup startup : startups) {
           if (startup.getGame() == userGuess) {
                int index = startups.indexOf(startup);
                startups.remove(index);
                
                if (!startups.contains(startup)) {
                    result = "kill";
                }

                result = "hit";
           }
           break;
        }

        System.out.println(result);

    }

    public void finishGame(){

        System.out.println("U sink all the startups...Congrats!!! Silicium valley may fear u now...Or u may not get a job in there anymore :-)");

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
