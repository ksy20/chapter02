package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods[] goodsArray= new Goods[3];
		
		Goods camera = new Goods("니콘", 400000);
		
		goodsArray[0] = camera; 
		
		Goods cup = new Goods("머그컵", 2000);
		goodsArray[1] = cup;
		
		Goods computer = new Goods("LG", 900000);
		goodsArray[2] = computer;
		
		
		
		System.out.println(camera.toString());
		
		for(int i=0; i<goodsArray.length; i++) {
			System.out.println(goodsArray[i].toString());
		}
		
//		System.out.println(goodsArray[0].toString());
//		System.out.println(goodsArray[1].toString());
//		System.out.println(goodsArray[2].toString());

	}

}
