package laboratorio5.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import laboratorio5.Contact;
import laboratorio5.ContactList;
import laboratorio5.LostCalls;

public class LostCallsTest {

	@Test
	public void test() {
		ContactList contactlist = new ContactList();
		LostCalls lostcalls = new LostCalls(contactlist);
		
		contactlist.addContact(new Contact("RICHARD","51998900025"));
		contactlist.addContact(new Contact("FABIANO","51998940025"));
		contactlist.addContact(new Contact("GABRIEL","51998900425"));
		contactlist.addContact(new Contact("ELAINE","51998900075"));
		contactlist.addContact(new Contact("RICARDO","51978900025"));
		
		lostcalls.addLostCall("51998900025");
		assertTrue(lostcalls.searchLostCall("RICHARD"));
		lostcalls.addLostCall("51999999999");
		assertTrue(lostcalls.searchLostCall("51999999999"));
		
	}

}
