package com.javaex.ex08;

public class Goods {
	
	private String name;
	private int price;
	private static int totalcount;
	
	public Goods() {
		this.totalcount++;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.totalcount++;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public int getTotalcount() {
		return totalcount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setTotalcount(int totalcount) {
		this.totalcount = totalcount;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price  + ", totalcount=" + totalcount + "]";
	}

	public void showinfo() {
		System.out.println("상품명: "+name);
		System.out.println("가격: +price");
	}

	
	
	
	
	

}
