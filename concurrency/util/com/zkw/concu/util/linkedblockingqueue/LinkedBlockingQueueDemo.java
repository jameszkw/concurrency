package com.zkw.concu.util.linkedblockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueDemo {
	public static void main(String[] args) {
		BlockingQueue<String> unbounded = new LinkedBlockingQueue<String>();
		BlockingQueue<String> bounded = new LinkedBlockingQueue(1024);
		try {
			bounded.put("value");
			bounded.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
