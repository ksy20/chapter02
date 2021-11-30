package com.javaex.chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		
		
		Goods camera = new Goods (); 
		
		camera.name = "니콘";
		camera.price = 400000;
		
		System.out.println(camera.name);
		System.out.println(camera.price);
		
		Goods computer = new Goods ();
		
		computer.name = "LG그램";
		computer.price = 900000;
		
		Goods cup = new Goods ();
		
		cup.name = "머그컵";
		cup.price = 4000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
		
		System.out.println(cup.name);
		System.out.println(cup.price);
		

	}

}
