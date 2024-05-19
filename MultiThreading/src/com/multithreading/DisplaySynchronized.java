package com.multithreading;

public class DisplaySynchronized {
	public synchronized void wish(String name) {
		for(int i = 1; i <= 10; i++) {
			System.out.println("Good morning");
			try {
				Thread.sleep(2000);
			}
			catch (Exception e) {
			}
			System.out.println(name);
		}
	}

}
