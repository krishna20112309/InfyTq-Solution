package OOPS_Introduction;

public class Increasing_problems {

	public static void main(String[] args) {
		System.out.println("Krishna Kumar ");
		System.out.println("19SCSE1010702");
		System.out.println("");
		System.out.println("");
		purchase_product("Mobile",20000,"Apple","None");
		purchase_product("Shoe",200,"None","leather");

	}
	static void purchase_product(String product_type, double price, String mobile_brand, String material) {
	    int discount;
	double total_price;
	int tax;
		if (product_type == "Mobile") {
	    	
	        if (mobile_brand == "Apple")
	            discount = 10;
	        else {
	            discount = 5;
	            }
	        total_price = price - price * discount / 100;
	    }
	    else {
	        if (material == "leather")
	            tax = 5;
	        else {
	            tax = 2;
	        }
	        total_price = price + price * tax / 100;
	    }
	    System.out.println("Total price of "+product_type+" is "+total_price);
}
}
