package edu.elkaczma.bowlingGameKata;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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

	@Test
	public void rollingOneThenTwoScoresThree() {
		Game game = new Game();
		game.roll(1);
		game.roll(2);
		assertThat(game.score(), is(3));
	}
	
	@Test
	public void rollingSpareThenTwoScoresFourteen() {
		Game game = new Game();
		game.rollSpare();
		game.roll(2);
		assertThat(game.score(), is(14));
	}
	
	@Test
	public void rollingOneThenTwoThenSpareThenTwoScoresSeventeen() {
		Game game = new Game();
		game.roll(1);
		game.roll(2);
		game.rollSpare();
		game.roll(2);
		assertThat(game.score(), is(17));
	}
	
	@Test
	public void rollingStrikeThenThreeThenSixScoresTwentyEight() {
		Game game = new Game();
		game.rollStrike();
		game.roll(3);
		game.roll(6);
		assertThat(game.score(), is(28));
	}
	
	@Test
	public void rollingStrikesOnlyScoresThreeHundred() {
		Game game = new Game();
		for (int i = 0; i < 10; i++) {
			game.rollStrike();
		}
		for (int additionalRoll = 0; additionalRoll < 2; additionalRoll++) {
			game.rollStrike();
		}
		assertThat(game.score(), is(300));
	}
}
