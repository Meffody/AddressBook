package com.example.tests;

import org.testng.annotations.Test;

public class ContactsModificationTests extends TestBase {
	
	@Test
	public void modifySomeContacts() {
		app.navigateTo().openHomePage();
		app.getContactHelper().editContact(1);
		ContactsDate contact = new ContactsDate();
		contact.firstName = "Lol";
		contact.email = "NewEmail";
		app.getContactHelper().fillContactsForm(contact);
		app.getContactHelper().submitUpdate();
		app.navigateTo().returnHomePage();
	}

}
