package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String companySuffix = "dsgcompany.com";
	private String alternateEmail;
	
	
	// constructor
	
	public Email (String firstName, String lastName) {

		//store name
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("your name is: " + this.firstName + " " + this.lastName);
		
		
		// store dept
		this.department = setDepartment();
		//System.out.println("your dept is: " + this.department);

		
		// generate password 
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("your password is: " + this.password);
		
		
		// generate email syntax
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("your email is " + email);

	}
	
	
	// receive name of department	
	private String setDepartment() {
		System.out.print("Welcome, " + firstName + "!\n" + "Available dept codes: \n1 for sales\n2 for dev\n3 for account\n0 for none\nPlease enter your department code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) {return "sales";	}
		else if (deptChoice == 2) {return "dev";	}
		else if (deptChoice == 3) {return "account";	}
		else {return " ";	}
	}
	
	
	// generate random password
	private String randomPassword(int length) {
		
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@?$%£";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	}
	
	
	
	
	// set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity  = capacity;
	}
	
	// set alternate email
	public void setAltEmail (String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	// set password
	public void changePassword(String password) {
		this.password = password;
	}
	
	
	//get mailbox capacity
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAltEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	
	
	
	// get all info
	public String showInfo() {
		
		return "DISPLAY NAME: " + firstName + " " + lastName + "\n" +
				"COMPANY EMAIL: " + email + "\n" +
				"mailbox capacity: " +  mailboxCapacity + "mb";
	}

}
