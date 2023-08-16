package com.rps.application;

import com.rps.game.GameManager;
import com.rps.game.GameResult;
import com.rps.ui.InputView;
import com.rps.ui.ResultView;

public class RpsApplication {
	public static void main(String[] args) {
		InputView inputView = InputView.INSTANCE;
		ResultView resultView = ResultView.INSTANCE;
		GameManager gm = new GameManager();
		
		String input = inputView.getInput();
		
		GameResult result = gm.play(input);
		
		resultView.printResult(result);
	}
}
