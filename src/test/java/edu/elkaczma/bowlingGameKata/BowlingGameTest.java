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
	public void rollingOneShouldScoreOne() {
		Game game = new Game();
		game.roll(1);
		assertThat(game.score(), is(1));
	}
	
	@Test
	public void rollingOneThenTwoShouldScoreThree() {
		Game game = new Game();
		game.roll(1);
		game.roll(2);
		assertThat(game.score(), is(3));
	}
	
	@Test 
	public void rollingSpareThenTwoShouldScoreFourteen() {
		Game game = new Game();
		game.rollSpare();
		game.roll(2);
		assertThat(game.score(), is(14));
	}
	
	@Test
	public void rollingOneThenTwoThenSpareThenTwoShouldScoreSeventeen() {
		Game game = new Game();
		game.roll(1);
		game.roll(2);
		game.rollSpare();
		game.roll(2);
		assertThat(game.score(), is(17));
	}
	
	@Test
	public void rollingStrikeThenThreeThenSixShouldScoreTwentyEight() {
		Game game = new Game();
		game.rollStrike();		
		game.roll(3);
		game.roll(6);
		assertThat(game.score(), is(28));
	}
	
	@Test
	public void rollingStrikesOnlyShouldScoreThreeHundred() {
		Game game = new Game();
		for (int i = 0; i < 10; i++) {
			game.rollStrike();
		}
		for (int i = 0; i < 2; i++) {
			game.rollStrike();
		}
		assertThat(game.score(), is(300));
	}

}
