
/*
 * ==============================================================================================================
 * 									==========Wumpus=========
 * 								Programming Fundamentals - Assignment 2
 * 						++ Team Members ++
 * 								* s3590683 - Zaid Aslam Shaikh  
 * 								* s3615000 - Pakirdeen Mohammed Sajid
 * 								* s3618070 - Vineeth Reddy Theneti
 * 						-----------------------------------------------------
 * 						InsTraCtions to play the GaMe:
 * 						-----------------------------------------------------
 * 						* Select your Move
 * 						* Press Enter
 * 						* Collect the Points 
 *                      * ---- HAPPY WUMPUS --- *
 * ==============================================================================================================
 */

import java.util.Random;
import java.util.Scanner;

/*This class includes the whole logic of setting the board, asking for user input and sensing the nearby shells
 * on the board*/

public class Game {
    // private array called -board-
    private GameItem[][] board = new GameItem[4][4];

    // private int count;

    private int goldCount;
    private int pitCount;
    private int wumpusCount;
    private int countGold;

    private static int left = 1;
    private static int right = 2;
    private static int up = 3;
    private static int down = 4;

    Scanner s1 = new Scanner(System.in);
    // private int clearCount;
    private int randNum1;
    private int randNum2;
    private static int MAX = 3;
    private static int MIN = 0;
    private int userInput;
    private int userScore;

    private boolean userStatus;

    private char[] check;

    private int x;
    private int y;

    private int row;
    private int column;

    /*
     * The declaration of Random is to generate the random values of
     * Pit,Wumpus,Gold on the board at different positions
     */

    private Random randNumber;

    private GameItem gold, wumpus, pit, clearground;

    /*
     * This method is to set the board with 16 shells with Pit,Wumpus,Gold and
     * ClearGround objects randomly
     */

    private void setBoard() {

        check = new char[3];
        // count initialization
        goldCount = 0;
        pitCount = 0;
        wumpusCount = 0;

        // Pit object initialization
        while (pitCount < MAX) {
            randNumber = new Random();
            randNum1 = randNumber.nextInt(4);
            randNum2 = randNumber.nextInt(4);
            if (board[randNum1][randNum2] == null) {
                pit = new Pit('p');
                check[0] = pit.display();
                board[randNum1][randNum2] = pit;
                pitCount++;
            }
        }
        // Wumpus object initialization
        while (wumpusCount < 1) {
            randNumber = new Random();
            randNum1 = randNumber.nextInt(4);
            randNum2 = randNumber.nextInt(4);
            if (board[randNum1][randNum2] == null) {
                wumpus = new Wumpus('w');
                check[1] = wumpus.display();
                board[randNum1][randNum2] = wumpus;
                wumpusCount++;
            }

        }

        // Pick Random number for Gold
        Random s11 = new Random();
        goldCount = s11.nextInt(3);

        // Gold object initialization
        while (goldCount < MAX) {

            randNumber = new Random();
            randNum1 = randNumber.nextInt(4);
            randNum2 = randNumber.nextInt(4);
            if (board[randNum1][randNum2] == null) {
                gold = new Gold('g');
                check[2] = gold.display();
                board[randNum1][randNum2] = gold;
                goldCount++;
                countGold++;
            }
        }

        // apply clear ground
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                randNum1 = randNumber.nextInt(3);
                randNum2 = randNumber.nextInt(3);
                if (board[i][j] == null) {
                    clearground = new ClearGround('.');
                    board[i][j] = clearground;
                }
            }
        }

    }

    /*
     * This method display() is implemented to display the board on invoking it
     * 
     * @param x This is the first parameter to display method
     * 
     * @param y This is the second parameter to display method
     * 
     * @return nothing
     */

    public void display(int x, int y) {
        for (int i = 0; i < board.length; i++) {
            System.out.println();
            for (int j = 0; j < board.length; j++) {

                System.out.print("|");
                if (i == x && j == y) {
                    System.out.print("*");
                } else {
                    System.out.print(board[i][j].display());
                }
            }
        }
        System.out.println();
    }

    /*
     * This method seneseNearby() is implemented to sense the object in very
     * next shell on the board
     * 
     * @param x This is the first parameter to senseNearby() method
     * 
     * @param y This is the second parameter to senseNearby() method
     * 
     * @return nothing
     */

    private void senseNearby(int x, int y) {

        for (int i = 0; i < check.length; i++) {
            if (y == 0) {// userInputLeft
                if (board[x][y + MAX].display() == check[i]) {
                    System.out.println(" " + board[x][y + MAX].sense());
                }
            } else {// userInputRight
                if (board[x][y - 1].display() == check[i]) {
                    System.out.println(" " + board[x][y - 1].sense());
                }
                if (y == MAX) {// userInputRight
                    if (board[x][y - MAX].display() == check[i]) {
                        System.out.println(" " + board[x][y - MAX].sense());
                    }
                } else {// userInputleft
                    if (board[x][y + 1].display() == check[i]) {
                        System.out.println(" " + board[x][y + 1].sense());
                    }
                }
                if (x == 0) {// userInput up
                    if (board[x + MAX][y].display() == check[i]) {
                        System.out.println(" " + board[x + MAX][y].sense());
                    }
                } else {//// userInput up
                    if (board[x - 1][y].display() == check[i]) {
                        System.out.println(" " + board[x - 1][y].sense());
                    }
                }
                if (x == MAX) {// userInput down
                    if (board[x - MAX][y].display() == check[i]) {
                        System.out.println(" " + board[x - MAX][y].sense());
                    }
                } else {// userInput down
                    if (board[x + 1][y].display() == check[i]) {
                        System.out.println(" " + board[x + 1][y].sense());
                    }
                }

            }
        }
    }

    /*
     * This method menu() has the whole logic of viewing the options for user to
     * choose
     */

    private void menu() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            if (userInput > 5) {
                System.out.println("Please Enter A Valid Number [ 1 / 2 / 3 / 4 or 5 - Exit ] :");
            }
            System.out.println();
            System.out.println("==========Wumpus=========");
            System.out.println("1. userInput player left");
            System.out.println("2. userInput player right");
            System.out.println("3. userInput player up");
            System.out.println("4. userInput player down");
            System.out.println("5. Quit");
            System.out.println("Please enter your choice:");
            while (!sc.hasNextInt()) {
                System.out.println("Please Enter A Valid Number [ 1 / 2 / 3 / 4 or 5 - Exit ] :");
                sc.next();
            }
            choice = sc.nextInt();
            while (choice < 1) {
                System.out.println("Please Enter A Valid Number [ 1 / 2 / 3 / 4 or 5 - Exit ] :");
                choice = sc.nextInt();
            }
            userInput = choice;
        } while (choice > 5);
        System.out.println("Your choice : " + choice + ".");
        if (userInput == 5) {
            System.out.println("Thanks for Playing.....");
            System.out.println("=========================");
            System.exit(0);
        }
        System.out.println("*************************");
        System.out.println("=========================");
        System.out.println();
        System.out.println();
    }

    /* This method is for user initial position on the board which is Random */

    private void placePlayer() {
        do {
            randNumber = new Random();
            x = randNumber.nextInt(4);
            y = randNumber.nextInt(4);
        } while (board[x][y].display() != '.');
        row = positionX(x);
        column = positionY(y);

    }

    /*
     * This method is for the position of the user with the options that he
     * choose
     */

    private void userPosition() {

        row = positionX(row);
        column = positionY(column);

    }

    /*
     * This method is checking whether there is a gold , pit or wumpus inside
     * the board
     */

    private void searchItem() {
        // ------------------------------
        senseNearby(row, column);
        if (board[row][column].display() == check[0]) {
            System.out.println("You died man !!");
            clearground = new ClearGround(' ');
            display(row, column);
            board[row][column] = clearground;
            userStatus = false;
            System.out.println(" --------- Game Over --------- ");
            System.exit(0);

        } else if (board[row][column].display() == check[1]) {
            System.out.println(" *** Wumpus *** ");
            clearground = new ClearGround(' ');
            board[row][column] = clearground;
            display(row, column);
            userStatus = false;
            System.out.println(" --------- Game Over --------- ");
            System.exit(0);

        } else if (board[row][column].display() == check[2]) {
            clearground = new ClearGround(' ');
            board[row][column] = clearground;
            userScore = userScore + 1;
            System.out.println("You Collected the Gold !!! " + userScore);
            if (userScore == countGold) {
                System.out.println("Yaahuuuu You collected all the golds !!!");
                System.out.println(" --------- Game Over --------- ");
                System.exit(0);
            }
            display(row, column);
            menu();
            row = positionX(row);
            column = positionY(column);
            do {
                searchItem();
            } while (userStatus == true);
        } else {
            display(row, column);
            menu();
            row = positionX(row);
            column = positionY(column);
            do {
                searchItem();
            } while (userStatus == true);

        }
        // -----------------------------------------------

    }

    /* This method returns User row Position */

    public int positionX(int x) {

        if (userInput == up) {
            if (x == MIN) {
                x = x + 3;
            } else if (x <= MAX) {
                x = x - 1;
            }
        } else if (userInput == down) {
            if (x < MAX) {
                x = x + 1;
            } else if (x == MAX) {
                x = x - 3;
            }
        }

        return x;
    }

    /* This method returns User column Position */

    public int positionY(int y) {

        if (userInput == left) {

            if (y == MIN) {
                y = y + 3;
            } else if (y <= MAX) {
                y = y - 1;
            }
        } else if (userInput == right) {
            if (y < MAX) {
                y = y + 1;
            } else if (y == MAX) {
                y = y - 3;
            }

        }

        return y;
    }

    /*
     * This method runGame() includes invoking of all the methods inorder to run
     * the game smoothly
     */

    public void runGame() {
        // validate();

        setBoard();
        placePlayer();
        System.out.println("+++++ Welcome to Wumpus Game +++++");
        display(x, y);

        menu();
        userPosition();
        searchItem();

    }

}
