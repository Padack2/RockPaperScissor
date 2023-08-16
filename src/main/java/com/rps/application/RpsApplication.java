package com.rps.application;

import com.rps.game.GameManager;
import com.rps.game.GameResult;
import com.rps.ui.InputView;
import com.rps.ui.ResultView;

public class RpsApplication {
	public static void main(String[] args) {
		InputView inputView = InputView.INSTANCE;
		
		String input = inputView.getInput();
		
		GameManager gm = new GameManager();
		GameResult result = gm.play(input);
		
		ResultView resultView = ResultView.INSTANCE;
		
		resultView.printResult(result);
	}
}
