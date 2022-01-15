package OOPS_Introduction;

public class onlinePurchase__ASenerio {

	public static void main(String[] args) {
		purchase_product("Mobile", 20000);
		purchase_product("Shoe", 200);
	}
	static  void purchase_product(String product_type, double price) {
		int discount = 10;
			   double  total_price = price - price * discount / 100;
			    System.out.println("Total price of " +product_type+ " is "+total_price) ;
}
}
	    


