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
		for(Contact i : contacts) {
			if(i.getName().equals(name.toUpperCase())) {
				contacts.remove(i);
				return true;
			}
		}
		return false;
	}
	
	
}
