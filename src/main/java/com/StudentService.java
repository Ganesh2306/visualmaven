package com.example.student;

import java.util.*;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(int id, String name) {
        students.add(new Student(id, name));
    }

    public void listStudents() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void deleteStudent(int id) {
        students.removeIf(s -> s.getId() == id);
    }
}

