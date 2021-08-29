package in.greatlearning.oopslab.services;

import java.util.Random;
import in.greatlearning.oopslab.pojo.Employee;


public class CredentialServices  {
	
	public static char[] generatePassword(int length) {
	      
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$%^&*()?<>{}[]";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];

	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	   }
	      
	public String generateEmailAddress(Employee emp, String dept){
		
	    return emp.getFirstName()+emp.getLastName()+"."+dept+"@"+"techinfo.com";
	}
	
	public String showCredentials(String name){
		
		return "Dear "+name+" your generated credentials are as follows";
	
	}

}
