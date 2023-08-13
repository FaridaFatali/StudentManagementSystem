package org.studentDatabaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCorse = 600;
    private static int id = 1000;

    public Student() {
        System.out.println("----------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter student's last name: ");
        this.lastName = scanner.nextLine();
        System.out.println();

        System.out.println("""
                1 - Freshmen
                2 - Sophomore
                3 - Junior
                4 - Senior
                Enter student's class level:""");
        this.gradeYear = scanner.nextInt();
        setStudentID();
    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + "" + id;
    }

    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n- " + course;
                tuitionBalance = tuitionBalance + costOfCorse;
            } else {
                break;
            }
        }
        while (1 != 0);
    }

    public void viewBalance() {
        System.out.println();
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.println();

        System.out.print("Enter your payment: $");
        Scanner scanner = new Scanner(System.in);
        int payment = scanner.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    public String toString() {
        System.out.println("----------------------------");
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enroll: " + courses +
                "\nBalance: $" + tuitionBalance;
    }
}
