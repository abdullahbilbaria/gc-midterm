class CheckPayment extends Payment {
	
  private int checkNumber;

  public CheckPayment(double amount, int checkNumber) {
    super(amount);
    this.checkNumber = checkNumber;
  }

  public int getCheckNumber() {
    return checkNumber;
  }

  public void setCheckNumber(int checkNumber) {
    this.checkNumber = checkNumber;
  }

  @Override
  public void pay() {
    System.out.println("Paid with check: $" + amount);
    System.out.println("Check number: " + checkNumber);
  }
}
