package com.multithreading;

public class DisplaySynchronizedUsingTwoSychronizedThread2  extends Thread{
	private DisplaySynchronizedUsingTwoSychronizedMethod display;
	
	public DisplaySynchronizedUsingTwoSychronizedThread2(DisplaySynchronizedUsingTwoSychronizedMethod display) {
		this.display = display;
	}

	@Override
	public void run() {
		display.displayc();
	}

}
