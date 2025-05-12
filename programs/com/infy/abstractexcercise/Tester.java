package com.infy.abstractexcercise;

public class Tester {
	public static void main(String[] args) {
		Student s=new UndergraduateStudent("Ajay");
		s.setTestScore(0, 70);
		s.setTestScore(1, 69);
		s.setTestScore(2, 71);
		s.setTestScore(3, 55);
		s.generateResult();
		Student s1=new GraduateStudent("Mehul");
		s1.setTestScore(1, 70);
		s1.setTestScore(2, 69);
		s1.setTestScore(3, 71);
		s1.setTestScore(0, 55);
		s1.generateResult();
	}
}
