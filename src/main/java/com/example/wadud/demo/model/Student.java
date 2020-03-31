package com.example.wadud.demo.model;

public class Student {
    private Integer Id;
    private String studentName;
    private Double grade;

    public Student(Integer id, String studentName, Double grade) {
        Id = id;
        this.studentName = studentName;
        this.grade = grade;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }


}
