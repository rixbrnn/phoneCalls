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

	public boolean nameIsValid(String name) {
		if (name.length() < 3 || name.matches(".*[0-9].*") || name.length() > 25)
			return false;
		return true;
	}

	public void addContact() {
		System.out.println("Insert the new contact name:");
		String name = sc.nextLine();
		boolean validName = false;
		while (!validName) {
			if (nameIsValid(name)) {
				validName = true;
			} else {
				System.out.println("Insert a valid name:");
				name = sc.nextLine();
			}
		}
		System.out.println("Insert the new contact number");
		System.out.println("Example: ###########");
		String number = sc.nextLine();
		boolean nvalid = false;
		while (!nvalid) {
			if (numberIsValid(number)) {
				number = formatNumber(number);
				nvalid = true;
			} else {
				System.out.println("Insert a valid number:");
				number = sc.nextLine();
			}
		}
		Contact newContact = new Contact(name, number);
		if(contactlist.addContact(newContact))
			System.out.println("Contact added successfully!");
		else
			System.out.println("Cannot add this contact, the number is already registered!");

	}

	private boolean numberIsValid(String number) {
		number = number.replaceAll("[^\\d.]", "");
		boolean numeric = number.matches("-?\\d+(\\.\\d+)?");
		if (number.length() != 11 || !numeric)
			return false;
		return true;
	}

	private String formatNumber(String number) {
		number = number.replaceAll("\\s", "");
		number = number.replaceAll("[^\\d.]", "");
		StringBuilder sb = new StringBuilder(number);
		sb.insert(7, "-");
		sb.insert(0, "(");
		sb.insert(3, ")");
		return sb.toString();

	}

	public void removeContact() {
		if (!contactlist.isEmpty()) {
			System.out.println("Insert the contact's name to be removed:");
			String name = sc.nextLine();
			boolean removed = contactlist.removeContact(name);
			if (removed)
				System.out.println("Contact successfully removed!");
			else
				System.out.println("Contact not found!");
		} else
			System.out.println("There is no contact's to be removed!");
	}

	public void addLostCall() {
		System.out.println("Insert the number of the lost call to be registered:");
		String number = sc.nextLine();
		boolean nvalid = false;
		while (!nvalid) {
			if (numberIsValid(number)) {
				number = formatNumber(number);
				nvalid = true;
			} else {
				System.out.println("Insert a valid number:");
				number = sc.nextLine();
			}
		}
		lostcalls.addLostCall(number);
		System.out.println("Lost call successfully registered!");
	}

	public void printLostCalls() {
		lostcalls.printLostCalls();
	}

	public void clearLostCalls() {
		if (!lostcalls.clearLostCalls())
			System.out.println("There is no lost calls!");
		else
			System.out.println("Lost calls successfully cleared!");
	}

	public void showContacts() {
		contactlist.showContacts();
	}

}
