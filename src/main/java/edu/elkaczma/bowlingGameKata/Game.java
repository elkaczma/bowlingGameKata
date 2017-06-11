package edu.elkaczma.bowlingGameKata;

public class Game {

	private int score = 0;
	private int[] rolls = new int[21];
	private int currentRoll = 0;
	
	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		for (int rollIndex = 0; rollIndex < currentRoll; rollIndex++) {
			if (rolls[rollIndex] + rolls[rollIndex+1] == 10) {
				score += 10 + rolls[rollIndex+2];
				rollIndex++;
			} else {
				score += rolls[rollIndex];
			}
		}
		
		return score;
	}

}
