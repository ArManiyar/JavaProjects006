package studentdatabaseapp;

import java.util.Scanner;

// each student [name, year,] should be enter by the user
// std should have 5 digit unique id, with first being their grade level
// std can enroll in following courses: [History 101, Mathematics 101, Engish 101, Chemistry 101, Computer Science 101]
// each course cost $600 to enroll
// std should be able to view their balance and pay the tution fee
//to see status of student we should see their name, ID, courses enroll and balance
public class StudentDatabaseApp {



    public static void main(String[] args) {
	// write your code here
        // ask how many new std will be added to database
        System.out.println("Enter the number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int no_of_std = in.nextInt();
        Student[] students = new Student[no_of_std];

        // Create n number of new students
        for (int n = 0; n < no_of_std; n++) {
            System.out.println("-------------------------");
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuitionBalance();
            System.out.println("-------------------------");
        }
        for (int n = 0; n < no_of_std; n++) {
            System.out.println("-------------------------");
            System.out.println(students[n].showInfo());
            System.out.println("-------------------------");
        }

    }
}
