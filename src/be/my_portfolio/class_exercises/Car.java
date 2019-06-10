package be.my_portfolio.class_exercises;

public class Car {
	// The color of the car
	private String color = "white";
	// The speed of the car
	private double speed = 0;
	// The hp of the car
	private int hp = 90;
	// Flag to check if the lights are on or not
	private boolean lightsOn = false;
	// Count to hold how many cars are build
	private static int count = 0;
	
	{
		/*
		 * Every time a new instance is created of this class,
		 * the count will increment with 1
		 */
		count++;
	}

	/**
	 * Constructor
	 */
	public Car() {
		this("White", 0, 90, false);
	}

	/**
	 * Constructor
	 * 
	 * @param lightsOn
	 */
	public Car(boolean lightsOn) {
		this("White", 0, 90, lightsOn);
	}

	/**
	 * Constructor
	 * 
	 * @param hp
	 */
	public Car(int hp) {
		this("White", 0, hp, false);
	}

	/**
	 * Constructor
	 * 
	 * @param speed
	 */
	public Car(double speed) {
		this("White", speed, 90, false);
	}

	/**
	 * Constructor
	 * 
	 * @param color
	 */
	public Car(String color) {
		this(color, 0, 90, false);
	}

	/**
	 * Constructor
	 * 
	 * @param lightsOn
	 * @param hp
	 */
	public Car(boolean lightsOn, int hp) {
		this("White", 0, hp, lightsOn);
	}

	/**
	 * Constructor
	 * 
	 * @param speed
	 * @param lightsOn
	 */
	public Car(double speed, boolean lightsOn) {
		this("White", speed, 90, lightsOn);
	}

	/**
	 * Constructor
	 * 
	 * @param color
	 * @param lightsOn
	 */
	public Car(String color, boolean lightsOn) {
		this(color, 0, 90, lightsOn);
	}

	/**
	 * Constructor
	 * 
	 * @param speed
	 * @param hp
	 */
	public Car(double speed, int hp) {
		this("White", speed, hp, false);
	}

	/**
	 * Constructor
	 * 
	 * @param color
	 * @param hp
	 */
	public Car(String color, int hp) {
		this(color, 0, hp, false);
	}

	/**
	 * Constructor
	 * 
	 * @param color
	 * @param speed
	 */
	public Car(String color, double speed) {
		this(color, speed, 90, false);
	}

	/**
	 * Constructor
	 * 
	 * @param speed
	 * @param hp
	 * @param lightsOn
	 */
	public Car(double speed, int hp, boolean lightsOn) {
		this("White", speed, hp, lightsOn);
	}

	/**
	 * Constructor
	 * 
	 * @param color
	 * @param hp
	 * @param lightsOn
	 */
	public Car(String color, int hp, boolean lightsOn) {
		this(color, 0, hp, lightsOn);
	}

	/**
	 * Constructor
	 * 
	 * @param color
	 * @param speed
	 * @param lightsOn
	 */
	public Car(String color, double speed, boolean lightsOn) {
		this(color, speed, 90, lightsOn);
	}

	/**
	 * Constructor
	 * 
	 * @param color
	 * @param speed
	 * @param hp
	 */
	public Car(String color, double speed, int hp) {
		this(color, speed, hp, false);
	}

	/**
	 * Constructor
	 * 
	 * @param color
	 * @param speed
	 * @param hp
	 * @param lightsOn
	 */
	public Car(String color, double speed, int hp, boolean lightsOn) {
		this.color = color;
		this.setSpeed(speed);
		this.setHp(hp);
		this.setLightsOn(lightsOn);
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the hp
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * @param hp the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
	}

	/**
	 * @return the lightsOn
	 */
	public boolean isLightsOn() {
		return lightsOn;
	}

	/**
	 * @param lightsOn the lightsOn to set
	 */
	public void setLightsOn(boolean lightsOn) {
		this.lightsOn = lightsOn;
	}

	/**
	 * @return the count
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * Toggle the lights on or of
	 */
	public void toggleLights() {
		this.lightsOn = !this.lightsOn;
	}

	/**
	 * Park function of the car
	 */
	public void park() {
		this.setSpeed(0);
		this.setLightsOn(false);
	}

	/**
	 * Accelerate the car
	 * 
	 * @param speed
	 */
	public void accelerate(double speed) {
		this.speed += speed;
	}

	/**
	 * Accelerate the car
	 * 
	 * @param speed
	 * @param boost
	 */
	public void accelerate(double speed, int boost) {
		this.speed += (speed * boost);
	}

	/**
	 * Slow the car down
	 * 
	 * @param speed
	 */
	public void slowDown(double speed) {
		if (this.speed - speed < 0) {
			this.speed = 0;
		} else {
			this.speed -= speed;
		}
	}

	@Override
	public String toString() {
		return "Car [color = " + color + ", speed = " + speed + ", hp = " + hp + ", lightsOn = " + lightsOn + "]";
	}
	
	/**
	 * @param color the color to set
	 */
	public void rePaint(String color) {
		this.color = color;
		char[] chars = this.color.toCharArray();
		int cost = 0;
		for (char c: chars) {
			cost += c;
		}
		
		System.out.println("The respray costs: " + cost);
	}
}
