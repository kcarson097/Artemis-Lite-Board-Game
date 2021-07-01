package game;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CompareByTotalValueTest {
	
	//test data
	Player player1;
	Player player2;
	List<Player> players;

	@BeforeEach
	void setUp() throws Exception {
		players = new ArrayList<Player>();
		
		player1 = new Player();
		player1.setAmountOfResources(1000);
		player1.setAmountSpentOnDevelopments(1000);
		
		player2 = new Player();
		player2.setAmountOfResources(2000);
		player2.setAmountSpentOnDevelopments(1000);
		
		players.add(player1);
		players.add(player2);
	}

	@Test
	void testCompare() {
		Player leaaderPlayer = players.get(1);
		java.util.Collections.sort(players,new CompareByTotalValue());
		assertEquals(leaaderPlayer, players.get(0));
		
	}

}
