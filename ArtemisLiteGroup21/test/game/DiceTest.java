package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiceTest {
	
	//test data
	int validRollLower;
	int validRollUpper;
	Dice dice;
	

	@BeforeEach
	void setUp() throws Exception {
		dice = new Dice();
		validRollLower = 2;
		validRollUpper = 12;
	}

	@Test
	void testDice() {
		Dice dice = new Dice();
		assertNotNull(dice);
	}

	@Test
	void testRollDice() {
		int rolledValue = dice.rollDice();
		assertTrue(validRollLower <= rolledValue && rolledValue <= validRollUpper);
	}

}
