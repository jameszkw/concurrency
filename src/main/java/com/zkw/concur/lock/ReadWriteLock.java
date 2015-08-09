package com.zkw.concur.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
	public static void main(String[] args) {
		ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
		readWriteLock.readLock().lock();
		
		readWriteLock.readLock().unlock();
		
		readWriteLock.writeLock().lock();
		
		readWriteLock.writeLock().unlock();
	}
}
