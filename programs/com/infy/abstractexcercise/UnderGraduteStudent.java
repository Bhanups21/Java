package com.infy.abstractexcercise;

class UndergraduateStudent extends Student{
	public UndergraduateStudent(String studentName) {
		super(studentName);
	}

	@Override
	public void generateResult() {
		double sum=0;
		int[] testScores=super.getTest();
		for(int i=0;i<4;i++) {
			sum+=testScores[i];
		}
		sum/=4;
		if(sum>=60)
			System.out.println("Result: Pass");
		else if(sum<60)
			System.out.println("Result: Fail");
	}
}
