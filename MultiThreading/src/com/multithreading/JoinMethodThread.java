package com.multithreading;

public class JoinMethodThread  extends Thread{ 
	
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println("child thread");
			
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
			}
		}
	}

}
