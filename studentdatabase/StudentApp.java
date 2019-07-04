package studentdatabase;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {

		// ask how many new users we want to add
		System.out.print("welcome to the student management app, how many students would you like to add today? ");
		
		Scanner in = new Scanner(System.in);
		int noOfUsers = in.nextInt();
		
		
		// create n new students		
		Student[] students = new Student[noOfUsers];
		
		for(int i=0; i<noOfUsers; i++) {
				System.out.println("Student " + (i+1) + " of " + noOfUsers);
				students[i] = new Student();
				students[i].enroll();
				students[i].payTuition();
				System.out.println("\n");
		}
		
		System.out.println("\n");
		
		for (int i=0; i<noOfUsers; i++) {
			System.out.println("SUMMARY INFO: \n" + students[i].toString());
			System.out.println("\n");

		}
				
	
	}

}
