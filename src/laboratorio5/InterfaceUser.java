package laboratorio5;

import java.util.Scanner;

public class InterfaceUser {
	Scanner sc = new Scanner(System.in);
	private ContactList contactlist;
	private LostCalls lostcalls;
	
	public InterfaceUser(ContactList contactlist, LostCalls lostcalls) {
		this.contactlist = contactlist;
		this.lostcalls = lostcalls;
	}
	
	public void addContact() {
		System.out.println("INSERT THE NEW CONTACT NAME:");
		String name = sc.nextLine();
		System.out.println("INSERT THE NEW CONTACT NUMBER:");
		String number = sc.nextLine();
		Contact newContact = new Contact(name,number);
		contactlist.addContact(newContact);
		System.out.println("CONTACT SUCCESSFULLY ADDED!");
		
	}
	
	public void removeContact() {
		System.out.println("INSERT THE NAME OF THE CONTACT TO BE REMOVED:");
		String name = sc.nextLine();
		boolean removed = contactlist.removeContact(name);
		if(removed)
			System.out.println("CONTACT SUCCESSFULLY REMOVED!");
		else
			System.out.println("CONTACT NOT FOUND!");
	}
	
	public void addLostCall() {
		System.out.println("INSERT THE NUMBER OF THE LOST CALL TO BE ADDED:");
		String number = sc.nextLine();
		lostcalls.addLostCall(number);
	}
	
	public void printLostCalls() {
		lostcalls.printLostCalls();
	}
	
	public void clearLostCalls() {
		lostcalls.clearLostCalls();
	}
	

}
