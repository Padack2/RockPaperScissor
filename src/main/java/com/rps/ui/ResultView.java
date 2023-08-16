package com.rps.ui;

import com.rps.game.GameResult;
import com.rps.type.Result;
import com.rps.type.Rps;

public enum ResultView {
	INSTANCE;
	
	public void printResult(GameResult gameResult) {
		String computerInput = Rps.rpsToString(gameResult.getComputerInput());
		String result = Result.resultToString(gameResult.getResult());
		System.out.println("컴퓨터는 " + computerInput + "을 냈습니다!");
		System.out.println();
		System.out.println(result);
	}

}
