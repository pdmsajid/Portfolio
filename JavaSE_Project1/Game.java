package com.rmit.mit.pf;

import java.util.Scanner;
import java.util.Random;

public class Game {

	public int numRounds;
	public int roundsWin;
	public int roundsWinByPrm;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game g1 = new Game();
		g1.playGame();

	}

	public void quickStart() { // Display the instructions of Game
		System.out.println(
				"\r-------------------------Welcome to ROCK / PAPER / SCISSOR Game-----------------------------------");
		System.out.println("*** iNSTRUCTIONS fOR tHE gAME ***");
		System.out.println("#pRESS\n 0. rOCK \n 1. pAPER \n 2. sCISSOR \n 55. Exit");
		System.out.println(
				"----------------------------------------------------------------------------------------------------\n");
	}

	public int userChoseInput() { // Getting the user input for the game

		
		int localUrInput, userInput=1;
		System.out.print("Choice your OPTION :\n 0 - RoCK \n 1 - Paper \n 2 - ScISSor \n 55 - Exit\nAnswer:");
		try{
		Scanner userChose = new Scanner(System.in);
		
			localUrInput = userChose.nextInt();
			if (localUrInput == 0 || localUrInput == 1 || localUrInput == 2) {
				userInput = localUrInput;
				
			} else if (localUrInput == 55) {
				System.out.println("Hope you Enjoyed :)");
				System.exit(0);
			} else {
				System.out.println("\nYour selection must be ( 0 / 1 / 2 ) or ( 55 )");
				userChoseInput();
			}
		} catch (Exception E) {
			System.out.println("Please Enter a Valid Number :");
			userChoseInput();
		}


		return userInput;
	}

	public int programChose() {// implementation of computer choose
		Random pramInput = new Random();
		int pramOption;
		System.out.println("Computer is thinking....... ");
		pramOption = pramInput.nextInt(3);
		return pramOption;
	}

	public int userRoundInput() {
		// Getting number of inputs from user
		int localInput;
		System.out.println("How many rounds you wish to play ?");
		Scanner rdInput = new Scanner(System.in);

		// Exception handling and limiting number of rounds to 30
		try {
			localInput = rdInput.nextInt();

			if (localInput > 0 && localInput < 30) {
				numRounds = localInput;
			} else {
				System.out.println("Please Enter valid number 1 - 30");
				userRoundInput();
			}
		} catch (Exception e) {
			System.out.println("Please enter a number ");
			userRoundInput();
		}

		return numRounds;
	}

	public void playGame() {
		// implementation of playing game
		int userChoise;
		int prmChoise;
		quickStart();
		numRounds = userRoundInput();
		System.out.println("##############################################################################");
		for (int i = 1; i <= numRounds; i++) {
			userChoise = userChoseInput();
			prmChoise = programChose();
			System.out.println("Computer Choice : " + prmChoise);
			System.out.println("\nMy Choice was : " + userChoise);
			/*
			 * 0. rOCK \n 1. pAPER \n 2. sCISSOR Rock & Paper = Paper Paper &
			 * Scissor = Scissor Scissor & Rock = Rock
			 */
			// algorithm of selecting winnings  
			if (userChoise == 0) {// user selects rocks
				if (prmChoise == 0) {
					System.out.println("Same item selected");
				} else if (prmChoise == 1) {// Program wins
					System.out.println("Paper wins: paper wraps rock : Computer wins");
					roundsWinByPrm = roundsWinByPrm + 1;
				} else if (prmChoise == 2) {// User wins
					System.out.println("Rock wins: rock blunts scissors : I win");
					roundsWin = roundsWin + 1;
				}
			} else if (userChoise == 1) {// user selects paper
				if (prmChoise == 0) {// user wins wins
					System.out.println("paper wins: paper wraps rock : I win");
					roundsWin = roundsWin + 1;
				} else if (prmChoise == 1) {
					System.out.println("Same item selected");
				} else if (prmChoise == 2) {// program wins
					System.out.println("Scissors wins: scissors cut paper : Computer win");
					roundsWinByPrm = roundsWinByPrm + 1;
				}
			} else {// user selects scissors
				if (prmChoise == 0) {// program wins
					System.out.println("Rock wins: rock blunts scissors : Computer win");
					roundsWinByPrm = roundsWinByPrm + 1;
				} else if (prmChoise == 1) {// user wins
					System.out.println("Scissors wins: scissors cut paper : I win");
					roundsWin = roundsWin + 1;
				} else if (prmChoise == 2) {
					System.out.println("Same item selected");
				}
			}

		}
		System.out.println("\n\n*******************************\nSummery - Total Rounds "+numRounds+"\nI won ( "+roundsWin+" ) Rounds\nComputer won ( "+roundsWinByPrm+" ) Rounds\n*******************************");
	}
}
