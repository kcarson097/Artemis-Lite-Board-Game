package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareTest {
	
	Square square;
	SquareType squareType;

	@BeforeEach
	void setUp() throws Exception {
		
		squareType = SquareType.SYSTEM;
		square = new Square() {
		};
	}

	@Test
	void testGetSetSquareType() {
		square.setSquareType(squareType);
		assertEquals(SquareType.SYSTEM, square.getSquareType());
	}

}
