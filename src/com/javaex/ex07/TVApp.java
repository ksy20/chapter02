package com.javaex.ex07;

public class TVApp {

	public static void main(String[] args) {
		
		TV tv = new TV(7, 20, false);
		
		tv.status();
		
		tv.setPower(true);
		tv.setVolume(120);
		tv.status();
		
		tv.volume(false);
		

	}

}
