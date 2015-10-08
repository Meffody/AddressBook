package com.example.tests;

import org.testng.annotations.Test;

public class ContactsRemovalTest extends TestBase {
	
	@Test
	public void deleteContacts() {
		app.getNavigatorHelper().openHomePage();
		app.getContactHelper().editContact(1);
		app.getContactHelper().deleteContact();
		app.getNavigatorHelper().returnHomePage();
		
	}

}
