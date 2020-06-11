package laboratorio5.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import laboratorio5.Contact;
import laboratorio5.ContactList;

public class ContactListTest {

	@Test
	public void test() {
		ContactList contactlist = new ContactList();
		
		contactlist.addContact(new Contact("RICHARD","51998900025"));
		contactlist.addContact(new Contact("FABIANO","51998940025"));
		contactlist.addContact(new Contact("GABRIEL","51998900425"));
		contactlist.addContact(new Contact("ELAINE","51998900075"));
		contactlist.addContact(new Contact("RICARDO","51978900025"));
		
		assertTrue(contactlist.removeContact("RICHARD"));
		assertFalse(contactlist.removeContact("RICHARD"));
		assertFalse(contactlist.removeContact("ELAINEA"));
		assertTrue(contactlist.removeContact("elaine"));
		
	}

}
