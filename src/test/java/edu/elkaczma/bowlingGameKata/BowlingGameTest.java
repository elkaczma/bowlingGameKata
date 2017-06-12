package edu.elkaczma.bowlingGameKata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class BowlingGameTest {

	@Test
	public void itCompiles() {
		assertThat(true, equalTo(true));
	}
	
	@Test
	public void rollingOneScoresOne() {
		Game game = new Game();
		game.roll(1);
		assertThat(game.score(), is(1));
	}

}
