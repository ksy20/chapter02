package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods ();
		
		Goods computer = new Goods();
		
		Goods cup = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		computer.setName("LG");
		computer.setPrice(900000);
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		System.out.println(camera.toString());
		System.out.println(cup.toString());
		System.out.println(computer.toString());

	}

}
