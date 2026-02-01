package com.raj.codsoft.student.service;

import com.raj.codsoft.student.model.Student;
import com.raj.codsoft.student.util.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {

    private List<Student> students;

    public StudentManagementSystem() {
        students = FileHandler.loadStudents();
    }

    public void addStudent(Student student) {
        students.add(student);
        FileHandler.saveStudents(students);
    }

    public Student searchStudent(int rollNumber) {
        for (Student s : students) {
            if (s.getRollNumber() == rollNumber) {
                return s;
            }
        }
        return null;
    }

    public boolean removeStudent(int rollNumber) {
        Student s = searchStudent(rollNumber);
        if (s != null) {
            students.remove(s);
            FileHandler.saveStudents(students);
            return true;
        }
        return false;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
