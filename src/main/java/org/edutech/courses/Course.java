package org.edutech.courses;

import org.edutech.instructor.Instructor;

public class Course {
    public Course(String courseName, Instructor instructor, String duration) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    private String courseName;
    private Instructor instructor;

    private String duration;
}
