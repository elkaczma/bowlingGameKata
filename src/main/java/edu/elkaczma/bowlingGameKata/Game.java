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
		for (int frame = 0; frame < 10; frame++, rollIndex +=2) {
			if (isStrike(rollIndex)) {
				addPoints(rollIndex);
				rollIndex = addStrikeBonus(rollIndex);
			}
			else if (isSpare(rollIndex)) {
				addPoints(rollIndex);
				addSpareBonus(rollIndex);
			} else {
				addPoints(rollIndex);
			}
		}
		
		return score;
	}

	private void addPoints(int rollIndex) {
		score += rolls[rollIndex] + rolls[rollIndex+1];
	}
	
	private int addStrikeBonus(int rollIndex) {
		score += rolls[rollIndex+2];
		return --rollIndex;
	}
	
	private void addSpareBonus(int rollIndex) {
		score += rolls[rollIndex+2];
	}

	private boolean isSpare(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex+1] == 10;
	}

	private boolean isStrike(int rollIndex) {
		return rolls[rollIndex] == 10;
	}

	public void rollSpare() {
		rolls[currentRoll++] = 5;
		rolls[currentRoll++] = 5;
	}
	
	public void rollStrike() {
		rolls[currentRoll++] = 10;
	}

}
