package com.zkw.concur.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		lock.lock();
		System.out.println("inner...");
		lock.unlock();
	
	}
}
