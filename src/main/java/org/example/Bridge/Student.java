package org.example.Bridge;

public abstract class Student {
    protected Course course;

    public Student(Course course) {
        this.course = course;
    }

    public abstract void showDetails();
}
