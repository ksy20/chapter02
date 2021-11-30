package com.javaex.ex14;

public class Shape {
	
	//필드
	protected String linecolor;
	protected String fillcolor;
	
	//생성자
	public Shape() {
	}

	public Shape(String linecolor, String fillcolor) {
		this.linecolor = linecolor;
		this.fillcolor = fillcolor;
		
		//부모에서 private 로 막혔을떄 super.setlinecolor 세터를 이용
		//private를 protected 로 변경 
	}

	//메소드 게터세터
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

	//ㅁㅔ소드 일반
//	@Override
//	public String toString() {
//		return "Shape [linecolor=" + linecolor + ", fillcolor=" + fillcolor + "]";
//	}
	
	
	
	
}
