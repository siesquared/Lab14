//parent
public abstract class Player {

	protected static String name;
	
	public Player() {
		
	}
	
	public Player(String name) {
	this.name=name;
	}
	
	public abstract Roshambo generateRoshambo();

	public void setName(String name) {
		
		
	}

	protected abstract Roshambo generateRoshambo(String input);
	

	
}
	

