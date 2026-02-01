package com.raj.codsoft.student;

import com.raj.codsoft.student.model.Student;
import com.raj.codsoft.student.service.StudentManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    if (name.isEmpty() || grade.isEmpty()) {
                        System.out.println("Fields cannot be empty.");
                        break;
                    }

                    sms.addStudent(new Student(roll, name, grade));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Roll Number to search: ");
                    roll = sc.nextInt();

                    Student s = sms.searchStudent(roll);
                    if (s != null) {
                        System.out.println("Roll: " + s.getRollNumber());
                        System.out.println("Name: " + s.getName());
                        System.out.println("Grade: " + s.getGrade());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to remove: ");
                    roll = sc.nextInt();

                    if (sms.removeStudent(roll)) {
                        System.out.println("Student removed.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    if (sms.getAllStudents().isEmpty()) {
                        System.out.println("No students available.");
                    } else {
                        for (Student st : sms.getAllStudents()) {
                            System.out.println(st.getRollNumber() + " | " +
                                    st.getName() + " | " +
                                    st.getGrade());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting application.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
