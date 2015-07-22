package com.zkw.priorityqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueDemo {
	public static void main(String[] args) {
		BlockingQueue queue = new PriorityBlockingQueue();
		try {
			queue.put("short");
			queue.put("longest");
			queue.put("middle");
			queue.put("1");
			
			while(queue.size() != 0){
				System.out.println(queue.remove());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
