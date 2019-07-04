package studentdatabase;

import java.util.Scanner;

public class Student {
	
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	
	//constructor prompt student to enter name and year
	public Student() {
		
		Scanner in = new Scanner(System.in);
		System.out.print("enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1: freshman\n2: soph\n3: junior\n4: senior\nenter student class: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		
		
	}
	
	
	//generate id
	private void setStudentID() {

		id++;

		//student id is grade year plus id
		this.studentID = gradeYear + "" + id;
		
	}
	

	//enroll in courses
	
	public void enroll() {
		
		//getinside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll, Q to quit: ");
			
			Scanner in = new Scanner(System.in);
			
			String course = in.nextLine();
			
			if (!course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			
			else {
				break;
			}
			
		} while (1 != 0);
		


	}
	
	
	//view balance
	public void viewBalance() {
		System.out.println("your tuition balance is $" + tuitionBalance);
	}
	
	
	//pay tuition
	public void payTuition() {
		
		System.out.print("your tuition balance is $" + this.tuitionBalance + "\n" + "how much do you wish to pay today? $");
		Scanner in = new Scanner(System.in);
		int pay = in.nextInt();
		tuitionBalance = tuitionBalance - pay;		
		System.out.println("thank you for your payment of $" + pay + " today");
		viewBalance();
		
	}
	
	
	//show status
	public String toString() {
		return
				
			"NAME: " + this.firstName + " " + this.lastName + "\n" +
			"GRADE LEVEL: " + this.gradeYear + "\n" +
			"ID: " + this.studentID + "\n" +
			"COURSES: " + this.courses + "\n" +
			"TUITION BALANCE: " + this.tuitionBalance
				
				;
		
	}
}		

