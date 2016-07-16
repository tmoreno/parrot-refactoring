package parrot;

public class AfricanParrot extends Parrot {

	private int numberOfCoconuts;

	public AfricanParrot(int numberOfCoconuts) {
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(MIN_SPEED, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
	}
}
