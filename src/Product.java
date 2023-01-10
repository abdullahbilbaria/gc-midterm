public class Product {
	
  private String name;
  private String category;
  private String description;
  private double price;

  
//Constructor for the Product class
// Accepts four parameters: name, category, description, price
  
  public Product(String name, String category, String description, double price) {
    this.name = name;
    this.category = category;
    this.description = description;
    this.price = price;
  }
  
//Getter method for the name field
  
  public String getName() {
    return name;
  }
  
//Setter method for the name field
// Accepts one parameter: name
  
  public void setName(String name) {
    this.name = name;
  }
  
//Getter method for the category field
  
  public String getCategory() {
    return category;
  }
  
 //Setter method for the category field
 // Accepts one parameter: category
  
  public void setCategory(String category) {
    this.category = category;
  }

  public String getDescription() {
    return description;
  }
  // Setter method for the description field
  // Accepts one parameter: description
  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
