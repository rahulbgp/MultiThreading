package com.multithreading;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * ThreadUsingThreadClass thread = new ThreadUsingThreadClass(); thread.start();
		 * for(int i = 1; i <= 10; i++) { System.out.println("Main thread"); }
		 */
		/*
		 * ThreadUsingRunnable threadUsingRunnable = new ThreadUsingRunnable(); Thread
		 * thread = new Thread(threadUsingRunnable); thread.setPriority(10);
		 * thread.start(); for(int i = 1; i <= 10; i++) {
		 * System.out.println("main thread"); }
		 */
		
		/*
		 * YieldMethod yieldMethod = new YieldMethod(); yieldMethod.start(); for(int i =
		 * 1; i <= 10; i++) System.out.println("Main thread");
		 */
		/*
		 * JoinMethodThread joinMethodThread = new JoinMethodThread();
		 * joinMethodThread.start(); joinMethodThread.join(); for(int i = 1; i <= 10;
		 * i++) { System.out.println("main thread"); }
		 */
		
		/*
		 * for(int i = 1; i <= 10; i++) { System.out.println("main thread");
		 * Thread.sleep(2000); }
		 */
		/*
		 * InterruptThread thread = new InterruptThread(); thread.start();
		 * thread.interrupt(); System.out.println("End of main thread");
		 */
		
		/*
		 * DisplaySynchronized display1 = new DisplaySynchronized();
		 * 
		 * DisplaySynchronized display2 = new DisplaySynchronized();
		 * DisplaySynchronizedThread thread1 = new DisplaySynchronizedThread(display1,
		 * "Dhoni"); thread1.start(); DisplaySynchronizedThread thread2 = new
		 * DisplaySynchronizedThread(display2, "Yuvraj"); thread2.start();
		 */
		
		DisplaySynchronizedUsingTwoSychronizedMethod display = new DisplaySynchronizedUsingTwoSychronizedMethod();
		DisplaySynchronizedUsingTwoSychronizedThread1 thread1 = new DisplaySynchronizedUsingTwoSychronizedThread1(display);
		DisplaySynchronizedUsingTwoSychronizedThread2 thread2 = new DisplaySynchronizedUsingTwoSychronizedThread2(display);
		thread1.start();
		thread2.start();
		
	}

}
