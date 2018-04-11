package sonc.quad;

public abstract class Trie<T extends HasPoint> extends java.lang.Object {
	
	static enum Quadrant{
		
		NW,
		NE,
		SE,
		SW;
		
	}

	protected double bottomRightX;
	protected double bottomRightY;
	protected double topLeftX;
	protected double topLeftY;
	
	static int capacity;
	
	protected Trie(double bottomRighX, double bottomRghtY, double topLeftX, double topLeftY) {
		super();
		this.bottomRightX = bottomRighX;
		this.bottomRightY = bottomRghtY;
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
	abstract Trie<T> insert(T point);
	abstract Trie<T> insertReplace(T point);
	abstract void collectNear(double x, double y, double radius, java.util.Set<T> points);
	abstract void collectAll(java.util.Set<T> points);
	abstract void delete(T point);
	
	boolean overlaps(double x, double y, double radius) {
		
		if(isInside(x,y)) {
			return true;
		}
		
		double bottomLeftX = topLeftX;
		double bottomLeftY = bottomRightY;
		double topRightX = bottomRightX;
		double topRightY = topLeftY;
		
		if(getDistance(x,y,bottomLeftX,bottomLeftY) <= radius) {
			return true;
		}
		
		else if (getDistance(x, y, bottomRightX, bottomRightY) <= radius) {
			return true;
		}
		
		else if (getDistance(x, y, topRightX, topRightY) <= radius) {
			return true;
		}
		
		else if (getDistance(x, y, topLeftX, topLeftY) <= radius) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString() {
		return "Trie [bottomRightX=" + bottomRightX + ", bottomRightY=" + bottomRightY + ", topLeftX=" + topLeftX
				+ ", topLeftY=" + topLeftY + "]";
	}
	
	
	public static double getDistance(double x1, double y1, double x2, double y2) {	
		
		double distanceX = Math.abs(x1 - x2);
		double distanceY = Math.abs(y1 - y2);
		
		if(distanceX==0) {
			return distanceY;
		}
		
		if(distanceY==0) {
			return distanceX;
		}
		
		return Math.sqrt(distanceX*distanceX + distanceY*distanceY);
		
	}


	boolean isInside(double x, double y) {
		
		if(x <  topLeftX || x > bottomRightX) {
			return false;
		}
		
		else if (y < bottomRightY || y > topLeftY) {
			return false;
		}
		
		return true;
		
	}
	

	
	
	


	
	
	

}
