package com.javaex.ex09;

public class MyMathApp {

	public static void main(String[] args) {
		
		MyMath myMath = new MyMath();
		
		int sum01 = myMath.plusInt(3,6);
		System.out.println(sum01);
		
		double sum02 = myMath.plusDouble(4.3, 5.5);
		System.out.println(sum02);
		
		double sum03 = myMath.plusDouble(5.5, 9);
		System.out.println(sum03);
		
		double sum04 = myMath.plusDouble(20, 99.9);
		System.out.println(sum04);
		
		double sum05 = myMath.circleArea(5);
		System.out.println(sum05);
		
		double sum06 = myMath.circleRound(5);
		System.out.println(sum06);
		
		
		
		System.out.println("=============");
		
	}

}
