import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MidTerm {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();
		Product product1 = new Product ("Batman Comic", "[Comics]","A comic about Batman", 19.99);
		products.add(product1);
		Product product2 = new Product ("Batman Action Figure", "[Figures]","An action figure of Batman", 39.99);
		products.add(product2);
		Product product3 = new Product ("Wonder Woman Comic", "[Comics]","A comic about Wonder Woman", 19.99);
		products.add(product3);
		Product product4 = new Product ("Avengers Poster", "[Posters]","A poster of the Avengers", 5.99);
		products.add(product4);
		Product product5 = new Product ("Catwoman Action Figure", "[Figures]","An action figure of Catwoman", 199.99);
		products.add(product5);
		Product product6 = new Product ("X-Men Poster", "[Poster]","A poster of the X-Men", 5.99);
		products.add(product6);
		Product product7 = new Product ("Green Lantern Comic", "[Comics]","A comic about Green Lantern", 19.99);
		products.add(product7);
		Product product8 = new Product ("Spider-Man Action Figure", "[Figures]","An action figure of Spider-Man", 39.99);
		products.add(product8);
		Product product9 = new Product ("Black Widow Poster[rare]", "[Posters]","A Rare Poster of Black Widow!!", 999.99);
		products.add(product9);
		Product product10 = new Product ("Fantastic Four", "[Comics]","A comic about The Fantastic Four", 19.99);
		products.add(product10);
		Product product11 = new Product ("Ironman Action Figure", "[Figures]","An Ironman Action Figure", 39.99);
		products.add(product11);
		Product product12 = new Product ("Guardians of the Galaxy Poster", "[Posters]","A Poster of the Guardians of the Galaxy", 5.99);
		products.add(product12);
		//////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Product> shoppingCart = new ArrayList<>();
		NumberFormat formatter = new DecimalFormat("#0.00");
		char loopResponse;
		int checkNumber = 0;
		double cash = 0.0;
		int CC = 0;
		String expiration = null;
		int CVV = 0;
		double subTotal = 0.0;
//		Double subtotal = calcSubtotal(shoppingCart);
//		Double salesTax = calcSalesTax(shoppingCart);
//		Double grandTotal = calcGrandTotal(shoppingCart);
		Scanner scnr = new Scanner (System.in);
		System.out.println("Welcome to Grand Circus Comic Book Shop!!");
		do{
			for (int i = 0; i < products.size(); i++) {
		
			System.out.println((i+1) + ") "  + products.get(i).getName() + " " + products.get(i).getCategory() + " " + products.get(i).getDescription() + " $" + products.get(i).getPrice());
			}
			System.out.println("What would you like to purchase?");
			int userInput = scnr.nextInt();
			System.out.println("How many would you like?");
			int itemCount = scnr.nextInt();
			System.out.println(products.get(userInput).getName() + ":" + formatter.format(products.get(userInput).getPrice()* itemCount));
			for (int i = 0; i < itemCount; i++) {
				shoppingCart.add(products.get(userInput));
			}
			System.out.print("Continue shopping?(Y/N):");
			loopResponse  = scnr.next().charAt(0);
		}while (loopResponse == 'y' || loopResponse == 'Y');
//		System.out.println("Subtotal: " + subtotal); 
//		System.out.println("Sales Tax: " + salesTax);
//		System.out.println("Grand Total: " + grandTotal);
		
		for (int i = 0; i < shoppingCart.size(); i++) {
			subTotal += shoppingCart.get(i).getPrice();
		}
		
		System.out.println("How  would you like to pay?: 1. Cash, 2. Check, 3. Credit");
		int paymentMethod = scnr.nextInt();
		switch(paymentMethod) {
		case 1:
			System.out.println("Enter Cash Amount:");
			cash = scnr.nextDouble();
			break;
		case 2:
			System.out.println("Enter Check Number:");
			checkNumber = scnr.nextInt();
			break;
		case 3:
			System.out.println("Enter Credit Card Number:");
			CC = scnr.nextInt();
			System.out.println("Enter Expiration Date:");
			expiration = scnr.nextLine();
			CVV = scnr.nextInt();
			break;
		}
// need to implement abstract pay methods
		System.out.println("==================");
		System.out.println("______RECEIPT_____");
		System.out.println("==================");
		for (int i = 0; i < shoppingCart.size(); i++) {
			System.out.println(shoppingCart.get(i).getName());
		}
		System.out.println("==================");
		System.out.println("Subtotal: $" + formatter.format(subTotal));
		System.out.println("Sales Tax: $" + formatter.format(subTotal*.06));
		System.out.println("Grand Total: $" + formatter.format(subTotal*1.06));
		switch(paymentMethod) {
		case 1:
			System.out.println("Paid: $" + formatter.format(cash));
			System.out.println("Change: $" + formatter.format(cash - subTotal*1.06));
			break;
		case 2:
			System.out.println("Check: " + checkNumber);
			break;
		case 3:
			System.out.println("CC:" + CC);
			System.out.println("EXP:" + expiration);
			System.out.println("CVV:" + CVV);
			break;
		}
		System.out.println("==================");
	}
}
