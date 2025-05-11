class ContractEmployee extends Employee{
	private double wage;
	private int hours;
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void calculateSalary() {
		super.setSalary(hours*wage);
		System.out.println("Contract Employee: Your salary is: "+super.getSalary() );
	}
	public ContractEmployee(int empId, String name, double wage, int hours) {
		super(empId, name);
		this.wage=wage;
		this.hours=hours;
	}
}
