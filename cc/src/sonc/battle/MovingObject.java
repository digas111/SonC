package sonc.battle;

public abstract class MovingObject extends java.lang.Object implements HasPoint{

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
	
	java.lang.String color;
	ship origin;
	
	public MovingObject(int status, double heading, double speed) {
		super();
		this.status = status;
		this.heading = heading;
		this.speed = speed;
	}
	
	
	public double getHeading() {
		return heading;
	}

	void setHeading(double heading) {
		this.heading = heading;
	}

	public double getX() {
		return x;
	}

	void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	void setY(double y) {
		this.y = y;
	}

	public int getStatus() {
		return status;
	}

	public double getSpeed() {
		return speed;
	}

	abstract double getMaxSpeedChange() {
		return maxSpeedChange;
	}

	abstract double getMaxSpeed() {
		return maxSpeed;
	}

	abstract double getMaxRotation() {
		return maxRotation;
	}

	abstract int getImpactDamage() {
		return impactDamage;
	}

	public abstract int getSize() {
		return size;
	}
	
	abstract ship getOrigin() {
		
	}
	
	public abstract java.lang.String getColor() {
		return color;
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
		
		//not 100% sure about this one
		
		double distanceX = Math.abs(this.x - other.getX());
		double distanceY = Math.abs(this.y - other.getY());
		
		double positionAngle = Math.atan(distanceX/distanceY);
		
		double defAngle = heading + positionAngle;
		
		return normalizeAngle(defAngle);
		
	}
	
	final void updatePosition() {
		
		double speed = getSpeed();
		double x = getX();
		double y = getY();
		double heading = getHeading();
		
		double addX;
		double addY;
		
		//improve the following code 
		
		if(heading < Math.PI/2 && heading <0) {
			
			addX = speed*Math.acos(heading);
			addY = speed*Math.asin(heading);
			
		}
		
		else if (heading < Math.PI && heading > Math.PI/2) {
			
			addX = -1*speed*Math.acos(heading);
			addY = speed*Math.asin(heading);
			
		}
		
		else if (heading < 3*Math.PI/2 && heading > Math.PI) {
			
			addX = -1*speed*Math.acos(heading);
			addY = -1*speed*Math.asin(heading);
			
		}
		
		else if (heading > 3*Math.PI/2 && heading < 2*Math.PI) {
			
			addX = speed*Math.acos(heading);
			addY = -1*speed*Math.asin(heading);
			
		}
		
		setX(x + addX);
		setY(y + addY);		
		
	}
	
	final void doRotate(double delta) {
		//check for the max rotation value
		
		if(Math.abs(delta) < maxRotation) {
			heading += delta;
		}
		else if(delta<0){
			heading -= delta;
		}
		
		heading += delta;
		
	}
	
	
	/**
	 * 
	 * 
	 * 
	 */
	
	final void doChangeSpeed(double delta) {
		if(Math.abs(delta)>getMaxSpeedChange()) {
			speed += delta;
			return;
		}
		if(Math.abs(speed)>getMaxSpeed()) {
			if(speed>0) {
				speed = getMaxSpeed();
				return;
			}
			else {
				speed = -1*getMaxSpeed();
			}
		}
	}
	
	void move() {
		
	}
	
	
	void hitdBy(MovingObject moving) {
		this.status -= moving.impactDamage;
	}
	
	public boolean isDestroyed() {
		if(status <= 0) {
			return true;
		}
		
		return false;
	}
	
}
