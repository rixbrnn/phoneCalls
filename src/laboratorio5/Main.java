package laboratorio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ContactList contacts = new ContactList();
		LostCalls lostcalls = new LostCalls(contacts);
		InterfaceUser IU = new InterfaceUser(contacts,lostcalls);
		Scanner sc = new Scanner(System.in);
		
		int option = -1;
		
		do {
			System.out.println("OPTIONS:");
			System.out.println("[1] Add new contact");
			System.out.println("[2] Remove contact");
			System.out.println("[3] Add lost call");
			System.out.println("[4] Show lost calls");
			System.out.println("[5] Clear lost calls");
			System.out.println("[6] Leave");
			
			try {
				option = sc.nextInt();
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println("---------------");
				System.out.println("INVALID OPTION!");
				System.out.println("---------------");
				sc.nextLine();
			}
			
			System.out.println("Press enter to continue");
			String next = sc.nextLine();
			if(next.equals("6"))
				option = 6;
	
			
		}while(option!=6);
		System.out.println("Closing application...");

	}

}
