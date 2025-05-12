package com.infy.abstractexcercise;

class GraduateStudent extends Student{

	public GraduateStudent(String studentName) {
		super(studentName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void generateResult() {
		double sum=0;
		int[] testScores=super.getTest();
		for(int i=0;i<4;i++) {
			sum+=testScores[i];
		}
		sum/=4;
		if(sum>=70)
			System.out.println("Result: Pass");
		else if(sum<70)
			System.out.println("Result: Fail");
	}
	
}