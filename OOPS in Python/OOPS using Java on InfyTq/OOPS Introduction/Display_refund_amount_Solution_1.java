package OOPS_Introduction;

public class Display_refund_amount_Solution_1 {

	public static void main(String[] args) {
		System.out.println("Krishna Kumar ");
		System.out.println("19SCSE1010702");
		System.out.println("");
		System.out.println("");
		return_mobile(1000, "Samsung");
		return_shoe(200,"leather");
		
	}
	static void return_mobile(double price, String brand) {
		int discount;
		double total_price;
	
	    if (brand == "Apple") {
	        discount = 10;
	    }
	    else {
	        discount = 5;
	    }
	    total_price = price - price * discount / 100;

	    System.out.println("Refund price for Mobile is "+total_price);
}
	static void return_shoe(double price, String material) {
		
	int tax;
	double total_price;
	    if (material == "leather") {
	        tax = 5;
	    }
	    else {
	        tax = 2;
	    }
	    total_price = price + price * tax  /100;

	    System.out.println("Refund price for Shoe is "+total_price);
}
}