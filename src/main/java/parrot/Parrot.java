package parrot;

public abstract class Parrot {

	protected static final double BASE_SPEED = 12.0;
	protected static final double LOAD_FACTOR = 9.0;

	public abstract double getSpeed();

	protected double getBaseSpeed(double voltage) {
		return Math.min(24.0, voltage * BASE_SPEED);
	}
}
