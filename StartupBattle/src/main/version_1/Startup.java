package main.version_1;

import java.util.ArrayList;

import main.GameHelper;

/**
 * SimpleStartup class represents a simple game entity that can be "hit" or "killed" based on user guesses.
 * It tracks its location cells and the number of hits received.
 */
public class Startup {

    GameHelper helper = new GameHelper();
    ArrayList<String> startups;

    private ArrayList<String> locationCells;
    // private int numOfHits;
    
    /**
     * Checks the user's guess against the location cells.
     * @param guess the user's guessed position
     * @return the result of the guess: "hit", "miss", or "kill"
     */
    public String checkYourself(String guess){

        String result = "miss";
        int index = locationCells.indexOf(guess);

        // Iterate through location cells to check for hits
        // for(int cell : locationCells){
        //     // Hit detected
        //     if (guess == cell) { 
        //         numOfHits++;
        //         result = "hit";
        //         break;
        //     }
        // }

        // Check if the guess is in the location cells
        if (index >= 0) {
            locationCells.remove(index);
            // numOfHits++;

            // Check if all location cells have been hit and determine if it's a "kill"
            if (locationCells.isEmpty()) {
                result = "kill";
            }else{
                result = "hit";
            }
        }

        // Determine if the entity is "killed"
        // if (numOfHits == locationCells.length) {
        //     result = "kill";
        // }

        System.out.println(result);
        return result;
    }

    /**
     * Sets the location cells for this entity.
     * @param loc
     */
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

}
