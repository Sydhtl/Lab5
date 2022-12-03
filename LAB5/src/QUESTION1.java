import java.util.Scanner;

/* 214673
 NURUL SAIDAHTUL FATIHA BINTI SHAHARUDIN
 SOFTWARE ENGINERRING OF COMPUTER SCIENCE
 LAB ASSIGNMENT 5 QUESTION 1
 */
public class QUESTION1 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the message for first string");
		String s1 = scanner.nextLine();
	
	
	
	if (s1.length() > 10) {
		System.out.print("Substring from 5 to 10 is " + s1.substring(5,10));
		System.out.println(" , length is "+ s1.length());	
	}
	else
		System.out.println("\nString length less than 10");
	
	System.out.println("\nEnter the message for second string" );
	String s2 = scanner.nextLine();
	String s3 ;
	
	if(s1.contains(s2)) {
	System.out.println("\nSecond String exists in First String");
		//REPLACING THE SAME STRING WITH NEW STRING
	s3 =s1.replace(s2, "Selamat Datang");
	System.out.println("New statement in  string 1 : " +s3);
	}
	
	else 
		System.out.println("Second String not exists in First String");
	
		
	
		
	}
	}
		

	


