
/*
 * ==============================================================================================================
 *                                  ==========Wumpus=========
 *                              Programming Fundamentals - Assignment 2
 *                      ++ Team Members ++
 *                              * s3590683 - Zaid Aslam Shaikh
 *                              * s3615000 - Pakirdeen Mohammed Sajid
 *                              * s3618070 - Vineeth Reddy Theneti 
 *                      -----------------------------------------------------
 *                      InsTraCtions to play the GaMe:
 *                      -----------------------------------------------------
 *                      * Select your Move
 *                      * Press Enter
 *                      * Collect the Points 
 *                      * ---- HAPPY WUMPUS --- *
 * ==============================================================================================================
 */

import java.util.Random;

public class Pit extends GameItem {

    public Pit(char c) {
        super(c);
        // TODO Auto-generated constructor stub
    }

    /* This method overrides the sense from gameItem */
    @Override
    protected String sense() {
        // TODO Auto-generated method stub
        return "Sense Breeze";
    }

}
