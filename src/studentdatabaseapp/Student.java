package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor : to enter name and year promot
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Student First Name: ");
        this.firstName = in.next();

        System.out.print("Enter the last name: ");
        this.lastName = in.next();
        System.out.println("1.Freshman\n2. For Sophmore\n3.Junior\n4.Senior\nEnter the student level");
        this.gradeYear = in.nextInt();

        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    // generate id
    private void setStudentID() {
        // grade level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // enroll courses
    public void enroll() { // gets inside loop , user hits 0
        do {
            System.out.print("Enter course to enroll(hit Q or q to exit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);
    }

    // view balance
    public void viewBalance() {
        System.out.println("Your Balance is: $" + tutionBalance);
    }

    //  and pay tuition fee
    public void payTuitionBalance() {
        viewBalance();
        System.out.print("Enter your payment $: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for payment of $" + payment);
    }

    // show status
    public String showInfo() {
        return "Name: " + firstName + " " + lastName + "\nCourses Enrolled: " + courses + "\nBalance is:$ " +
                tutionBalance;
    }
}
