package org.edutech.instructor;

public class Instructor {
    public Instructor(String instructorName, int experience) {
        this.instructorName = instructorName;
        this.experience = experience;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    private String instructorName;
    private int experience;

}
