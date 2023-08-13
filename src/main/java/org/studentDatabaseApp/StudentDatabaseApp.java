package org.studentDatabaseApp;

import java.util.Scanner;

/**
 * Practice: <a href="https://www.youtube.com/watch?v=GOGt7PACl10&list=PLwiuaDJVNC9Cmiw-i9pO668GII1FNuoUP&index=8">...</a>
 * @author Farida Fatali
 * Creating student management system manually - registration, course enrollment and payment.
 */

public class StudentDatabaseApp {
    public static void main(String[] args) {
        System.out.print("Enter number of students to enroll: ");
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = scanner.nextInt();
        Student[] students = new Student[numberOfStudents];

        for (int n = 0; n < numberOfStudents; n++){
            students[n] = new Student();
            System.out.println();
            students[n].enroll();
            students[n].payTuition();
        }

        System.out.println();
        for (int n = 0; n < numberOfStudents; n++){
            System.out.println(students[n].toString());
        }
    }
}
