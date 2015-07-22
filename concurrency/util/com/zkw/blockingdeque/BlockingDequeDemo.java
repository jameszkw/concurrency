package com.zkw.blockingdeque;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class BlockingDequeDemo {
	public static void main(String[] args) {
		BlockingDeque<String> deque =  new LinkedBlockingDeque<String>();
		deque.addFirst("1");
		deque.addLast("2");
		
	}
}
