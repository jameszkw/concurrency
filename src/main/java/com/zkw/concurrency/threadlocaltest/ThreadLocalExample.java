package com.zkw.concurrency.threadlocaltest;

public class ThreadLocalExample {
	public static class Myrunnable implements Runnable{
		private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
		
		@Override
		public void run() {
			threadLocal.set( (int) (Math.random() * 100D));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(threadLocal.get());
		}
	}
	
	public static void main(String[] args) {
		Myrunnable run = new Myrunnable();
		
		Thread thread1 = new Thread(run);
		Thread thread2 = new Thread(run);
		thread1.start();
		thread2.start();
	}
}
