package org.tnsif.acc.c2tc.multithreading;



class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse id is " + Thread.currentThread().getId());
	}

}
class Chrome extends Thread{
	public void run() {
		System.out.println("Chrome id is " + Thread.currentThread().getId());
		
	}
	
}

public class ExtendingThreads {

	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.start();
		Chrome obj1=new Chrome();
		obj1.start();
		for(int i=0;i<5;i++) {
			System.out.println("main method thread id is "+ " " + Thread.currentThread().getId());
		}

	}

}
