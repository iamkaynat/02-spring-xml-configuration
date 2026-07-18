package org.edutech.students;

import org.edutech.courses.Course;

public class Student {
    public Student(String name , int rollNumber , Course course){
        this.course=course;
        this.name=name;
        this.rollNumber=rollNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }


    private String name;
    private int rollNumber;
    private Course course;

    public String displayStudent(){
        return "Name: " + this.name + "  Course: " +  this.course.getCourseName() + " Roll Number: " + this.rollNumber;
    }
}
