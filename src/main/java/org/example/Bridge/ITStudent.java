package org.example.Bridge;

public class ITStudent extends Student {
    public ITStudent(Course course) {
        super(course);
    }

    public void showDetails() {
        System.out.print("IT Student ");
        course.showCourse();
    }
}
