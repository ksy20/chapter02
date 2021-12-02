package com.javaex.ex15;

public class Circle extends Shape {
	
	//필드
	private int radius;

	//생성자
	public Circle() {
	}

	public Circle(String linecolor, String fillcolor, int radius) {
		super(linecolor, fillcolor);
		this.radius = radius;
	}

	//메소드 게터세터
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//메소드 일반
	public void draw() {
		System.out.println("선색: "+super.linecolor+" 면색: "+super.fillcolor+" 반지름: "+radius+" 원을 그렸습니다.");
	}
	

}
