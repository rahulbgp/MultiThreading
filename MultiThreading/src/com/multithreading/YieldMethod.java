package com.multithreading;

public class YieldMethod  extends Thread{
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Child Thread");
			Thread.yield();
		}
	}

}
