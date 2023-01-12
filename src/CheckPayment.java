public class CheckPayment extends Payment {
	
	  private String checkNumber; // the number of the check

	  // Constructor for the CheckPayment class
	  // Accepts two parameters: amount, checkNumber
	  public CheckPayment(double amount, String checkNumber) {
	    super(amount); // calls the constructor of the superclass (Payment)
	    this.checkNumber = checkNumber;
	  }

	  // Getter method for the checkNumber field
	  public String getCheckNumber() {
	    return checkNumber;
	  }

	  // Setter method for the checkNumber field
	  // Accepts one parameter: checkNumber
	  // Uses a regular expression to check that the check number is a positive number
	  public void setCheckNumber(String checkNumber) {
	    if (checkNumber.matches("^\\d*\\.?\\d+$")) {
	      this.checkNumber = checkNumber;
	    } else {
	      System.out.println("Invalid check number: Check number must be a positive number.");
	    }
	  }

	  // Method for the payment process
	  // Displays a message indicating that the payment was successful and displays the check number
	  @Override
	  public void pay() {
	    System.out.println("Payment successful! Check number: " + checkNumber);
	  }
	}