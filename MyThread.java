package com.quinnox.threading;

public class MyThread extends Thread {
	public static void main(String[] args) {
		MyThread objex=new MyThread();
		objex.create();
		System.out.println("this is the main thread");
	}
	public void create() {
		Thread Objex=new Thread(this);
		Objex.start();
	}
	public void run() {
		while(true)
		{
			try
			{
				System.out.println("this is d child th");
				Thread.sleep(500);
			}
		catch(InterruptedException e) {
		}
		}
}
}