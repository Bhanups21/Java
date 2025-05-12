class SeniorTraveller extends Traveller{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void calculateFare() {
		super.calculateFare();
		if(age>=50 && age<=65)
			super.setFare(super.getFare()*(0.90d));
		else if(age>65)
			super.setFare(super.getFare()*(0.85d));
	}
	@Override
	public void displayDetails() {
		System.out.println("Senior Traveller Details");
		System.out.println("********************");
		System.out.println("Traveller Name: "+super.getName());
		System.out.println("Traveller Id: "+super.getId());
		calculateFare();
		System.out.println("Cost of Travel: "+super.getFare());
	}

	public SeniorTraveller(String name, String id, int age) {
		super(name, id);
		this.age=age;
		// TODO Auto-generated constructor stub
	}
	
}