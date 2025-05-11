
class EnumStudent{
	private Integer studentId;
	private String name;
	private Integer totalMarks;
	private Grade grade;
	//Grade is the name of enum
	
	private float scholarshipAmount;
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	public float getScolarshipAmount() {
		return scholarshipAmount;
	}
	public void setScolarshipAmount(float scolarshipAmount) {
		this.scholarshipAmount = scolarshipAmount;
	}
	
	public void calculateGrade() {
		if(this.totalMarks>=250) {
			this.grade=Grade.A;
		}
		else if(this.totalMarks>=200 && this.totalMarks<250) {
			this.grade=Grade.B;
		}
		else if(this.totalMarks>=175 && this.totalMarks<200) {
			this.grade=Grade.C;
		}
		else if(this.totalMarks>=150 && this.totalMarks<175) {
			this.grade=Grade.D;
		}
		else {
			this.grade=Grade.E;
		}
	}
	
	public void calculateScolarshipAmount() {
		switch(this.grade) {
		case A:this.scholarshipAmount=5000;
		break;
		case B:this.scholarshipAmount=4000;
		break;
		case C:this.scholarshipAmount=3000;
		break;
		case D:this.scholarshipAmount=2000;
		break;
		default:break;
		}
	}
    public static void main(String[] args) {
    	EnumStudent student = new EnumStudent();
       student.setStudentId(1000);
       student.setName("Alvin");
       student.setTotalMarks(80);
       student.calculateGrade();
       student.calculateScolarshipAmount();
       System.out.println("Student Details");
       System.out.println("***************");
       System.out.println("Student Id : "+student.getStudentId());
       System.out.println("Name : "+student.getName());
       System.out.println("Grade : "+student.getGrade());
       System.out.println("Scholarship Amount : "+student.getScolarshipAmount());
       
    }
}