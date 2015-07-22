package com.zkw.executorservice;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceInvokeany {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Set<Callable<String>> callables = new HashSet<Callable<String>>();
		callables.add(new Callable<String>(){
			@Override
			public String call() throws Exception {
				return "Task one";
			}
		});
		
		callables.add(new Callable<String>(){
			@Override
			public String call() throws Exception {
				return "Task two";
			}
		});
		
		callables.add(new Callable<String>(){
			@Override
			public String call() throws Exception {
				return "Task three";
			}
		});
		
		try {
			String result = executorService.invokeAny(callables);
			System.out.println(result);
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
