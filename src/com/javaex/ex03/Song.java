package com.javaex.ex03;

public class Song {
	
	private String title;
	private String artist;
	private String album;
	private String  composer;
	private int year;
	private int track;
	
	
	
	public void setT(String titleh) {
		title = titleh;
	}
	
	public String getT() {
		return title;
	}
	
	public void setA(String artisth) {
		artist = artisth;
	}
	
	public String getA() {
		return artist;
	}
	
	public void setAl(String albumh) {
		album = albumh;
	}
	
	public String getAl() {
		return album;
	}
	
	public void setC(String composerh) {
		composer = composerh;
	}
	
	public String getC() {
		return composer;
	}
	
	public void setY(int yearh) {
		year = yearh;
	}
	
	public int getY() {
		return year;
	}
	
	public void setTr(int trackh) {
		track = trackh;
	}
	
	public int getTr() {
		return track; 
	}
	
	public String getTitle() {
		return title;
	}



//	public void setTitle(String title) {
//		this.title = title;
//	}
//
//
//
//	public String getArtist() {
//		return artist;
//	}
//
//
//
//	public void setArtist(String artist) {
//		this.artist = artist;
//	}
//
//
//
//	public String getAlbum() {
//		return album;
//	}
//
//
//
//	public void setAlbum(String album) {
//		this.album = album;
//	}
//
//
//
//	public String getComposer() {
//		return composer;
//	}
//
//
//
//	public void setComposer(String composer) {
//		this.composer = composer;
//	}
//
//
//
//	public int getYear() {
//		return year;
//	}
//
//
//
//	public void setYear(int year) {
//		this.year = year;
//	}
//
//
//
//	public int getTrack() {
//		return track;
//	}
//
//
//
//	public void setTrack(int track) {
//		this.track = track;
//	}
//
//

	public void draw () {
		System.out.println(artist+","+title+"("+album+", "+year+", "+track+"번 track, "+composer+" 작곡 )");
	}
}
