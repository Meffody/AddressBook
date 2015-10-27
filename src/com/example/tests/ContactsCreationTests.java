package com.example.tests;

import org.testng.annotations.Test;

import static com.example.fw.ContactHelper.CREATION;;

public class ContactsCreationTests extends TestBase {
	@Test
	public void testNonEmptyContactsCreation() throws Exception {
		ContactsDate contact = new ContactsDate();
		contact.firstName = "FirstName";
		contact.lastName = "LastName";
		contact.address = "Address";
		contact.home = "Home";
		contact.mobile = "Mobile";
		contact.work = "Work";
		contact.email = "Email";
		contact.emailTwo = "Email2";
		contact.birthDay = "1";
		contact.birthMonth = "January";
		contact.birthYear = "1992";
		contact.secondaryAddress = "SecondaryAddress";
		contact.secondaryHome = "SecondaryHome";
		app.navigatorTo().openHomePage();
		
		app.getContactHelper().goToAddNewContactsPage();
		
		app.getContactHelper().fillContactsForm(contact, CREATION);
		app.getContactHelper().submitContactsCreation();
		
		app.navigatorTo().openHomePage();
	}

}
