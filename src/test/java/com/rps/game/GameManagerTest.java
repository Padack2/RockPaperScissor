package com.rps.game;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.rps.type.Result;
import com.rps.type.Rps;

public class GameManagerTest {
	
	GameManager gm = new GameManager();
	
	@RepeatedTest(30)
	@DisplayName("난수 생성 반복 테스트 30회")
	void randomTest() {
		int random = gm.getRandomInput();
		
		assertThat(random).isBetween(1, 3);
	}
	
	//1: 가위
	//2: 바위
	//3: 보
	@ParameterizedTest
	@CsvSource({
		"1, 3",
		"2, 1",
		"3, 2"
	})
	@DisplayName("플레이어 승리 테스트")
	void calculatedResultPlayerWin(int p, int c) {
		Rps player = Rps.intToRps(p);
		Rps computer = Rps.intToRps(c);
		
		GameResult gameResult = gm.calculateResult(player, computer);
		
		Result result = gameResult.getResult();
		
		assertThat(result).isEqualTo(Result.WIN);
	}
	
	@ParameterizedTest
	@CsvSource({
		"1, 1",
		"2, 2",
		"3, 3"
	})
	@DisplayName("플레이어 무승부 테스트")
	void calculatedResultPlayerDraw(int p, int c) {
		Rps player = Rps.intToRps(p);
		Rps computer = Rps.intToRps(c);
		
		GameResult gameResult = gm.calculateResult(player, computer);
		
		Result result = gameResult.getResult();
		
		assertThat(result).isEqualTo(Result.DRAW);
	}
	
	@ParameterizedTest
	@CsvSource({
		"3, 1",
		"1, 2",
		"2, 3"
	})
	@DisplayName("플레이어 패배 테스트")
	void calculatedResultPlayerLose(int p, int c) {
		Rps player = Rps.intToRps(p);
		Rps computer = Rps.intToRps(c);
		
		GameResult gameResult = gm.calculateResult(player, computer);
		
		Result result = gameResult.getResult();
		
		assertThat(result).isEqualTo(Result.LOSE);
	}
	
}
