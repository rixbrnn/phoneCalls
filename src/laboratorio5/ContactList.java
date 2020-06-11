package laboratorio5;

import java.util.ArrayList;

public class ContactList {
	
	private ArrayList<Contact> contacts = new ArrayList<>();

	public ArrayList<Contact> getContacts(){
		return contacts;
	}
	
	public void addContact(Contact newContact) {
		contacts.add(newContact);
	}
	
	public boolean removeContact(String name) {
		if(contacts.isEmpty())
			return false;
		for(Contact i : contacts) {
			if(i.getName().equalsIgnoreCase(name)) {
				contacts.remove(i);
				break;
			}
		}
		return true;
	}
	
	public boolean isEmpty() {
		if(contacts.isEmpty())
			return true;
		return false;
	}
	
	public void showContacts() {
		if(contacts.isEmpty())
			System.out.println("There is no contacts!");
		else
			for(Contact i : contacts) {
				System.out.println(i.toString());
			}
	}
	
	
}
