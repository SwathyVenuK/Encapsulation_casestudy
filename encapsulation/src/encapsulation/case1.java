package encapsulation;

import java.util.Scanner;

public class case1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		student c=new student();
		System.out.println("Enter the name");
		c.setName(s.next());
		System.out.println("Enter the address");
		c.setAddress(s.next());
		System.out.println("Enter the contact number");
		c.setContactNumber(s.next());
		System.out.println("Enter the email");
		c.setEmail(s.next());
		System.out.println("Enter the proof type");
		c.setProofType(s.next());
		System.out.println("Enter the proof id");
		c.setProofID(s.next());
		Display1 g=new Display1();
		g.display(c.getName(),c.getAddress(),c.getContactNumber(),c.getEmail(),c.getProofType(),c.getProofID());
		
	}

	
}
