package com.zkw.concur.atomicboolean;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanDemo {
	
	private static void compareAndSetTest(){
		AtomicBoolean atomicBoolean = new AtomicBoolean();
		boolean result = atomicBoolean.compareAndSet(false, true);
		System.out.println(result);
		System.out.println(atomicBoolean.get());
	}
	
	private static void test(){
		AtomicBoolean atomicBoolean = new AtomicBoolean();
		AtomicBoolean atomicBooleanInitial = new AtomicBoolean(true);
		
		atomicBoolean.get();
		
		atomicBoolean.set(true);
		
		boolean oldvalue = atomicBoolean.getAndSet(false);
		System.out.println(oldvalue);
		
	}
	public static void main(String[] args) {
		AtomicBooleanDemo demo = new AtomicBooleanDemo();
		compareAndSetTest();
	}
}
