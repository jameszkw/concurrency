package com.zkw.concurrency.synchronize;

public class SynchronizedTest {
	private synchronized void add(int value){
		
	}
	public static synchronized void add2(int value){
		
	}
	public void add3(int value){
		synchronized(this){
		}
	}
	public static void main(String[] args) {
		
	}
}
