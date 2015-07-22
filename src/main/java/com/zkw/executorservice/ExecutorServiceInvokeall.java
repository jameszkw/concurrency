package com.zkw.executorservice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceInvokeall {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		Set<Callable<String>> callables = new HashSet<Callable<String>>();
		callables.add(new Callable<String>(){
			@Override
			public String call() throws Exception {
				return "Task 1";
			}
		});
		
		callables.add(new Callable<String>(){
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Task 2";
			}
		});
		
		callables.add(new Callable<String>(){
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Task 3";
			}
		});
		
		try {
			List<Future<String>> futures = executorService.invokeAll(callables);
			for(Future future:futures){
				System.out.println("future.get()="+future.get());
			}
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
