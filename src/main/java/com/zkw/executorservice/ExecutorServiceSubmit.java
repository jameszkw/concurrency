package com.zkw.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceSubmit {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Future future = executorService.submit(new Runnable(){
			@Override
			public void run() {
				
			}
		});
		
		try {
			;
			System.out.println(future.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorService.shutdown();
	}
}
