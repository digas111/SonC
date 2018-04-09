package sonc.battle;

public class FireCommand {
	private World world;
	private Ship ship;
	private Munition munition;
	
	FireCommand(World world, Ship ship, Munition munition){
	super();
	this.world = world;
	this.ship = ship;
	this.munition = munition;
	}
	
	public void execute() {
		
	}
	
}