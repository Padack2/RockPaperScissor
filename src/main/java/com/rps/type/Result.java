package com.rps.type;

public enum Result {
	WIN, LOSE, DRAW;
	
	public static String resultToString(Result result) {
		if (result == WIN) {
			return "이겼습니다.";
		} else if (result == LOSE) {
			return "졌습니다.";
		} else if (result == DRAW) {
			return "비겼습니다.";
		}
		
		throw new IllegalArgumentException("허용되지 않은 인수가 입력되었습니다.");
	}
}
