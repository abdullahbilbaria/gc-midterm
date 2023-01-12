
public class Product {
	
	//fields 
	public String name;
	public String category;
	public String description;
	public double price;
	
	public Product(String name, String category, String description, double price) {
	    this.name = name;
	    this.category = category;
	    this.description = description;
	    this.price = price;
	  }
	
	public String getName() {
	    return name;
	  }

	  public String getCategory() {
	    return category;
	  }

	  public String getDescription() {
	    return description;
	  }

	  public double getPrice() {
	    return price;
	  }
	
	}

 
