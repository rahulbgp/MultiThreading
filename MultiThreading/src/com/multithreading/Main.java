package com.multithreading;

public class Main {
	public static void main(String[] args) {
		ThreadUsingThreadClass thread  = new ThreadUsingThreadClass();
		thread.start();
		for(int i = 1; i <= 10; i++) {
			System.out.println("Main thread");
		}
		
	}

}
