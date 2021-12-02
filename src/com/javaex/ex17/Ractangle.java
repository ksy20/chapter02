package com.javaex.ex17;

public abstract class Ractangle extends Shape {
	
	//필드
	private int width;
	private int height;
	
	//생성자
	public Ractangle() {
	}

	public Ractangle (String linecolor, String fillcolor, int width, int height) {
		super(linecolor, fillcolor);
		this.width = width;
		this.height = height;
	}

	//ㅁㅔ소드 게터세터
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	//메소드 일반

//	@Override
//	public String toString() {
//		return "Ractangle [width=" + width + ", height=" + height + ", getLinecolor()=" + getLinecolor()
//				+ ", getFillcolor()=" + getFillcolor() + "]";
//	}
	
	public void draw() {
		System.out.println("선색: "+super.linecolor+" 면색: "+super.fillcolor+" 가로: "+width+" 세로: "+height+" 사각형을 그렸습니다.");
	}
	
	public double areaa() {
		double result = width*height;
		return result;
	}
	
	public abstract double area() { 
		double result = width*height;
		
	}
	
	
}
