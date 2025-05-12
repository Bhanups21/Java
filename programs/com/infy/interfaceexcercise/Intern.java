package com.infy.interfaceexcercise;

public class Intern implements Student{
	private int marksSecured;
	private int projectMarks;
	public Intern(int marksSecured, int projectMarks) {
		this.marksSecured = marksSecured;
		this.projectMarks = projectMarks;
	}
	@Override
	public void calcPercentage() {
		if(marksSecured>400) {
			System.out.println("Please enter the correct marks");
			return;
		}
		System.out.println("The total aggregate percentage secured by the intern is "+(marksSecured+projectMarks)/(double)Student.TOTAL_MAXIMUM_MARKS*100);
	}
	
}
