import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MidTerm {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		Product product1 = new Product ("Batman Comic", "Comics","A comic about Batman", 19.99);
		products.add(product1);
		Product product2 = new Product ("Batman Action Figure", "Figures","An action figure of Batman", 39.99);
		products.add(product2);
		Product product3 = new Product ("Wonder Woman Comic", "Comics","A comic about Wonder Woman", 19.99);
		products.add(product3);
		Product product4 = new Product ("Avengers Poster", "Posters","A poster of the Avengers", 5.00);
		products.add(product4);
		Product product5 = new Product ("Catwoman Action Figure", "Figures","An action figure of Catwoman", 199.99);
		products.add(product5);
		Product product6 = new Product ("X-Men Poster", "Poster","A poster of the X-Men", 5.00);
		products.add(product6);
		Product product7 = new Product ("Green Lantern Comic", "Comics","A comic about Green Lantern", 19.99);
		products.add(product7);
		Product product8 = new Product ("Spider-Man Action Figure", "Figures","An action figure of Spider-Man", 39.99);
		products.add(product8);
		Product product9 = new Product ("Black Widow Poster[rare]", "Posters","A Rare Poster of Black Widow!!", 999.99);
		products.add(product9);
		Product product10 = new Product ("Fantastic Four", "Comics","A comic about The Fantastic Four", 19.99);
		products.add(product10);
		Product product11 = new Product ("Ironman Action Figure", "Figures","An Ironman Action Figure", 39.99);
		products.add(product11);
		Product product12 = new Product ("Guardians of the Galaxy Poster", "Posters","A Poster of the Guardians of the Galaxy", 5.00);
		products.add(product12);
		//////////////////////////////////////////////////////////////////////////////////////
		List<Product> shoppingCart = new ArrayList<>();
		String loopResponse;
		int checkNumber;
		double cash;
		int CC;
		String expiration;
		int CVV;
//		Double subtotal = calcSubtotal(shoppingCart);
//		Double salesTax = calcSalesTax(shoppingCart);
//		Double grandTotal = calcGrandTotal(shoppingCart);
		Scanner scnr = new Scanner (System.in);
		System.out.println("Welcome to Grand Circus Comic Book Shop!!");
		do{
			for (int i = 0; i < products.size(); i++) {
		
			System.out.println((i+1) + ""  + products.get(i));
			}
			System.out.println("What would you like to purchase?");
			int userInput = scnr.nextInt();
			System.out.println("How many would you like?");
			int itemCount = scnr.nextInt();
			System.out.println(products.get(userInput) + ":" + products.get(userInput).getPrice()* itemCount);
			for (int i = 0; i < itemCount; i++) {
				shoppingCart.add(products.get(userInput));
			}
			System.out.print("Continue shopping?(Y/N):");
			loopResponse  = scnr.nextLine();
		}while (loopResponse.equalsIgnoreCase("y"));
//		System.out.println("Subtotal: " + subtotal); 
//		System.out.println("Sales Tax: " + salesTax);
//		System.out.println("Grand Total: " + grandTotal);
		
		System.out.println("How  would you like to pay?: 1. Cash, 2. Check, 3. Credit");
		int paymentMethod = scnr.nextInt();
//		switch(paymentMethod) {
//		case 1:
//			break;
//		case 2:
//			
//			break;
//		case 3:
//			
//		}
// need to implement abstract pay methods

		System.out.println("______RECEIPT_____");
		System.out.println("==================");
		System.out.println(shoppingCart);
		System.out.println("==================");
//		System.out.println("Subtotal:" + subtotal);
//		System.out.println("Sales Tax:" + salesTax);
//		System.out.println("Grand Total:" + grandTotal);
		switch(paymentMethod) {
		case 0:
			System.out.println("Paid: " + cash);
//			System.out.println("Change: " + (cash - grandTotal));
			break;
		case 1:
			System.out.println("Check:" + checkNumber);
			break;
		case 2:
			System.out.println("CC:" + CC);
			System.out.println("EXP:" + expiration);
			System.out.println("CVV:" + CVV);
			break;

		}
	

	}
}
