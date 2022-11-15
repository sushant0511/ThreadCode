package com.test.JavaCode;
class TestThread implements Runnable 
{
@Override
	public void run() {
		System.out.println("Test Run");
		
	}
	
	}


public class TestCall {
	

	 public static void main(String[] args) {
		
		 TestThread testThread=new TestThread();
		 Thread thread=new Thread(testThread);
		 thread.start();
		 
		 
	}
}
