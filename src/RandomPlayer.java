
public class RandomPlayer extends Player{
	
public RandomPlayer() {}
	
public RandomPlayer(String name) {
		super(name);
		
	}

public Roshambo generateRoshambo() {
	
int random = (int) (Math.random()*3+1);

System.out.println(random);

if (random == 1) {
	return Roshambo.ROCK;
	
} else if(random == 2) { 
	
return Roshambo.SCISSORS;
}else {
	return Roshambo.PAPER;
}

	
		
	
	}

@Override
protected Roshambo generateRoshambo(String input) {
	// TODO Auto-generated method stub
	return null;
}
	


}
