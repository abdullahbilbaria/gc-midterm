<<<<<<< Updated upstream

public class Payment {

=======
abstract class Payment {
	
  protected double amount;

  public Payment(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public abstract void pay();
>>>>>>> Stashed changes
}
