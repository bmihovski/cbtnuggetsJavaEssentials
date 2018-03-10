package cbtnuggetsJavaEssentials;
import java.util.Scanner;
import java.util.Random;

public class Guess {

	private static Scanner userInput;

	public static void main(String[] args) {
		// Declare local variables
		char playAgain = 'y';
		
		// Loop the game over and over until the user decides to not play again
		do {
			
			playAgain = playGame();
			
		} while (playAgain == 'y');
		
		System.out.println("Thanks for playing!");

	}
	
	public static char playGame() {
		// Declare local variables
		char playDecision;
		int startNumber;
		int stopNumber;
		int guess;
		int guesses = 0;
		int randomNum;
		boolean success = false;
		
		userInput = new Scanner(System.in);
		Random ran = new Random();
		// Define range
		System.out.println("Enter start number: ");
		startNumber = userInput.nextInt();
		System.out.println("Enter stop number: ");
		stopNumber = userInput.nextInt();
		
		do {
			System.out.format("I'm thinking of a number between %d and %d. Try to guess it?\n", startNumber, stopNumber);
			randomNum = ran.nextInt((stopNumber - startNumber) + 1) + stopNumber;
			guess = userInput.nextInt();
			guesses++;
			if (guess == randomNum - 1) {
				System.out.println("You guessed correct! It only took you " + guesses + " guesses.");
				success = true;
			}
			else if (guess < randomNum - 1) {
				System.out.println("Sorry, that guess was too low.");
			}
			else {
				System.out.println("Sorry, that gues was too high");
			}
		} while (success == false);
		
		// Ask the user if they want to continue
		System.out.println("Do you wish to play again? (y/n)");
		playDecision = Character.toLowerCase(userInput.next().charAt(0));
		
		return playDecision;
	}

}
