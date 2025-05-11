package com.infy.package1;

public class Student{
    int studentId;
    public String studentName;
    private float totalMarksObtained;
    public float totalMarks;
    public int getStudentId(){
        return this.studentId;
    }
    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public float getTotalMarksObtained(){
        return this.totalMarksObtained;
    }
    public void setTotalMarksObtained(float totalMarksObtained){
        this.totalMarksObtained=totalMarksObtained;
    }
    public Student(int studentId, String studentName, float totalMarksObtained, float totalMarks){
        this.studentId=studentId;
        this.studentName=studentName;
        this.totalMarksObtained=totalMarksObtained;
        this.totalMarks=totalMarks;
    }
}