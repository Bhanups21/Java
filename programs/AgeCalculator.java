import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class AgeCalculator{
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
	    String s="21/01/2001";
	    LocalDate birth=LocalDate.parse(s, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    System.out.println(birth.until(today).getYears()+" "+birth.until(today).getMonths()+" "+birth.until(today).getDays());
	}
}   