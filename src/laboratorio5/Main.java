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
			System.out.println("[6] Show contacts");
			System.out.println("[7] Leave");
			
			try {
				option = sc.nextInt();
				sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println("---------------");
				System.out.println("INVALID OPTION!");
				System.out.println("---------------");
				sc.nextLine();
			}
			
			if(option==1)
				IU.addContact();
			
			if(option==2)
				IU.removeContact();
			
			if(option==3)
				IU.addLostCall();
			
			if(option==4)
				IU.printLostCalls();
			
			if(option==5)
				IU.clearLostCalls();
			
			if(option==6)
				IU.showContacts();
			
			System.out.println("------------------------");
			System.out.printf("Press enter to continue\n");
			String next = sc.nextLine();
			if(next.equals("7"))
				option = 7;
	
			
		}while(option!=7);
		sc.close();
		System.out.println("Closing application...");

	}

}
