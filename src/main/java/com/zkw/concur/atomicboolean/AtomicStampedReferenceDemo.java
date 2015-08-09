package com.zkw.concur.atomicboolean;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author james
 *@todo what's the A-B-A problem
 */
public class AtomicStampedReferenceDemo {
	private static void getRefAndStampTest(){
		String initialRef = "text";
		int initialStamp = 0;
		AtomicStampedReference atomicStampedReference = new AtomicStampedReference(initialRef,initialStamp);
		
		int[] stampHolder = new int[1];
		Object ref = atomicStampedReference.get(stampHolder);
		
		System.out.println("ref="+ref);
		System.out.println("stamp="+stampHolder[0]);
		
	}
	private static void compareAndSetTest(){
		String initialRef   = "initial value referenced";
		int    initialStamp = 0;

		AtomicStampedReference<String> atomicStringReference =
		    new AtomicStampedReference<String>(
		        initialRef, initialStamp
		    );

		String newRef   = "initial value referenced";
		int    newStamp = initialStamp + 1;

		boolean exchanged = atomicStringReference
		    .compareAndSet(initialRef, newRef, initialStamp, newStamp);
		System.out.println("exchanged: " + exchanged);  //true

		exchanged = atomicStringReference
		    .compareAndSet(initialRef, "new string", newStamp, newStamp + 1);
		System.out.println("exchanged: " + exchanged);  //false

		exchanged = atomicStringReference
		    .compareAndSet(newRef, "new string", initialStamp, newStamp + 1);
		System.out.println("exchanged: " + exchanged);  //false

		exchanged = atomicStringReference
		    .compareAndSet(newRef, "new string", newStamp, newStamp + 1);
		System.out.println("exchanged: " + exchanged);  //true
	}
	private static void test(){
		Object initialRef = null;
		int initialStamp = 0;
		AtomicStampedReference atomicStampedReference = new AtomicStampedReference(initialRef,initialStamp);
		
		
		String initialStrRef = null;
		int initialStrStamp = 0;
		AtomicStampedReference<String> atomicStampedReferenceStr = new AtomicStampedReference<String>(initialStrRef,initialStrStamp);
		
	}
	public static void main(String[] args) {
		AtomicStampedReferenceDemo demo = new AtomicStampedReferenceDemo();
		compareAndSetTest();
	}
}
