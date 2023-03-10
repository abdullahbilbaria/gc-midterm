import java.text.DecimalFormat;

public class CashPayment extends Payment {
	
	  private double amountTendered; // the amount tendered in cash

	  // Constructor for the CashPayment class
	  // Accepts two parameters: amount, amountTendered
	  public CashPayment(double amount, double amountTendered) {
	    super(amount); // calls the constructor of the superclass (Payment)
	    this.amountTendered = amountTendered;
	  }

	  // Getter method for the amountTendered field
	  public double getAmountTendered() {
	    return amountTendered;
	  }

	  // Setter method for the amountTendered field
	  // Accepts one parameter: amountTendered
	  // Uses a regular expression to check that the amount tendered is a positive number
	  
	  public void setAmountTendered(double amountTendered) {
	    if (Double.toString(amountTendered).matches("^\\d*\\.?\\d+$")) {
	      this.amountTendered = amountTendered;
	    } else {
	      System.out.println("Invalid amount tendered: Amount tendered must be a positive number.");
	    }
	  }

	  // Method for the payment process
	  // Displays a message indicating that the payment was successful and calculates the change
	  
	  @Override
	  public void pay() {
		   double change = amountTendered - super.amount;
		    DecimalFormat df = new DecimalFormat("#.00");
		    if (change >= 0) {
		        System.out.println("Payment successful! Change: $" + df.format(change));
		    } else {
		        System.out.println("Error: Insufficient amount tendered.");
		    }
		}
	}