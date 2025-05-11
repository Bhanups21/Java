
class Shop {
	private double amount;
	private Category type;
	private double discount;
	Shop(double amount,Category type){
		this.amount=amount;
		this.type=type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Category getType() {
		return type;
	}

	public void checkDiscountApplicability(double amount,Category type)
	{
		if(amount>=30000){
			System.out.println("congratulations you are applicable for discount");
			this.applyDiscount(type);
		}
		else {
			
			System.out.println("Thank you for shopping, your bill amount is: " + this.getAmount());
		}
	}
	public void applyDiscount(Category type) {
		if(type.equals(Category.MOBILE) && this.amount>=30000)
			this.discount=15;
		else if(type.equals(Category.TABLET) && this.amount>=35000)
			this.discount=10;
		else if(type.equals(Category.LAPTOP) && this.amount>=35000)
			this.discount=8;
		else if(type.equals(Category.COMPUTER) && this.amount>=50000)
			this.discount=10;
		else
			this.discount=7;
		System.out.println("Thank you for shopping, your bill amount is: " + this.getAmount()*(float)(100-this.discount)/100);
	}
	public static void main(String[] args) {
 		Shop shop=new Shop(200000.0,Category.COMPUTER);
 		shop.checkDiscountApplicability(shop.getAmount(),shop.getType());
	}

}

