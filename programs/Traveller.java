class Traveller{
	private String name;
	private String id;
	private double fare;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public void calculateFare() {
		this.fare=2000+2000*11.36d/100;
	}
	public void displayDetails() {
		System.out.println("Traveller Details");
		System.out.println("********************");
		System.out.println("Traveller Name: "+name);
		System.out.println("Traveller Id: "+id);
		calculateFare();
		System.out.println("Cost of Travel: "+fare);
	}
	public Traveller(String name, String id) {
		this.name = name;
		this.id = id;
	}
}