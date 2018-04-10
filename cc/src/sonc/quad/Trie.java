package sonc.quad;

public abstract class Trie<T extends HasPoint> extends java.lang.Object {

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
	
	

	
	
	

}
