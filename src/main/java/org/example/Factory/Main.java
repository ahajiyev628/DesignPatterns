package org.example.Factory;

import static org.example.Factory.StudyArea.IT;

public class Main {
    public static void main(String[] args) {
        var studentFactory = createStudentByStudyArea(IT);
        var student = studentFactory.createStudent();
        student.study();
    }

    private static StudentFactory createStudentByStudyArea(StudyArea studeyArea) {
        return switch (studeyArea) {
            case IT -> new ITStudentFactory();
            case BUSINESS -> new BusinessStudentFactory();
        };
    }
}
