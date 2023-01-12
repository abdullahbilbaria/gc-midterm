public abstract class Payment {
	
  protected double amount; // the amount being paid
  protected double taxRate; // the tax rate applied to the payment

  // Constructor for the Payment class
  // Accepts one parameter: amount
  public Payment(double amount) {
    this.amount = amount;
    this.taxRate = 0.09; // default tax rate of 9%
  }

  // Getter method for the amount field
  public double getAmount() {
    return amount;
  }

  // Setter method for the amount field
  // Accepts one parameter: amount
  public void setAmount(double amount) {
    this.amount = amount;
  }

  // Getter method for the taxRate field
  public double getTaxRate() {
    return taxRate;
  }

  // Setter method for the taxRate field
  // Accepts one parameter: taxRate
  public void setTaxRate(double taxRate) {
    this.taxRate = taxRate;
  }

  // Abstract method for the payment process
  // This method must be implemented by any concrete subclass that extends Payment
  public abstract void pay();
}