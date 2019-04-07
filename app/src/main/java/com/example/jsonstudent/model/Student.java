package com.example.jsonstudent.model;

public class Student {
    private String  studentN;
    private String studentId;
    private String studentEmail;

    public Student(String studentN,String studentId,String studentEmail){
        this.studentEmail = studentEmail;
        this.studentId = studentId;
        this.studentN = studentN;
    }

    public String getStudentN() {
        return studentN;
    }

    public void setStudentN(String studentN) {
        this.studentN = studentN;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
}
