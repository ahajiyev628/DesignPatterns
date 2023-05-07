package org.example.Singleton;

import lombok.Data;

@Data
public class Student {

    private static Student instance = null;
    private int id;
    private String name;

    private Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Student getInstance(int id, String name) {
        if (instance == null) {
            instance = new Student(id, name);
        }
        return instance;
    }
}
