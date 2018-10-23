package Tasks;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FlashingTest {

	@Test
	public void testCreate() {
		FirstFlashing flash = new FirstFlashing(new SimpleBatary());
		assertTrue(flash.isLight());
	}

	@Test
	public void testOn() {
		FirstFlashing flash = new FirstFlashing(new SimpleBatary());
		flash.on();
		assertTrue(flash.isLight());
	}

	@Test
	public void testOff() {
		FirstFlashing flash = new FirstFlashing(new SimpleBatary());
		flash.on();
		flash.off();
		assertTrue(flash.isLight());
	}

	@Test
	public void testSwitch() {
		FirstFlashing flash = new FirstFlashing(new DuracelBatary());
		for (int i = 0; i < 50; i++) {
			flash.on();
			flash.off();
		}
		flash.on();
		assertTrue(flash.isLight());
	}

}
