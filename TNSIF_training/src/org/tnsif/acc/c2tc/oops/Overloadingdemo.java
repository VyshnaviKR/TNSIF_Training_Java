package org.tnsif.acc.c2tc.oops;
class Addition {

    void add(int a, int b) {
    	 System.out.println("Sum = " + (a + b ));
        
    }

    void add(int a, double b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }

    void add(double a, double b) {
        System.out.println("Sum = " + (a + b));
    }
}


public class Overloadingdemo {

	public static void main(String[] args) {
		 Addition obj = new Addition();

	        obj.add(10, 20);
	        obj.add(10, 20.22, 30);
	        obj.add(10.5, 20.5);
		
   
	}

}
