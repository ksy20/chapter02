package com.javaex.ex17;

public abstract class Shape { //추상메소드 보유한 클래스, 미완성 부분이 있음->area() 그래서 shape 단독으로 인스턴스화 노
	
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
	
	public void draw() {
		System.out.println("선색: "+linecolor+" 면색: "+fillcolor+" 도형을 그렸습니다.");
	}
	
//	public double area() {
//		return 0.0;
//	}
	
	public abstract double area();
	
	
	
	
	
	
}
