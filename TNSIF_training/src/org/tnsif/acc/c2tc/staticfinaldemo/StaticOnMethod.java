package org.tnsif.acc.c2tc.staticfinaldemo;

class PaymentMethod
{
	static void showSupportedBanks()
	{
		System.out.println("Supported Bank : SBI, HDFC ,ICIC , Axis");
	}
}
public class StaticOnMethod {

	public static void main(String[] args) {
		PaymentMethod.showSupportedBanks();
	}

}
