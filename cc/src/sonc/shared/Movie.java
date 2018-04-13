package sonc.shared;

public class Movie extends java.lang.Object{
	private java.util.List<Frame> frames;
	private Frame currentFrame;
	
	public void newFrame() {
		this.currentFrame = new Frame();
		frames.add(currentFrame);
	}
	
	public void addOblong(int x, int y, float heading, int size, java.lang.String color) {
		if (frames.isEmpty()) {
			throw new java.lang.IllegalStateException();
		}
		currentFrame.getOblongs().add(new Oblong(x, y, heading, size, color));
	}
	
	public void addScore(java.lang.String name, int points, int status){
		if(frames.isEmpty()) {
			throw new java.lang.IllegalStateException();
		}
		currentFrame.getScores().add(new Score(name, points, status));
	}
	
	public java.util.List<Frame> getFrames(){
		return frames;
	}
	
	/**
	 * Auxiliar method to nullpointer exception
	 * */
	//Frame class
	public static class Frame extends java.lang.Object{
		private java.util.List<Oblong> oblongs;
		private java.util.List<Score> scores;
		
		public Frame() {}
		
		public java.util.List<Oblong> getOblongs(){
			return this.oblongs;
		}
		
		public java.util.List<Score> getScores(){
			return this.scores;
		}
	
	}
	//Oblong class
	public static class Oblong extends java.lang.Object{
		int x;
		int y;
		float heading;
		int size;
		java.lang.String color;
		
		
		public Oblong(int x, int y, float heading, int size, java.lang.String color) {
			this.x = x;
			this.y = y;
			this.heading = heading;
			this.size = size;
			this.color = color; 
			
		}
		
		public int getX() {
			return this.x;
		}
		
		public int getY() {
			return this.y;
		}
		
		public float getHeading() {
			return this.heading;
		}
		
		public int getSize() {
			return this.size;
		}
		
		public java.lang.String getColor(){
			return this.color;
		}
	}	
	//Score class
	public static class Score extends java.lang.Object{
		private java.lang.String name;
		private int points;
		private int status;
		
		public Score(java.lang.String name, int points, int status) {
			this.name = name;
			this.points = points;
			this.status = status;			
		}
		
		public java.lang.String getName(){
			return this.name;
		}
		
		public int getPoints() {
			return this.points;
		}
		
		public int getStatus() {
			return this.status;
		}
	}
	
}	
