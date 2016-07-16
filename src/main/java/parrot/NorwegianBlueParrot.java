package parrot;

public class NorwegianBlueParrot extends Parrot {

	private double voltage;

	public NorwegianBlueParrot(double voltage) {
		this.voltage = voltage;
	}

	@Override
	public double getSpeed() {
		return Math.min(MAX_SPEED, voltage * BASE_SPEED);
	}
}
