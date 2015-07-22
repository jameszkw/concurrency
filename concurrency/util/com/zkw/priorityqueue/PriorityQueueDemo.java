package com.zkw.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		Comparator<String> compatator = new StringLengthComparator();
		PriorityQueue<String> queue = new PriorityQueue<String>(10,compatator);
		queue.add("middle");
		queue.add("short");
		queue.add("longest");
		while(queue.size() != 0){
			System.out.println(queue.remove());
		}
	}
}
