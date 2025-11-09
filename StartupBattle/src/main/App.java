package main;

import main.version_1.Startup;
import main.version_2.StartupBust;

/**
 * App class serves as the entry point for the Startup Battle game.
 * It initializes the game, handles user input, and manages the game loop.
 */
public class App {

    /**
     * Main method to start the game.
     * @param args
     */
    public static void main(String[] args) {
        // Initialize number of guesses and random starting position
        // int numOfGuesses = 0;
        // int randomNum = (int) (Math.random() * 5);

        // // Initialize game helper and startup entity
        // GameHelper helper = new GameHelper();
       
        // Startup theStartup = new Startup();

        // Set the location cells for the startup entity
        // int[] locations = {randomNum, randomNum + 1};

        // theStartup.setLocationCells(locations); // Define the location of the startup
        // boolean isAlive = true; // Flag to track if the startup is still alive

        // Game loop
        // while (isAlive) {
        //     int guess = helper.getUserInput("Enter a number: ");
        //     String result = theStartup.checkYourself(guess);
        //     numOfGuesses++;
        //     // Check if the startup has been "killed"
        //     if (result.equals("kill")) {
        //         isAlive = false;
        //         System.out.println("You took" + numOfGuesses + "guesses...");
        //     }
        // }

        StartupBust game = new StartupBust();
        game.setUpGame();
        game.startPlaying();
    }
}
