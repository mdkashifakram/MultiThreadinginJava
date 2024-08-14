package com.MutiThreadingwithJava.ChapterOne;

public class ThreadSleep {

	public static void main(String[] args) {
		Thread thread=new Thread(()->{
			for(int i=0;i<5;i++) {
				System.out.println("Message from the  Thread!");
				try {Thread.sleep(5000);}
				catch(InterruptedException e) {Thread.currentThread().interrupt();}
			}
			
		});
		thread.start();
		System.out.println("Main program is running ...");

	}

}
