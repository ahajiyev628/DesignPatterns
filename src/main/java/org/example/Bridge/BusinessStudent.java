package org.example.Bridge;

public class BusinessStudent extends Student {
    public BusinessStudent(Course course) {
        super(course);
    }

    public void showDetails() {
        System.out.print("Business Student ");
        course.showCourse();
    }
}