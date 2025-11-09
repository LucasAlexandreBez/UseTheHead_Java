package main.version_2;

import java.util.ArrayList;

public class Startup {
    
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public Startup(String name) {
        this.name = name;
    }

    public String checkYourself(String userinput){
        String result = "miss"; 
        int index = locationCells.indexOf(userinput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch!...U sunck " + name + " :(");
            }else{
                result = "hit";
            }
        }

        return result;
    }

}
