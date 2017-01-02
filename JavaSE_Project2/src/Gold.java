
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

public class Gold extends GameItem {

    public Gold(char c) {
        super(c);
        // TODO Auto-generated constructor stub
    }

    /* This method overrides the sense from gameItem */
    public String sense() {
        return "Sense faint glitter";
    }

}
