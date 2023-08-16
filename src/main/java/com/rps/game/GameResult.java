package com.rps.game;

import com.rps.type.Result;
import com.rps.type.Rps;

public final class GameResult {
	
	public GameResult(Rps playerInput, Rps computerInput, Result result) {
		this.playerInput = playerInput;
		this.computerInput = computerInput;
		this.result = result;
	}
	
	private Rps playerInput;
	private Rps computerInput;
	private Result result;
	
	public Rps getPlayerInput() {
		return playerInput;
	}
	
	public Rps getComputerInput() {
		return computerInput;
	}
	
	public Result getResult() {
		return result;
	}
}
