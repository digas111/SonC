package sonc.battle;

public class World extends java.lang.Object{
	
	private static int rounds;
	private int currentRound;
	private static double height;
	private static double width;
	private static double margin;
	private static double collisionDistance;
	
	void addMovingObject(MovingObject added) {
	
	}
	
	void addShipAt(Ship ship, double x, double y, double heading) {
		
	}
	
	void addShipAtRandom(Ship ship) {
		
		
	}
	
	public Movie battle(java.util.List<Ship> ships) {
		
		
	}

	public static double getCollisionDistance() {
		return collisionDistance;
	}
	
	public int getCurrentRound() {
		return currentRound;
	}
	
	public static double getHeight() {
		return height; 
	}
	
	public static double getMargin() {
		return margin;
	}
	
	java.util.Set<MovingObject> getMovingObjects(){
		
		
	}
	
	public static int getRounds() {
		return rounds;
	}
	
	public java.util.Set<Ship> getShips(){
		
	}
	
	public static double getWidth() {
		return width;
	}
	
	static void setCollisionDistance(double collisionDistance) {
		this.collisionDistance = collisionDistance;
	}
	
	//é private?
	void setCurrentRound(int currentRound) {
		this.currentRound = currentRound;	
	}
	
	static void setHeight(double height) {
		this.height = height;
	}
	
	static void setMargin(double margin) {
		this.margin = margin;
	}
	
	static void setRounds(int rounds) {
		this.rounds = rounds;		
	}
	
	static void setWidth(double width) {
		this.width = width;
	}
	
	void update() {
		
	}
}
