package com.MutiThreadingwithJava.ChapterOne;

public class HelloThread {

	public static void main(String[] args) {
		Thread thread=new Thread(()->{System.out.println("hello Thread!");});

		thread.start();
		System.out.println("Main method continues!");
	}

}
