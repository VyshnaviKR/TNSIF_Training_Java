package org.tnsif.acc.c2tc.oops;

public class FoodItem {
	String name;
	double price;
	String category;
	
	//method
	void display() {
		System.out.println("food name : " +name );
		System.out.println("price : " +price );
		System.out.println("category : " +category );
		
	}

	public static void main(String[] args) {
		FoodItem fooditem=new FoodItem();
		fooditem.display();
		fooditem.name="Pizza";
		fooditem.price=299.99;
		fooditem.category="fast food";
		 
		
		FoodItem fooditem2=new FoodItem();
		fooditem2.display();
		fooditem2.name="Sushi;
		fooditem2.price=599.99;
		fooditem2.category="Japan Cusine";
		
		
		
		// TODO Auto-generated method stub

	}

}
