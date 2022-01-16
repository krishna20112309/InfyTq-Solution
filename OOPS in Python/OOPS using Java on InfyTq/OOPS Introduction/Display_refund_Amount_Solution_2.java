package OOPS_Introduction;

public class Display_refund_Amount_Solution_2 {

	public static void main(String[] args) {
		System.out.println("Krishna Kumar ");
		System.out.println("19SCSE1010702");
		System.out.println("");
		System.out.println("");
		
			double total_price_mobile = 0;
		     double  total_price_shoe = 0;
		
		 
		purchase_mobile(20000,"Apple");
		purchase_shoe(200,"leather");
		return_mobile(total_price_mobile);
		return_shoe(total_price_shoe);
		
		
	}
	static void purchase_mobile(double price, String brand) {
	    double total_price_mobile;
	    int discount;
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
		    if( material == "leather") {
		        tax = 5;
		    }
		    else {
		        tax = 2;
		    }
		    total_price_shoe = price + price * tax / 100;
		    System.out.println("Total price for Shoe is "+total_price_shoe);
}
	static  void  return_mobile(double total_price_mobile) {
		
		    System.out.println("Refund price for Mobile is 1800"+ total_price_mobile);
	}
	static void return_shoe(double total_price_shoe) {
	    System.out.println("Refund price for Shoe is 20"+total_price_shoe);
	
    }
}