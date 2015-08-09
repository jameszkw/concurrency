/**
 * 
 */
package com.zkw.concurrency.scheduledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName: ScheduledExecutorServiceQuestion
 * @Description: ScheduledExecutorService执行一段时间之后就不执行的问题
 * @author James.zhang
 * @date 2015年8月9日 下午2:05:08
 *
 */
public class ScheduledExecutorServiceQuestion {
	private final static ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
	private void question1(){
		scheduler.scheduleAtFixedRate(new Runnable(){
			@Override
			public void run() {
				int[] s = new int[1];
				System.out.println("question1 Ok");
				System.out.println(s[1]);// 数组越界
			}
		}, 0, 2, TimeUnit.SECONDS);
	}
	
	private void question2() throws Exception{
		scheduler.scheduleAtFixedRate(new Runnable(){
			@Override
			public void run() {
				int[] s = new int[1];
				System.out.println("question2 Ok");
				System.out.println(s[1]);
			}
		}, 0, 2, TimeUnit.SECONDS);
	}
	
	private void resolve1(){
		scheduler.scheduleAtFixedRate(new Runnable(){
			@Override
			public void run() {
				try {
					int[] s = new int[1];
					System.out.println("resolve Ok");
					System.out.println(s[1]);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}, 0, 2, TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) {
		ScheduledExecutorServiceQuestion demo = new ScheduledExecutorServiceQuestion();
//		demo.question1();
		demo.resolve1();
		try {
//			demo.question2();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
