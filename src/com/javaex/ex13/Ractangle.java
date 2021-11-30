package com.javaex.ex13;

public class Ractangle {
	
	private String linecolor;
	private String fillcolor;
	private int width;
	private int height;
	
	public Ractangle() {
		//super = 부모의 디폴트 생성자를 불러옴 
	}

	public Ractangle(String linecolor, String fillcolor, int width, int height) {
		this.linecolor = linecolor;
		this.fillcolor = fillcolor;
		this.width = width;
		this.height = height;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}

	public String getFillcolor() {
		return fillcolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

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

//	@Override
//	public String toString() {
//		return "Ractangle [linecolor=" + linecolor + ", fillcolor=" + fillcolor + ", width=" + width + ", height="
//				+ height + "]";
//	}
	
	public void draw() {
		System.out.println("선색: "+linecolor+", 면색: "+fillcolor+", 가로: "+width+" 세로: "+height+ "사각형을 그렸습니다.");
	}
	
	// 모든 사각형의 선색만 출력
	
	
	
	

}
