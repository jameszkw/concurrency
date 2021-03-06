package com.zkw.concur.atomic;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanDemo {
	public static void main(String[] args) {
		AtomicBoolean atomicBoolean = new AtomicBoolean();
		AtomicBoolean atomicBooleanInitial = new AtomicBoolean(true);
		System.out.println(atomicBoolean);
		System.out.println(atomicBooleanInitial);
		
		boolean value = atomicBoolean.get();
	}
}
