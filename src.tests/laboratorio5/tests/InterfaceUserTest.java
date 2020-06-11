package laboratorio5.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import laboratorio5.ContactList;
import laboratorio5.InterfaceUser;
import laboratorio5.LostCalls;

public class InterfaceUserTest {

	@Test
	public void test() {
		ContactList cl = new ContactList();
		LostCalls lc = new LostCalls(cl);
		InterfaceUser IU = new InterfaceUser(cl,lc);
		
		assertTrue(IU.nameIsValid("Richard"));
		assertFalse(IU.nameIsValid(""));
		assertFalse(IU.nameIsValid("Richard123"));
		assertFalse(IU.nameIsValid("0123"));
	}
}
