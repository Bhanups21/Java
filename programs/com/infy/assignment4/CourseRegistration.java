package com.infy.assignment4;

public class CourseRegistration {
	private String studentName;
	private int registrationId;
	private float qualifyingMarks;
	private double courseFee;
	private int courseId;
	private boolean hostelRequired;
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}
	public String getStudentName() {
		return studentName;
	}
	public int getRegistrationId() {
		return registrationId;
	}
	public float getQualifyingMarks() {
		return qualifyingMarks;
	}
	public double getCourseFee() {
		return courseFee;
	}
	public int getCourseId() {
		return courseId;
	}
	public boolean isHostelRequired() {
		return hostelRequired;
	}
	public boolean validateMarks() {
		return qualifyingMarks>=65 && qualifyingMarks<=100;
	}
	public boolean validateCourseId() {
		return courseId>=1001 && courseId<=1005;
	}
	public double getDiscount() {
		if(qualifyingMarks>=65 && qualifyingMarks<70) {
			return 5;
		}
		else if(qualifyingMarks>=70 && qualifyingMarks<84) {
			return 10;
		}
		else if(qualifyingMarks>=85) {
			return 15;
		}
		return 0;
	}
	public void calculateCourseFee() {
		if(!validateCourseId()) {
			System.out.println("Invalid Course Id. Please try again!!");
			return;
		}
		if(!validateMarks()) {
			System.out.println("Marks is less than 65. You are not eligible for admission!!");
			return;
		}
		if(courseId==1001) {
			courseFee=55000*(100-getDiscount())/100;
		}
		else if(courseId==1002) {
			courseFee=35675*(100-getDiscount())/100;
		}
		else if(courseId==1003) {
			courseFee=28300*(100-getDiscount())/100;
		}
		else if(courseId==1004) {
			courseFee=22350*(100-getDiscount())/100;
		}
		else if(courseId==1005) {
			courseFee=115000*(100-getDiscount())/100;
		}
		System.out.println("****** Course Allocation Details ***********");
		System.out.println("Student Name\t: "+getStudentName());
		System.out.println("Course Id\t: "+courseId);
		System.out.println("Qualifying Exam marks\t: "+qualifyingMarks);
		System.out.println("Student's Registration Id\t: "+registrationId);
		System.out.println("Total course fee\t: "+courseFee);
		System.out.println("Hostel Required\t: "+(hostelRequired) != null?"Yes":"No");
	}
	
	public CourseRegistration(String studentName, int registrationId, float qualifyingMarks, int courseId,
			boolean hostelRequired) {
		this.studentName = studentName;
		this.registrationId = registrationId;
		this.qualifyingMarks = qualifyingMarks;
		this.courseId = courseId;
		this.hostelRequired = hostelRequired;
	}
	public static void main(String[] args) {
		CourseRegistration c1=new CourseRegistration("Peter",5001,58,1005,true);
		c1.calculateCourseFee();
		CourseRegistration c2=new CourseRegistration("Peter",5001,68,1006,true);
		c2.calculateCourseFee();
		CourseRegistration c3=new CourseRegistration("Peter",5001,78,1005,false);
		c3.calculateCourseFee();
	}
}
