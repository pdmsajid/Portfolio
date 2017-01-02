
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

public abstract class GameItem {

    private char c;

    /* The constructor sets the character */

    public GameItem(char c) {
        this.c = c;
    }

    /*
     * This method is used to display the character in a particular position
     * inside the board
     */

    public char display() {
        return c;
    }

    protected abstract String sense();

}
