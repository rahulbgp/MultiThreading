package com.multithreading;

public class InterruptThread extends Thread {

	@Override
	public void run() {
		
		    for(int i = 1; i <= 1_00_00; i++) 
			   System.out.println("Child thread: " + i);
		    try {
				Thread.sleep(2000);
			}
		
		catch (Exception e) {
			System.out.println("I got interrupted");
	
		}
	}
}
	

