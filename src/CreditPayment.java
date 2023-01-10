class CreditPayment extends Payment {
	
  private String cardNumber;
  private String expiration;
  private int cvv;

  public CreditPayment(double amount, String cardNumber, String expiration, int cvv) {
    super(amount);
    this.cardNumber = cardNumber;
    this.expiration = expiration;
    this.cvv = cvv;
  }

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  public int getCvv() {
    return cvv;
  }

  public void setCvv(int cvv) {
    this.cvv = cvv;
  }

  @Override
  public void pay() {
    System.out.println("Paid with credit: $" + amount);
    System.out.println("Card number: " + cardNumber);
    System.out.println("Expiration: " + expiration);
    System.out.println("CVV: " + cvv);
  }
}
