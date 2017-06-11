package edu.elkaczma.bowlingGameKata;

public class Game {

	int score = 0;
	
	public void roll(int i) {
		score += 1;
	}

	public int score() {
		return score;
	}

}
