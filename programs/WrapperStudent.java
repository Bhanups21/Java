class WrapperStudent{
	private String studentId;
	private String name;
	private String examId;
		
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExamId() {
		return examId;
	}

	public void setExamId(String examId) {
		this.examId = examId;
	}

	public String generateExamId() {
		String[] names=this.name.trim().split(" ");
		this.examId = names[0].substring(0,3)+"-"+names[1].substring(0,3)+":"+this.studentId.trim()+"-"+(int)Math.pow(Integer.parseInt(this.studentId.trim())%10, 2);
		return this.examId;
	}
	public static void main(String[] args) {
		WrapperStudent stud1 = new WrapperStudent();
		stud1.setStudentId("4596");
		stud1.setName("John Whedon");
		System.out.println(stud1.generateExamId());
		WrapperStudent stud2 = new WrapperStudent();
		stud2.setStudentId("3412");
		stud2.setName("Ross Stark");
		System.out.println(stud2.generateExamId());
	}
}
