package com.rps.ui;

import java.util.Scanner;

public enum InputView {
	INSTANCE;
	
	private Scanner sc = new Scanner(System.in);
	
	public String getInput() {
		String result = "";
		
		System.out.println("가위보위보 게임(숫자를 입력해주세요)");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		result = sc.nextLine();
		
		return result;
	}
}
