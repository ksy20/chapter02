package com.javaex.ex09;

public class MyMath {
	
	private double pi=3.14159 ;
	
	public int plusInt(int a, int b) {
		//int sum = a+b;
		return a+b;
	}
	
	public static double plusDouble(double a, double b) {
		double sum = a+b;
		
	    return a+b;
	}
	
	public static double plusDouble(double a, int b) {
		double sum = a+b;
		
	    return a+b;
	}
	
	public static double plusDouble(int a, double b) {
		double sum = a+b;
		
	    return a+b;
	}
	
	public double circleArea(int radius) {
		 return radius*radius*pi;
		
	}
	
	public double circleRound(int radius) {
		return (radius+radius)*pi;
	}

}
