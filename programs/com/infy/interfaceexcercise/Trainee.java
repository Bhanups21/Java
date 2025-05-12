package com.infy.interfaceexcercise;

public class Trainee implements Student {
	private int marksSecured;

	public Trainee(int marksSecured) {
		super();
		this.marksSecured = marksSecured;
	}

	@Override
	public void calcPercentage() {
		if(marksSecured>400) {
			System.out.println("Please enter the correct marks");
			return;
		}
		System.out.println("The total aggregate percentage secured by the trainee is "+(double)marksSecured/Student.TOTAL_MAXIMUM_MARKS*100);
	}
	
}
