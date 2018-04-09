package sonc.battle;

public class GuidedMissible extends Munition{ 
	
	private double heading;
	private MovingObject target;
	private static int damage;
	private static double maxMissileRotation;
	private double speed;
	private int fireDelay;
	
	GuidedMissile(double heading, MovingObject target){
		super();
		this.heading = heading;
		this.target = target;
	}
	
	public static int getDamage() {
		return damage;
	}
	
	public static void setDamage(int damage) {
		this.damage = damage;
	}
	
	static double getMaxMissileRotation() {
		return maxMissileRotation;
	}

	public static void setInitialSpeed(double speed) {
		this.speed = speed;
	}
	
	public static double getInitialSpeed() {
		return speed;
	}
	
	static void setMaxMissileRotation(double maxMissileRotation) {
		this.maxMissileRotation = maxMissileRotation;
	}
		
	static int getFireDelay() {
		return fireDelay;
	}
	
	static void setFireDelay(int fireDelay) {
		this.fireDelay = fireDelay;
	}

	
}
