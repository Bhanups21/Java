class PermanentEmployee extends Employee{
	private double basicPay;
	private double hra;
	private int experience;
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	public PermanentEmployee(int empId, String name, double basicPay,double hra, int experience) {
		super(empId, name);
		this.basicPay=basicPay;
		this.hra=hra;
		this.experience=experience;
	}
	public void calculateSalary() {
		if(this.experience<3) {
			super.setSalary(this.basicPay+this.hra);
		}
		else if(this.experience>=3 && this.experience<5) {
			super.setSalary(basicPay+basicPay*(double)5/100+hra);
		}
		else if(this.experience>=5 && this.experience<10) {
			super.setSalary(basicPay+basicPay*(double)7/100+hra);
		}
		else if(this.experience>=10) {
			super.setSalary(basicPay+basicPay*(double)12/100+hra);
		}
		System.out.println("Permanent Employee: Your salary is: "+super.getSalary() );
	}
}