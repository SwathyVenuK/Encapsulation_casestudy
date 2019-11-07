package encapsulation;

import java.util.Scanner;

public class Encap1 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
	student1 st=new student1();
	System.out.println("Enter the name");
	st.setName(s.next());
	System.out.println("Enter the id");
	st.setId(s.nextInt());
	System.out.println("name\t"+st.getName());
	System.out.println("id no"+st.getId());
}
}