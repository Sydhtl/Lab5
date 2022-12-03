import java.util.Scanner;

/* 214673
  NURUL SAIDAHTUL FATIHA BINTI SHAHARUDIN
  SOFTWARE ENGINEERING OF COMPUTER SCIENCE
  LAB ASSIGNMENT 5 QUESTION2
 */
public class Question2 {
public static void main(String[] args) {

	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Enter the first String: ");
	String s1= scanner.nextLine();
	
		if(s1.length() > 8) {
			System.out.println("Valid password!!");
			System.out.println("\nFirst String :\""+ s1 + "\" with length " + s1.length());
			}
		else
			System.out.println("Invalid password!!");
	//end if 
		System.out.print("\nEnter the second String: ");
		String s2= scanner.nextLine();
		String s3;
		
			if(s1.contains(s2))
				System.out.println("Second String exist in First String");
			
			else
				System.out.println("Second String not exist in First String");
				s3= s1.concat(s2);
				System.out.println("\nNew statement in string 1 : " +s3);
		//end if
	}
}	