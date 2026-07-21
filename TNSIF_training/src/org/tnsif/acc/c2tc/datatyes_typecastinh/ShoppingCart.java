package org.tnsif.acc.c2tc.datatyes_typecastinh;

public class ShoppingCart {

	public static void main(String[] args) {
		int quantity = 3;
		double pricePerItem=99.05d;
		double totalPrice=quantity*pricePerItem;
		System.out.println("total amount : "+totalPrice);
		//narrowing (large-small)
				double discount=10.75;
				int roundedDiscount=(int)discount;
				
				double finalAmount=totalPrice-roundedDiscount;
				
				
				System.out.println("Online Shopping Summary");
				System.out.println("items Bought "+quantity);
				System.out.println("Price per item "+pricePerItem);
				System.out.println("Final Amount to pay after discount :"+finalAmount);

		
		
		// TODO Auto-generated method stub

	}

}
