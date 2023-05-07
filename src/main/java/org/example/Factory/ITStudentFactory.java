package org.example.Factory;

public class ITStudentFactory implements StudentFactory {
    @Override
    public Student createStudent() {
        return new ITStudent();
    }
}
