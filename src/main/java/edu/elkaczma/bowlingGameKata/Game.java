package edu.elkaczma.bowlingGameKata;

public class Game {

	private int score = 0;
	private int[] rolls = new int[21];
	private int currentRoll = 0;
	
	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}
	
	public int score() {
		int rollIndex = 0;
		for (int frame = 0; frame < 10; frame++, rollIndex += 2) {
			if (isSpare(rollIndex)) {
				score += rolls[rollIndex] + rolls[rollIndex+1] + rolls[rollIndex+2];
			} else {
				score += rolls[rollIndex] + rolls[rollIndex+1];
			}
		}
		
		return score;
	}

	private boolean isSpare(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex+1] == 10;
	}

	public void rollSpare() {
		rolls[currentRoll++] = 4;
		rolls[currentRoll++] = 6;		
	}

}
