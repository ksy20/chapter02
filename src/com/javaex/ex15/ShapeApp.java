package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		//shape,모든 도형 관리하는 배열 만들기
		Shape[] sArray = new Shape[3];
		
		Shape r01 = new Ractangle("빨강","빨강",5,5);
		
		Shape c01 = new Circle("노랑","노랑",100);
		
		Shape t01 = new Triangle ("파랑","파랑",20,20);
		
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		for (int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		System.out.println(((Circle)c01).getRadius()); //가려진 자식클라스를 이런식으로 불러올 수 있음
		
	}

}
