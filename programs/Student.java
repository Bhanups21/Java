class Student {
	private String firstName;
	private String middleName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void change() {
		this.firstName=this.firstName.trim();
		this.middleName=this.middleName.trim();
		if(this.middleName.isEmpty()) {
			this.middleName="N.A.";
		}
		this.lastName=this.lastName.trim();
	}
	public String generateInitials() {
		this.change();
		return ""+this.firstName.charAt(0)+this.middleName.charAt(0)+this.lastName.charAt(0);
	}
	public static void main(String args[]) {
		Student std1=new Student();
		std1.setFirstName("Filius  ");
		std1.setMiddleName("Cedrecik");
		std1.setLastName("Flitwich");

		System.out.println(std1.generateInitials());
	}
}