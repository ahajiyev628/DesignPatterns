package org.example.Bridge;

public class Main {
    public static void main(String[] args) {
        Course itCourse = new ITCourse();
        Course businessCourse = new BusinessCourse();

        Student itStudent = new ITStudent(itCourse);
        Student businessStudent = new BusinessStudent(businessCourse);

        itStudent.showDetails();
        businessStudent.showDetails();
    }
}