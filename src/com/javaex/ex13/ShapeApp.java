package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		
		//사각형 3개를 만든다 (메모리에 올린다)
		Ractangle r01 = new Ractangle("빨강","노랑",5,5);
		Ractangle r02 = new Ractangle("보라", "노랑", 10, 20);
		Ractangle r03 = new Ractangle("파랑", "노랑", 55, 77);
		
		System.out.println(r01.toString());
		
		//사각형관리를 위해서 배열을 만든다
		Ractangle[] rArray = new Ractangle[3];
		
		//사각형을 배열에 넣는다
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//모두 그리시오
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//모든 사각형에 선색만 출력
		for (int i = 0; i<rArray.length; i++) {
			System.out.println(rArray[i].getLinecolor() );
		}
		
		
		//원을 관리할 배열
		Circle[] cArray = new Circle[3];
		
		//원 3개 만들기
		Circle c01 = new Circle("보라", "빨강", 15);
		Circle c02 = new Circle("검정", "노랑", 5);
		Circle c03 = new Circle("파랑", "초록", 7);
		
		//원을 배열 안에 넣기
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		//출력(모든 원을 그리기)
		for (int i=0; i<cArray.length; i++) {
			cArray[i].draw2();
		}
			
		//삼각형 담을 배열
		Triangle tArray[] = new Triangle[3];
		
		//삼각형 그리기
		Triangle t01 = new Triangle("노랑","분홍",20,7);
		Triangle t02 = new Triangle("파랑","보라",7,20);
		Triangle t03 = new Triangle("주황","초록",5,5);
		
		//삼각형 배열에 넣기
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		//출력하기
		for (int i = 0; i<tArray.length; i++) {
			tArray[i].draw3();
		}
		
	}

}
