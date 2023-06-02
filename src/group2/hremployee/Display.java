package group2.hremployee;

import java.util.Scanner;

public class Display {
    	public String fchoice;
	public String email;
	public String pass;
	public void welcome(Scanner read) {
		System.out.println("=Welcome to G2 HR Services!=");
		System.out.println("1 - Log In");
		System.out.println("x - Exit");
		System.out.println("Enter: ");
		fchoice = read.nextLine();
	}
	
	public void logIn(Scanner read) {
		System.out.println("~Log In~");
		System.out.println("Email: ");
		email = read.nextLine();
		System.out.println("Password: ");
		pass = read.nextLine();
	}
        public void DisplayInfo(Info ino){
            System.out.println(ino.name);
            System.out.println(ino.age);
            System.out.println(ino.maile);
            System.out.println(ino.contact);
            System.out.println(ino.jobdet); 
        }
}
