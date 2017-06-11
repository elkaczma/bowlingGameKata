package edu.elkaczma.bowlingGameKata;

public class Game {

	private int score = 0;
	private int[] rolls = new int[21];
	private int currentRoll = 0;
	private boolean isSpare = false;
	private boolean isStrike = false;
	
	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}

	public int score() {
		for (int rollIndex = 0; rollIndex < currentRoll; rollIndex++) {
			if (isStrike) {
				score += rolls[rollIndex] + rolls[rollIndex+1] + rolls[rollIndex+2];
				isStrike = false;
			}
			else if (isSpare) {
				score += rolls[rollIndex] + rolls[rollIndex+1];
				isSpare = false;
			} else {
				score += rolls[rollIndex];
			}
		}
		
		return score;
	}

	public void rollSpare() {
		rolls[currentRoll++] = 10;
		isSpare = true;
	}
	
	public void rollStrike() {
		rolls[currentRoll++] = 10;
		isStrike = true;
	}

}
