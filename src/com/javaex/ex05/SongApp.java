package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song S1 = new Song ("아이유", "좋은날", "Real", "이민수", 2010, 2);
		
		System.out.println(S1.toString());
		
		Song S2 = new Song();
		
		S2.setArtist("BIGBANG");
		S2.setTitle("거짓말");
		S2.setAlbum("Always");
		S2.setComposer("G-DRAGON");
		S2.setTrack(4);
		S2.setYear(2007);
		
		System.out.println(S2.toString());
		
		

	}

}
