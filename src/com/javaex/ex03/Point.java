// 아래와 같이 출력이 되도록 toString()을 재정의 하세요.(main메소드는 수정하지 않습니다.)
// [포인트] x:3, y:3 입니다.

package com.javaex.ex03;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	
	//메소드
	//toString()을 작성 하세요
	@Override
	public String toString() {
		return "[포인트] x:" + x + ", y:" + y + " 입니다.";
	}
}
