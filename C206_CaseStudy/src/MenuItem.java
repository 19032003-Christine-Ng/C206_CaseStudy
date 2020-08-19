
public class MenuItem {
	private String category;
	private String name;
	private Double price; 
	
	public MenuItem(String category, String name, Double price) {
		this.category = category;
		this.name = name;
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String toString() {
		String output = String.format("%-20s %-20s %-.2f", category,name,price);
		
		return output;
	}

}
