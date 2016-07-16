package parrot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParrotTest {

	@Test
	public void getSpeedOfEuropeanParrot() {
		Parrot parrot = new EuropeanParrot(ParrotTypeEnum.EUROPEAN, 0, 0, false);
		assertEquals(parrot.getSpeed(), 12.0, 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_One_Coconut() {
		Parrot parrot = new AfricanParrot(ParrotTypeEnum.AFRICAN, 1, 0, false);
		assertEquals(parrot.getSpeed(), 3.0, 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
		Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 2, 0, false);
		assertEquals(parrot.getSpeed(), 0.0, 0.0);
	}

	@Test
	public void getSpeedOfAfricanParrot_With_No_Coconuts() {
		Parrot parrot = new Parrot(ParrotTypeEnum.AFRICAN, 0, 0, false);
		assertEquals(parrot.getSpeed(), 12.0, 0.0);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_nailed() {
		Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 0, true);
		assertEquals(parrot.getSpeed(), 0.0, 0.0);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_not_nailed() {
		Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 1.5, false);
		assertEquals(parrot.getSpeed(), 18.0, 0.0);
	}

	@Test
	public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
		Parrot parrot = new Parrot(ParrotTypeEnum.NORWEGIAN_BLUE, 0, 4, false);
		assertEquals(parrot.getSpeed(), 24.0, 0.0);
	}
}
