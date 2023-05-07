package org.example.Prototype;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StudentClone {
    private final Student student;

    public Student cloneStudent() {
        return (Student) student.clone();
    }
}
