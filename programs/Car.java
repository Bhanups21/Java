class Car {
    private String color;
	private static int numberOfCars = 0;    //static variable
	
	public Car(String color) {
	   numberOfCars++;
	   this.color=color;
	}
	
	public String getColor() {       //static method
	    return this.color;
	}
	
	public static int getNumberOfCars() {
		return numberOfCars;
	}

	public void displayColor() {
		System.out.println("Color of the car : "+this.color);
	}
	public static void displayCar() {
	    System.out.println("Displaying Car details");
	}
	
	public static void main(String[] args) {
		Car c1 = new Car("Red");
		Car c2 = new Car("Green");
		Car c3 = new Car("Blue");
		Car.displayCar();
		System.out.println("Number of cars created: "+Car.getNumberOfCars());
		System.out.println("Color of the cars:");
		c1.displayColor();
		c2.displayColor();
		c3.displayColor();
		
	}
	
}