package com.multithreading;

public class DisplaySynchronizedUsingTwoSychronizedThread1  extends Thread{
	private DisplaySynchronizedUsingTwoSychronizedMethod display;
	
	public DisplaySynchronizedUsingTwoSychronizedThread1(DisplaySynchronizedUsingTwoSychronizedMethod display) {
		this.display = display;
	}

	@Override
	public void run() {
		display.displayn();
	}

}
