package case2;

import java.util.Scanner;



public class Case2 {

	public static void main(String[] args) {
	
		//@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		student3 c=new student3();
		System.out.println("Enter the name");
		c.setName(s.next());
		System.out.println("Enter the address");
		c.setAddress(s.next());
		System.out.println("Enter the contact number");
		c.setContactnumber(s.next());
		System.out.println("Enter the email");
		c.setEmail(s.next());
		System.out.println("Enter the proof type");
		c.setProoftype(s.next());
		System.out.println("Enter the proof id");
		c.setProofid(s.next());
		//Display2 g=new Display2();
		//g.display(c.getName(),c.getAddress(),c.getContactnumber(),c.getEmail(),c.getProoftype(),c.getProofid());
		c.check();
	}


	}


