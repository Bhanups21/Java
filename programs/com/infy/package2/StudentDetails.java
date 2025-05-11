package com.infy.package2;

import com.infy.package1.Student;

class StudentDetails{
    public void calculatePercentage(Student student){
        float percentage=student.getTotalMarksObtained()/student.totalMarks*100;
        System.out.println("Student Percentage: "+percentage+"%");
    }
    public void displayStudentDetails(Student student){
        System.out.println("Student Details:");
        System.out.println("Student ID: "+student.getStudentId());
        System.out.println("Student Name: "+student.studentName);
        System.out.println("Student Marks: "+student.getTotalMarksObtained());
        System.out.println("Total Marks: "+student.totalMarks);
    }
}