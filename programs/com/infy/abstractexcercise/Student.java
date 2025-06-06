package com.infy.abstractexcercise;

abstract class Student{
	private String name;
	private int[] test=new int[4];
	private String result;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getTest() {
		return test;
	}
	public void setTest(int[] test) {
		this.test = test;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public Student(String studentName) {
		this.name=studentName;
		System.out.println("Name: "+studentName);
	}
	public void setTestScore(int testNumber,int testScore) {
		test[testNumber]=testScore;
	}
	public abstract void generateResult();
}