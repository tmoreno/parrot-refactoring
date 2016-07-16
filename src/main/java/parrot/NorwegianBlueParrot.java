package parrot;

public class NorwegianBlueParrot extends Parrot {

	private double voltage;
	private boolean isNailed;

	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	@Override
	public double getSpeed() {
		if (isNailed) {
			return MIN_SPEED;
		}
		else {
			return Math.min(MAX_SPEED, voltage * BASE_SPEED);
		}
	}
}
