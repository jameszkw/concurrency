package com.zkw.concur.atomicboolean;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
	private static void compareAndSetTest(){
		AtomicInteger atomicInteger = new AtomicInteger();
		atomicInteger.compareAndSet(1, 111);
		System.out.println(atomicInteger.get());
	}
	private static void test(){
		AtomicInteger atomicInteger = new AtomicInteger();
		AtomicInteger atomicIntegerInitial = new AtomicInteger(10);
		System.out.println(atomicInteger.get());
		atomicInteger.set(123);
		System.out.println(atomicInteger.get());
		
		
		
	}
	private static void addTest(){
		AtomicInteger atomicInteger = new AtomicInteger();
		int result1 = atomicInteger.addAndGet(2);
		int result2 = atomicInteger.getAndAdd(2);
		System.out.println(result1);
		System.out.println(result2);
		atomicInteger.getAndAdd(-1);
	}
	public static void main(String[] args) {
		AtomicIntegerDemo demo = new AtomicIntegerDemo();
//		demo.compareAndSetTest();
		demo.addTest();
	}
}
