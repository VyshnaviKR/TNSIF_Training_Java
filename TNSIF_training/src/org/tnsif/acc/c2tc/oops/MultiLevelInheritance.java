package org.tnsif.acc.c2tc.oops;


class Device{
	void deviceType() {
	 
		System.out.println("I am an electronic Device");
	}
		// TODO Auto-generated method stub

	
}
class Phone extends Device{
	void brand() {
		System.out.println("Samsung");
	}
		
}
class SmartPhone extends Phone
{
	void features()
	{
		System.out.println("Features : Touchscreen,Camera ,Internet");
	}
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		SmartPhone smart=new SmartPhone();
		smart.deviceType();
		smart.brand();
		smart.features();
		// TODO Auto-generated method stub

	}

}
