import java.util.Scanner;

public class RoshamboApp {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	System.out.println("Welcome to our Rock, Paper, Scissors game!\n");
			
	Player rockPlayer = new RockPlayer ("DaRoc");
	Player randomPlayer = new RandomPlayer();
	Player humanPlayer = new HumanPlayer();

	
	Roshambo r2 = rockPlayer.generateRoshambo();
	Roshambo r1 = humanPlayer.generateRoshambo();
	
	System.out.println("What is your name? ");
	String name = scan.nextLine();
	humanPlayer.setName(name);
	boolean validInput = false;
	String input;

	
do {
	do {
	 input = Validator.getString(scan, "Enter rock, paper, or scissors.\n");
	
		if (input.toLowerCase().startsWith("r") || input.toLowerCase().startsWith("p") || input.toLowerCase().startsWith("s")) {
			r1 = humanPlayer.generateRoshambo(input);
			validInput = true;
		} 
	} while(!validInput);
	
	Roshambo r3 = humanPlayer.generateRoshambo(input);
	
	do {
		input = Validator.getString(scan, "Would you like to play against DaRoc or Rando?");
		if (input.equalsIgnoreCase("DaRoc")) {
			r2 = rockPlayer.generateRoshambo();
			validInput = false;
		} else if (input.equalsIgnoreCase("rando")) {
			r2 = randomPlayer.generateRoshambo();
			validInput = false;
		} else {
			System.out.println("Sorry! Try DaRoc or Rando");
			validInput = true;
		}
	} while (validInput);
	System.out.println(getWinner(r1, r2));
	
	System.out.println("Continue? (y/n)");
	input = scan.nextLine();
} while (input.equalsIgnoreCase("y"));


	System.out.println("Goodbye!");
	scan.close();
	
	}

	public static String getWinner(Roshambo r1, Roshambo r2) {

		if (r1.equals(Roshambo.ROCK) && r2.equals(Roshambo.SCISSORS)
				|| r1.equals(Roshambo.SCISSORS) && r2.equals(Roshambo.PAPER)
				|| r1.equals(Roshambo.PAPER) && r2.equals(Roshambo.ROCK)) {
			return "You Win!";

		} else if (r1.equals(r2)) {
			return ("It's a tie!");
		} else {
			return "You Lose.";
}
	
	
		}
	
	}