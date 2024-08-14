package com.MutiThreadingwithJava.ChapterOne;

public class SharedResourceAccess {
	private static int counter=0;
	private static final Object lock=new Object();

	public static void main(String[] args) {
		Runnable incrementTask=()->{
			for(int i=0;i<10;i++) {
				synchronized (lock) {
					counter++;
				}
			}
		};
		Thread thread1=new Thread(incrementTask);
		Thread thread2=new Thread(incrementTask);

		thread1.start();
		thread2.start();
		
		try {
			thread1.sleep(3000);
			thread2.sleep(3000);
			thread1.join();
			thread2.join();
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Final counter  value : "+counter);
		
	}

}
