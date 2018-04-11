package sonc.shared;

public class Movie extends java.lang.Object{
	private java.util.List<Frame> frames;
	
	
	public void newFrame() {
		
	}
	
	public void addOblong(int x, int y, float heading, int size, java.lang.String color) {
		if (!IsNullOrEmpty(this.frames)) {
			
		}
		else throw
	}
	
	public void addScore(java.lang.String name, int points, int status){
		
	}
	
	public java.util.List<Frame> getFrames(){
		return this.frames;
	}
	
	/**
	 * Auxiliar method to nullpointer exception
	 * */
	public static boolean IsNullOrEmpty(java.util.List<Frame> listF) {
	    return listF == null || listF.isEmpty();
	}
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
