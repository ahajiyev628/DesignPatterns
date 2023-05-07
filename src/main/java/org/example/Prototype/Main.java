package org.example.Prototype;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(111, "Allahverdi Hajiyev");
        StudentClone sc = new StudentClone(student);
        Student clonedStudent = sc.cloneStudent();
        System.out.println("Original student: " + student);
        System.out.println("Cloned student" + clonedStudent);
    }
}
