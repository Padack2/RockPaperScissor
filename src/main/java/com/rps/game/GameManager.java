package com.rps.game;

import com.rps.type.Result;
import com.rps.type.Rps;

public final class GameManager {
	public GameResult play(String inputStr) {
		int input = convertInput(inputStr);
		Rps playerInput = Rps.intToRps(input);
		Rps computerInput = getComputerInput();
		
		return calculateResult(playerInput, computerInput);
	}
	
	int convertInput(String str) {
		return Integer.parseInt(str);
	}
	
	Rps getComputerInput() {
		int input = getRandomInput();
		
		return Rps.intToRps(input);
	}
	
	int getRandomInput() {
		int random = (int)(Math.random() * 3) + 1;
		
		return random;
	}
	
	GameResult calculateResult(Rps p, Rps c) {
		Result result;
		
		if (p == c) {
			result = Result.DRAW;
		} else if (isWin(p, c)) {
			result = Result.WIN;
		} else {
			result = Result.LOSE;
		}
		
		return new GameResult(p, c, result);
	}
	
	boolean isWin(Rps p, Rps c) {
		return (p == Rps.SCISSOR && c == Rps.PAPER) ||
				(p == Rps.ROCK && c == Rps.SCISSOR) ||
				(p == Rps.PAPER && c == Rps.ROCK);
	}
}
