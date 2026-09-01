package org.tnsif.acc.c2tc.multithreading;

class Eclipse3 extends Thread{
	public void run() {
		System.out.println("Eclipse id is " + Thread.currentThread().getId());
	}

}
class Chrome1 extends Thread{
	public void run() {
		System.out.println("Chrome id is " + Thread.currentThread().getId());
		
	}
	
}
public class ThreadPriority {

	public static void main(String[] args) {
		Eclipse3 obj=new Eclipse3();
		obj.start();
		obj.setPriority(Thread.MAX_PRIORITY);
		Chrome1 obj1=new Chrome1();
		obj1.start();
		obj1.setPriority(Thread.MIN_PRIORITY);
	}

}
