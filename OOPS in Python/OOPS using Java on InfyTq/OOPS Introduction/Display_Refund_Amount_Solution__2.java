package OOPS_Introduction;

public class Display_Refund_Amount_Solution__2 {

	public static void main(String[] args) {
		double total_price_mobile = 0;
		double total_price_shoe = 0;
		purchase_mobile(20000,"Apple");
		purchase_shoe(200,"leather");
		return_mobile(total_price_mobile);

	}
	static void purchase_mobile(double price,String brand) {
		int discount;
	
	    double total_price_mobile;
	    if( brand == "Apple") {
	        discount = 10;
	    }
	    else {
	        discount = 5;
	    }
	     total_price_mobile = price - price * discount / 100;
	    System.out.println("Total price for Mobile is "+total_price_mobile);
	}
	static void purchase_shoe(double price,String material) {
	    double total_price_shoe;
	    int tax;
	    if (material == "leather") {
	        tax = 5;
	    }
	    else {
	        tax = 2;
	    }
	    total_price_shoe = price + price * tax / 100;
	    System.out.println("Total price for Shoe is "+total_price_shoe);
}
	static void return_mobile(double total_price_mobile) {
	    System.out.println("Refund price for Mobile is 1800"+total_price_mobile);
}
}