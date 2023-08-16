package com.rps.type;

public enum Rps {
	ROCK, PAPER, SCISSOR;
	
	public static Rps intToRps(int number) {
		if (number == 1) {
			return SCISSOR;
		} else if (number == 2) {
			return ROCK;
		} else if (number == 3) {
			return PAPER;
		}
		
		throw new IllegalArgumentException("허용되지 않은 인수가 입력되었습니다.");
	}
	
	public static String rpsToString(Rps rps) {
		if (rps == SCISSOR) {
			return "가위";
		} else if (rps == ROCK) {
			return "바위";
		} else if (rps == PAPER) {
			return "보";
		}
		
		throw new IllegalArgumentException("허용되지 않은 인수가 입력되었습니다.");
	}
}
