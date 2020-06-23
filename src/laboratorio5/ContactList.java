package laboratorio5;

import java.util.ArrayList;
import java.util.Collections;

public class ContactList {

	private ArrayList<Contact> contacts = new ArrayList<>();

	public ArrayList<Contact> getContacts() {
		return contacts;
	}

	public boolean addContact(Contact newContact) {
		if(!isNumberRegistered(newContact.getNumber())) {
			contacts.add(newContact);
			Collections.sort(contacts);
			return true;
		}else
			return false;
	}
	
	private boolean isNumberRegistered(String number) {
		for(Contact n : contacts) {
			if(n.getNumber().equals(number))
				return true;
		}
		return false;
	}

	public boolean removeContact(String name) {
		if (contacts.isEmpty())
			return false;
		for (Contact i : contacts) {
			if (i.getName().equalsIgnoreCase(name)) {
				contacts.remove(i);
				break;
			}
		}
		return true;
	}

	public boolean isEmpty() {
		if (contacts.isEmpty())
			return true;
		return false;
	}

	public void showContacts() {
		if (contacts.isEmpty())
			System.out.printf("\nThere is no contacts!\n");
		else
			System.out.println("CONTACT LIST:");
			for (Contact i : contacts) {
				System.out.println(i.toString());
			}
	}

}
