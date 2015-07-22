package com.zkw.concur.atomicboolean;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceDemo {
	
	private static void getTest(){
		AtomicReference atomicReference = new AtomicReference("string");
		String reference = (String)atomicReference.get();
		
		AtomicReference<String> atomicStringReference = new AtomicReference<String>();
		String reference2 = atomicStringReference.get();
	}
	private static void compareAndSetTest(){
		String initialReference = "initial value referenced";

		AtomicReference<String> atomicStringReference =
		    new AtomicReference<String>(initialReference);

		String newReference = "new value referenced";
		boolean exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
		System.out.println("exchanged: " + exchanged);

		exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
		System.out.println("exchanged: " + exchanged);
	}
	private static void test(){
		AtomicReference atomicReference = new AtomicReference();
		String initialReference = "the initial Referenced string";
		AtomicReference atomicReferenceInitial = new AtomicReference(initialReference);
		
		AtomicReference<String> atomicStringReference = new AtomicReference<String>();
		
	}
	public static void main(String[] args) {
		AtomicReferenceDemo demo = new AtomicReferenceDemo();
		demo.compareAndSetTest();
	}
}
