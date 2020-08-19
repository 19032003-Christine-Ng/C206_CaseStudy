// YiYang--
public class Promotion {
	private String promotionCode;
	private String endDate;
	private double discountAmount;

	public Promotion(String promotionCode, String endDate, double discountAmount) {
		this.promotionCode = promotionCode;
		this.endDate = endDate;
		this.discountAmount = discountAmount;
	}

	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	
	public String toString() {
		String output = String.format("Promotion Code: %-10s", promotionCode);
		output += String.format("End Date: %-10s", endDate);
		output += String.format("Discount Amount: %-10s", discountAmount);
		return output;
	}
}
