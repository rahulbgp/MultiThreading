package com.multithreading;

public class DisplaySynchronizedThread extends Thread {

	private DisplaySynchronized display;
	private String name;

	public DisplaySynchronizedThread(DisplaySynchronized display, String name) {
		this.display = display;
		this.name = name;
	}

	@Override
	public void run() {
		display.wish(name);
	}

}
