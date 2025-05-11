
public class BookMyMovie {
	private int movieId;
	private int noOfTickets;
	private double discount;
	private double totalAmount;
	public BookMyMovie(int movieId,int noOfTickets) {
		if(movieId<101 || movieId>103) {
			System.out.println("Sorry! Invalid Movie ID!\r\n"
					+ "Please check the Movie ID and enter once again.\r\n");
			return;
		}
		this.movieId=movieId;
		if(noOfTickets>15 || noOfTickets<1) {
			System.out.println("more than 15 tickets cannot be issued");
			return;
		}
		this.noOfTickets=noOfTickets;
	}
	public void calculateDiscount() {
		if((this.movieId==101 || this.movieId==103) && this.noOfTickets>=5 && this.noOfTickets<10)
			this.discount=15;
		else if((this.movieId==101 || this.movieId==103) && this.noOfTickets>=10 && this.noOfTickets<=15)
			this.discount=20;
		else if(this.movieId==102 && this.noOfTickets>=5 && this.noOfTickets<10)
			this.discount=10;
		else if(this.movieId==102 && this.noOfTickets>=10 && this.noOfTickets<=15)
			this.discount=15;
	}
	public double calculateticketAmount() {
		this.calculateDiscount();
		if(this.movieId==101) {
			this.totalAmount=120*this.noOfTickets*(double)(100-this.discount)/100;
		}
		else if(this.movieId==102) {
			this.totalAmount=170*this.noOfTickets*(double)(100-this.discount)/100;
		}
		else if(this.movieId==103) {
			this.totalAmount=150*this.noOfTickets*(double)(100-this.discount)/100;
		}
		return this.totalAmount;
	}
	public static void main(String[] args) {
		BookMyMovie b1=new BookMyMovie(103,8);
		System.out.println(b1.calculateticketAmount());
	}
}
