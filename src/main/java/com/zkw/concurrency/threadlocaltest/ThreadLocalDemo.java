package com.zkw.concurrency.threadlocaltest;

public class ThreadLocalDemo {
	private ThreadLocal myThreadLocal =  new ThreadLocal();
	private void processValue(){
		myThreadLocal.set("this is thread value");
		myThreadLocal.get();
	}
}
