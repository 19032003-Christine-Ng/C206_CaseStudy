import java.util.ArrayList;

public class Order {
	private String username;
	private String status; 
	private boolean takeaway;
	private ArrayList<MenuItem> items;
	
	//constructor
	public Order(String username, String status, boolean takeaway, ArrayList<MenuItem> items) {
		this.username = username;
		this.status = status;
		this.takeaway = takeaway;
		this.items = items;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public boolean isTakeaway() {
		return takeaway;
	}
	
	public void setTakeaway(boolean takeaway) {
		this.takeaway = takeaway;
	}
	
	public ArrayList getitems() {
		return items;
	}
	
	public void setItems(ArrayList items) {
		this.items = items;
	}
	public String toString() {
		String output = String.format("Username: %-10s", username);
		
		return output;
	}
}
