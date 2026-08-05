package org.tnsif.acc.c2tc.scannerclassdemo1;
import java.util.Scanner;


public class Scannerclass1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a name:");
	        
	        char ch = sc.next().charAt(1);
	        System.out.println("first position is:"+ch);
	        sc.close();
		// TODO Auto-generated method stub

	}

}
