package sonc.quad;

public abstract class Trie<T extends HasPoint> extends java.lang.Object {
	
	static enum Quadrant{
		
		NW,
		NE,
		SE,
		SW;	
		
	}

	protected double bottomRighX;
	protected double bottomRghtY;
	protected double topLeftX;
	protected double topLeftY;
	
	static int capacity;
	
	protected Trie(double bottomRighX, double bottomRghtY, double topLeftX, double topLeftY) {
		super();
		this.bottomRighX = bottomRighX;
		this.bottomRghtY = bottomRghtY;
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
	}
	
	
	public static int getCapacity() {
		return capacity;
	}
	
	
	//o que se passa aqui??
	public static void setCapacity(int c) {
		capacity = c;
	}
	
	abstract T find(T point);
	


	
	
	

}
