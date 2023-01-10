class CashPayment extends Payment {
	
  private double tendered;
  private double change;

  public CashPayment(double amount, double tendered) {
    super(amount);
    this.tendered = tendered;
    this.change = tendered - amount;
  }

  public double getTendered() {
    return tendered;
  }

  public void setTendered(double tendered) {
    this.tendered = tendered;
  }

  public double getChange() {
    return change;
  }

  public void setChange(double change) {
    this.change = change;
  }

  @Override
  public void pay() {
    System.out.println("Paid with cash: $" + amount);
    System.out.println("Tendered: $" + tendered);
    System.out.println("Change: $" + change);
  }
}
