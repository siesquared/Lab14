
public class RockPlayer extends Player {

	public RockPlayer(String string) {
	super(name);
		
	}
	
	

	@Override
	public Roshambo generateRoshambo() {
		
		return Roshambo.ROCK;
	}



	@Override
	protected Roshambo generateRoshambo(String input) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
