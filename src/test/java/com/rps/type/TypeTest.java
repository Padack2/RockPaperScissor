package com.rps.type;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TypeTest {
	
	@Test
	@DisplayName("가위바위보 int to RpsType 테스트 - SCISSOR")
	public void rpsGetTypeTest1() {
		Rps rps = Rps.intToRps(1);
		
		assertThat(rps).isEqualTo(Rps.SCISSOR);
	}
	
	@Test
	@DisplayName("가위바위보 int to RpsType 테스트 - PAPER")
	public void rpsGetTypeTest2() {
		Rps rps = Rps.intToRps(3);
		
		assertThat(rps).isEqualTo(Rps.PAPER);
	}
	
	@Test
	@DisplayName("가위바위보 int to RpsType 테스트 - ERROR")
	public void rpsGetTypeTest() {
		assertThatIllegalArgumentException().isThrownBy(
				() -> {
					Rps rps = Rps.intToRps(0);
				});
	}
	
	@Test
	@DisplayName("가위바위보 rps to String 테스트 - SCISSOR")
	public void rpsToStringTest1() {
		String result = Rps.rpsToString(Rps.SCISSOR);
		
		assertThat(result).isEqualTo("가위");
	}
	
	@Test
	@DisplayName("가위바위보 rps to String 테스트 - PAPER")
	public void rpsToStringTest2() {
		String result = Rps.rpsToString(Rps.PAPER);
		
		assertThat(result).isEqualTo("보");
	}
	
	@Test
	@DisplayName("가위바위보 result to String 테스트 - WIN")
	public void resultToStringTest1() {
		String result = Result.resultToString(Result.WIN);
		
		assertThat(result).isEqualTo("이겼습니다.");
	}
	
	@Test
	@DisplayName("가위바위보 result to String 테스트 - DRAW")
	public void resultToStringTest2() {
		String result = Result.resultToString(Result.DRAW);
		
		assertThat(result).isEqualTo("비겼습니다.");
	}
	
	@Test
	@DisplayName("가위바위보 result to String 테스트 - LOSE")
	public void resultToStringTest3() {
		String result = Result.resultToString(Result.LOSE);
		
		assertThat(result).isEqualTo("졌습니다.");
	}

	
}
