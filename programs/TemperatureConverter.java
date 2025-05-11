class TemperatureConverter{
	public static void main(String args[]){
		double fahrenheit = 212.12;
		double celsius = ((5*(fahrenheit-32.0))/9.0);
		System.out.println(fahrenheit+" degree fahrenheit is equal to "+celsius+" in celsius");
		double kelvin = celsius + 273.15;
		System.out.println(fahrenheit+" degree fahrenheit is equal to "+kelvin+" in kelvin");
	}
}