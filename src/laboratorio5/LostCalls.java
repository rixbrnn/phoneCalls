package laboratorio5;

import java.util.ArrayList;

public class LostCalls {
	private ArrayList<String> lostcalls = new ArrayList<>();
	ContactList contacts;
	
	public LostCalls(ContactList contacts) {
		this.contacts = contacts;
	}
	
	public void addLostCall(String number) {
		boolean find = false;
		for(Contact i : contacts.getContacts()) {
			if(i.getNumber().equals(number)) {
				lostcalls.add(i.getName());
				find = true;
				break;
			}
		}
		if(!find)
			lostcalls.add(number);
	}
	
	public boolean searchLostCall(String number) {
		for(String i : lostcalls) {
			if(i.contentEquals(number)){
				return true;
			}
		}
		return false;
	}
	
	public boolean clearLostCalls() {
		if(lostcalls.isEmpty())
			return false;
		lostcalls.clear();
		return true;
	}
	
	public void printLostCalls() {
		for(String i : lostcalls) {
			System.out.println(i);
		}
	}

}
