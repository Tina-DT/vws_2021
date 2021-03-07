package com.javatechie.app.sonar_example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Tina Heilig ESA 4 - CCD
 */
class RollTheDice {

	private static final int SIDES_OF_DICE = 6;

	private static final int K_O_SCORE = 9;

	private Scanner keyboard;

	private int numberOfPlayers;

	public RollTheDice(int numberOfPlayers, Scanner tokeyboard) {
		keyboard = tokeyboard;
		if (numberOfPlayers < 1) {
			numberOfPlayers = 1;
		}
		this.numberOfPlayers = numberOfPlayers;
	}

	public void play() {
		// hier könnte noch eine ins Spiel ausgegeben werden
		int[] pointsOfPlayers = new int[numberOfPlayers];
		for (int player = 1; player <= numberOfPlayers; player++) {
			pointsOfPlayers[player - 1] = playRoundForPlayer(player);
		}
		identifyTheWinner(pointsOfPlayers);
	}

	private int playRoundForPlayer(int playerNumber) {
		int diceSum = 0;
		String answer = "y";
		Random r = new Random();

		System.out.println("Player " + playerNumber + " rolled the dice");

		while (answer.equals("y") && (diceSum <= K_O_SCORE)) {

			int roll = r.nextInt(SIDES_OF_DICE) + 1;

			diceSum += roll;
			System.out.println("You rolled a " + roll + "! Score: " + diceSum);
			if (diceSum <= K_O_SCORE) {
				System.out.println("Roll the dice again? Press ’y’ to continue or any other key to quit.");
				answer = keyboard.next();
			}
		}
		System.out.println("Your final score is: " + diceSum);
		if (diceSum > K_O_SCORE) {
			System.out.println("YOU LOSE!");
		}
		return diceSum;
	}

	private void identifyTheWinner(int[] pointsOfPlayers) {
		int gewinner = -1;

		for (int i = 0; i < pointsOfPlayers.length; i++) {
			if (pointsOfPlayers[i] <= K_O_SCORE) {
				if (gewinner != -1) {
					if (pointsOfPlayers[i] > pointsOfPlayers[gewinner]) { // bei einem Unentschieden hat leider nur der
																			// gewonnen, der zuerst in der List steht.
						gewinner = i;
					}
				} else {
					gewinner = i;
				}
			}
		}
		if (gewinner == -1) {
			System.out.println("No one wins");
		} else {
			System.out.println("Player " + (gewinner + 1) + " has won with a score of " + pointsOfPlayers[gewinner]);
		}
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		try {
			System.out.println("How many players?");
			int playerNumber = keyboard.nextInt();
			RollTheDice theGame = new RollTheDice(playerNumber, keyboard);
			theGame.play();
		} catch (InputMismatchException ex) {
			System.out.println("Invalid input! You have to enter a number");
			keyboard.next();
			main(args);
		}
		keyboard.close();
	}
}