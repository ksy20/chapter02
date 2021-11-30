package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song S1 = new Song();
		
		S1.setA("아이유");
		S1.setT("좋은날");
		S1.setAl("Real");
		S1.setY(2010);
		S1.setTr(3);
		S1.setC("이민수");
		
		S1.draw();
		
		Song S2 = new Song();
		
		S2.setA("BIGBANG");
		S2.setT("거짓말");
		S2.setAl("Always");
		S2.setY(2007);
		S2.setTr(2);
		S2.setC("G-DRAGON");
		
		S2.draw();
		
		Song S3 = new Song();
		
		S3.setA("버스커버스커");
		S3.setT("벚꽃엔딩");
		S3.setAl("버스커버스커 1집");
		S3.setY(2012);
		S3.setTr(4);
		S3.setC("장범준");
		
		S3.draw();
		
		
		

	}

}
