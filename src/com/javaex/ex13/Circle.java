package com.javaex.ex13;

public class Circle {
	
	private String linecolor;
	private String fillcolor;
	private int r;
	
	public Circle() {
	}

	public Circle(String linecolor, String fillcolor, int r) {
		this.linecolor = linecolor;
		this.fillcolor = fillcolor;
		this.r = r;
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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [linecolor=" + linecolor + ", fillcolor=" + fillcolor + ", r=" + r + "]";
	}
	
	public void draw2() {
		System.out.println("선색: "+linecolor+", 면색: "+fillcolor+", 반지름: "+r+ " 원을 그렸습니다.");
	}
	
	
}
