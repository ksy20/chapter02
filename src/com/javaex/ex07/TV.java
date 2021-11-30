package com.javaex.ex07;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;
	
	public TV() {
		
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public int isVolume() {
		return volume;
	}

	public void setVolume(boolean volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	status ("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	
	
	
	
	
	
	
	
	
	
	
	

}
