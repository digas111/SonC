package sonc.battle;

public abstract class MovingObject extends java.lang.Object{

	private int status;
	private double heading;
	private double speed;
	
	private double maxSpeedChange;
	private double maxSpeed;
	private double maxRotation;
	private double x;
	private double y;
	
	private int impactDamage;
	private int size;
	
	
	public MovingObject(int status, double heading, double speed) {
		super();
		this.status = status;
		this.heading = heading;
		this.speed = speed;
	}
	
	
	public double getHeading() {
		return heading;
	}

	public void setHeading(double heading) {
		this.heading = heading;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getStatus() {
		return status;
	}

	public double getSpeed() {
		return speed;
	}

	public double getMaxSpeedChange() {
		return maxSpeedChange;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public double getMaxRotation() {
		return maxRotation;
	}

	public int getImpactDamage() {
		return impactDamage;
	}

	public int getSize() {
		return size;
	}
	
	/**
	 * 
	 * @param angle
	 * @return
	 */
	
	protected double normalizeAngle(double angle) {
		
		//We need to check if this is working
		
		short sinal=1;
		
		if(angle > Math.PI) {
			sinal*=-1;
		}
		
		while(angle > Math.PI || angle < 0) {
			angle+=(Math.PI*sinal);
		}
		
		return angle;
	}
	
	/**
	 * 
	 * @param other
	 * @return
	 */
	
	protected double distanceTo(MovingObject other ) {
		
		double distanceX = Math.abs(this.x - other.getX());
		double distanceY = Math.abs(this.y - other.getY());
		
		double directDistance = Math.sqrt(distanceX*distanceX + distanceY*distanceY);
		
		return directDistance;
	}
	
	protected double headingTo(MovingObject other) {
		
		
		
	}
	
	
	
	
	/**
	 * 
	 * 
	 * 
	 */
	
	final void doChangeSpeed(double delta) {
		if(Math.abs(delta)>getMaxSpeedChange) {
			speed += delta;
			return;
		}
		if(Math.abs(speed)>getMaxSpeed()) {
			if(speed>0) {
				speed = getMaxSpeed;
				return;
			}
			else {
				speed = -1*getMaxSpeed;
			}
		}
	}
	
	final void doRotate(double delta) {
		//check for the max rotation value
		
		heading += delta;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
