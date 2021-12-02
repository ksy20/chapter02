package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
//		Point p01 = new Point() ;
//		
//		p01.draw();
//		p01.getX(); 
//		
//		
//		Point p02 = new Point(114, 117);
//		p02.draw();
//		((Point)p02).getClass();
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Ractangle("빨강","빨강",5,7);
//		r01.draw();
		
//		System.out.println(((Ractangle)r01).getWidth());
//		System.out.println(((Ractangle)r01).getLinecolor());
		
		
		Drawable c01 = new Circle("파랑","파랑",12);
		Drawable t01 = new Triangle("노랑","노랑",22,55);
		Drawable p01 = new Point(1,1);
		
		dArray[0] =r01;
		dArray[1] =c01;
		dArray[2] =t01;
		dArray[3] =p01;
		
		//그리기
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//면적출력
		for(int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) {
				((Shape)dArray[i]).area();
			}
		}
		
		
	}
}
