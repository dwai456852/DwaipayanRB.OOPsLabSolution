package in.greatlearning.oopslab.main;

import in.greatlearning.oopslab.pojo.Employee;
import in.greatlearning.oopslab.services.CredentialServices;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String fname, lname;

		System.out.println("Please enter your First Name");
		fname = sc.nextLine();
		String name = fname;
		fname = fname.toLowerCase();
		fname = fname.trim().replaceAll("\\s+", "");

		System.out.println("Please enter your Last Name");
		lname = sc.nextLine();
		lname = lname.toLowerCase();
		lname = lname.trim().replaceAll("\\s+", "");

		Employee employee = new Employee(fname, lname);
		CredentialServices services = new CredentialServices();

		try {
			System.out.println("Please enter the department from the following");
			System.out.println(" 1. Technical" + "\n 2. Admin" + "\n 3. Human Resource" + "\n 4. Legal");
			
			int value = sc.nextInt();
			switch (value) {
			case 1:
				String deptn1 = "tech";
				services.generateEmailAddress(employee, deptn1);
				CredentialServices.generatePassword(8);
				services.showCredentials(name);
				break;
			case 2:
				String deptn2 = "admin";
				services.generateEmailAddress(employee, deptn2);
				CredentialServices.generatePassword(8);
				services.showCredentials(name);
				break;
			case 3:
				String deptn3 = "hr";
				services.generateEmailAddress(employee, deptn3);
				CredentialServices.generatePassword(8);
				services.showCredentials(name);
				break;
			case 4:
				String deptn4 = "legal";
				services.generateEmailAddress(employee, deptn4);
				CredentialServices.generatePassword(8);
				services.showCredentials(name);
				break;
			default:
				System.out.println("Please enter correct value");
				System.out.println("Process Ended");
			}
		} catch (InputMismatchException e) {

			System.out.println("Invalid Input");
			System.out.println("Process Ended");
		}

		sc.close();

	}

}
