// Samantha
/**
 * @author 19017515
 *
 */
public class PurchaseOrder {
	private String itemName;
	private int itemQuantity;
	private double itemUnitPrice;
	private String deliveryDate;
	
	public PurchaseOrder(String itemName, int itemQuantity, double itemUnitPrice, String deliveryDate) {
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemUnitPrice = itemUnitPrice;
		this.deliveryDate = deliveryDate;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String toString() {
		String output = String.format("%-10s %-10d %.2f %-10s", itemName, itemQuantity, itemUnitPrice, deliveryDate);
		return output;
	}
	

}
