package com.example.tests;

import org.testng.annotations.Test;

import static com.example.fw.ContactHelper.MODIFICATION;;

public class ContactsModificationTests extends TestBase {
	
	@Test
	public void modifySomeContacts() {
		app.navigatorTo().openHomePage();
		app.getContactHelper().editContact(1);
		ContactsDate contact = new ContactsDate();
		contact.firstName = "Lol";
		contact.email = "NewEmail";
		app.getContactHelper().fillContactsForm(contact, MODIFICATION);
		app.getContactHelper().submitUpdate();
		app.navigatorTo().returnHomePage();
	}

}
