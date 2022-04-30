package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {

		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		
		//입력값 String으로 계산을 위해 int 타입으로 변경해 sum 진행
		//입력받은 String 숫자를 공백으로 잘라서 배열 
		
		String numLine = sc.nextLine();   // 입력 값 스트링 

		// 코드를 작성하세요
		String[] sArray = numLine.split(" ");
		int[] nArray = new int[sArray.length];  //같은 길이만큼 int타입 어레이 만들기
		

		for (int i = 0; i < nArray.length; i++) {
			nArray[i] = Integer.parseInt(sArray[i]);
			//문자열을 숫자로 변환시키는 방버 --> Integer.parseInt() 사용
			//parseInt 함수는 Integer클래스의 static 함수
			//System.out.println(nArray[i]);
			sum = sum + nArray[i];
		}

		//System.out.println(numLine);

		System.out.println("합:" + sum);

		sc.close();
	}

}
