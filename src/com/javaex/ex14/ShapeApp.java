package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle rArray[] = new Ractangle [3];
		
		Ractangle r01 = new Ractangle("빨강","빨강",5,5);
		Ractangle r02 = new Ractangle("빨강","빨강",7,7);
		Ractangle r03 = new Ractangle("빨강","빨강",10,10);
		
//		r01.draw();
//		r02.draw();
//		r03.draw();
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for (int i = 0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		////////////원
		
		//배열
		Circle cArray[] = new Circle[3];
		
		//원그리기
		Circle c01 = new Circle ("빨강","노랑",5);
		Circle c02 = new Circle ("노랑","분홍",7);
		Circle c03 = new Circle ("분홍","보라",9);
		
		//배열에 담기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//출력
		
		for(int i = 0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		/////////////////////삼각형

		
		//배열
		Triangle tArray[] = new Triangle[3];
		
		//삼각형 그리기
		Triangle t01= new Triangle("보라","노랑",5,5);
		Triangle t02= new Triangle("노랑","초록",15,25);
		Triangle t03= new Triangle("초록","검정",25, 5);
		
		//배열에 담기
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		//출력
		for (int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		
	}

}
