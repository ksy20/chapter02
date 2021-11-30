package com.javaex.ex02;

public class Point {
	
	private int x;
	private int y;
	
	public void setX( int xc ) {
		x = xc;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int yc) {
		y = yc;
	}
	
	public int getY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점 [x="+x+", "+"y="+y+"]를 그렸습니다.");
	}

}
