package org.example.Prototype;

import lombok.Data;

@Data
public class Student implements Cloneable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public Object clone() {
        return new Student(this.id, this.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
