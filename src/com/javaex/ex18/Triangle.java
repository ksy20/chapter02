package com.javaex.ex18;

public class Triangle extends Shape implements Drawable{


	
	private int width;
	private int height;
	
	public Triangle() {
	}

	public Triangle(String linecolor, String fillcolor, int width, int height) {
		super(linecolor, fillcolor);
		this.width = width;
		this.height = height;
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
	
	public void draw() {
		System.out.println("선색: "+super.linecolor+" 면색: "+super.fillcolor+" 가로: "+width+" 세로: "+height+" 삼각형을 그렸습니다.");
	}
	
	public double area() {
		double result = (width * height)/2;
		return result;
	}

}

