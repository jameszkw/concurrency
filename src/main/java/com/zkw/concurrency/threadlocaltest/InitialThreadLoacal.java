package com.zkw.concurrency.threadlocaltest;

public class InitialThreadLoacal {
	private ThreadLocal myThreadLocal = new ThreadLocal(){
		@Override
		protected Object initialValue() {
			return "initial threadlocal";
		}
	};
}
