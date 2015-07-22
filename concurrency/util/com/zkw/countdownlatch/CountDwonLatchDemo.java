package com.zkw.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDwonLatchDemo {
	public static void main(String[] args) {
		CountDownLatch latch = new CountDownLatch(3);
		Waiter waiter = new Waiter(latch);
		Decrementer decrementer = new Decrementer(latch);
		new Thread(waiter).start();
		new Thread(decrementer).start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
