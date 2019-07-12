
public class HumanPlayer extends Player{
	
public HumanPlayer(){

}
	
	
public HumanPlayer(String name) {
		super(name);
	}

public Roshambo generateRoshambo(String input) {
		
	if(input.equalsIgnoreCase("rock")) {
		return Roshambo.ROCK;
		
	}else if (input.equalsIgnoreCase("rock")) {
		return Roshambo.SCISSORS;
	}else {
		
	}return Roshambo.PAPER;
		
	}
	
	

	
	@Override
	public Roshambo generateRoshambo() {
		
		return null;
	}
	}
	