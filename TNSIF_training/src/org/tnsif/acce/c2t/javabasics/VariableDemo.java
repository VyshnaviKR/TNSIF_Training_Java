package org.tnsif.acce.c2t.javabasics;

public class VariableDemo {
	int price=10;//instance var
	void print()//method
	{
		String msg ="hello";//local var
		System.out.println(msg);
		
	}
	static String message="hello students";
	

	public static void main(String[] args) {
		VariableDemo obj = new VariableDemo();
		System.out.println(obj.price);
		obj.print();
		System.out.println(message);
		
		
		
		// TODO Auto-generated method stub

	}

}
