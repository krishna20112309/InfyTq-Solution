package OOPS_Introduction;

public class Changing_Requirement {

	public static void main(String[] args) {
		purchase_product("Mobile", 20000, "Apple");
		purchase_product("Shoe", 200,"none");
	}
	static void purchase_product(String product_type, double price, String mobile_brand ) {
	int discount;
	double total_price;
	    if (product_type == "Mobile") {
	    	
	        if(mobile_brand == "Apple")
	            discount = 10;
	        else
	            discount = 5;
	        total_price = price - price * discount / 100;
	    }
	    else
	         total_price = price + price * 2 / 100;

	    System.out.println("Total price of " +product_type+ " is "+total_price);
}
}


