

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import virtualPet.UniKitty;

public class UniKittyTest {
	
	UniKitty underTest = new UniKitty("Unikitty", 5,5,5,5);


	@Test
	public void shouldReturnUnikittyAsName() {
		String check = underTest.getName();
		assertThat(check, is("Unikitty"));
	}

	@Test
	public void shouldReturnHungerLevelAs5() {
		int check = underTest.gethungerLevel();
		assertEquals(check, 5);
	}
	
	@Test
	public void shouldReturnBoredomLevelAs5() {
		int check = underTest.getBoredomLevel();
		assertEquals(check, 5);
	}
	@Test
	public void shouldReturnPositivityLevelAs5() {
		int check = underTest.getPositivityLevel();
		assertEquals(check, 5);
	}
	@Test
	public void shouldDecreaseHungerFrom5To1WithFeeding() {
		underTest.feed();
		int check = underTest.gethungerLevel();
		assertEquals(check, 1);
	}
	@Test
	public void shouldIncreaseHungerFrom5to6WithTick() {
		underTest.tick();
		int check = underTest.gethungerLevel();
		assertEquals(check, 6);
	}
//	@Test
//	public void shouldIncreaseBoredomFrom5To7WithTick() {
//		underTest.tick();
//		int check = underTest.getBoredomLevel();
//		assertEquals(check, 7);
//	}
	@Test
	public void shouldIncreasePositivityfrom5To7WithHungerLevelOf1() {
		underTest.feed();
		int check = underTest.getPositivityLevel();
		assertEquals(check, 7);
	}
//	@Test
//	public void shouldIncreasePositivityFrom5to6WithACompliment() {
//		underTest.compliment();
//		int check = underTest.getPositivityLevel();
//		assertEquals(check, 6);
//	}
	@Test
	public void shouldIncreasePositivityFrom5To7WithPrimping() {
		underTest.primping();
		int check = underTest.getPositivityLevel();
		assertEquals(check, 7);
	}
}
