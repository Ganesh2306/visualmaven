package com.example.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Delete Student\n4. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Name: ");
                String name = sc.next();
                service.addStudent(id, name);
            } else if (choice == 2) {
                service.listStudents();
            } else if (choice == 3) {
                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();
                service.deleteStudent(id);
            } else {
                break;
            }
        }
        sc.close();
    }
}

