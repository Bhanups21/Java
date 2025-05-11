public class Customer{
	private String customerName;
	private int applicableDiscount;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getApplicableDiscount() {
		return applicableDiscount;
	}
	public void setApplicableDiscount(int applicableDiscount) {
		this.applicableDiscount = applicableDiscount;
	}
	
	public void findDiscountAndName(String inputString) {
		String[] inputStrings = inputString.trim().split(":");
		if(inputStrings[0].equals("Regular")) {
			this.applicableDiscount=10;
		}
		else if(inputStrings[0].equals("Privileged")) {
			this.applicableDiscount=20;
		}
		else {
			this.applicableDiscount=0;
		}
		this.customerName=inputStrings[1];
		System.out.println("Hi "+this.customerName+"! "+this.applicableDiscount+"% discount is applicable to you");
	}
	public static void main(String args[]) {
		Customer c1=new Customer();
		Customer c2=new Customer();
		c1.findDiscountAndName("Regular:Jack");
		c2.findDiscountAndName("Privileged:Mary");
	}
}