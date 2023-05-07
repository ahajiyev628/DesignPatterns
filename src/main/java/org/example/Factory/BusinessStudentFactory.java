package org.example.Factory;

public class BusinessStudentFactory implements StudentFactory {
    @Override
    public Student createStudent() {
        return new BusinessStudent();
    }
}
