package com.example.tests;

import org.testng.annotations.Test;

public class ContactsCreationTests extends TestBase {
	@Test
	public void testNonEmptyContactsCreation() throws Exception {
		app.getNavigatorHelper().openHomePage();
		app.getNavigatorHelper().goToAddNewContactsPage();
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
		app.getContactHelper().fillContactsForm(contact);
		app.getContactHelper().submitContactsCreation();
		app.getNavigatorHelper().openHomePage();
	}

	@Test
	public void testNonEmptyContactsCreation2() throws Exception {
		app.getNavigatorHelper().openHomePage();
		app.getNavigatorHelper().goToAddNewContactsPage();
		ContactsDate contact = new ContactsDate();
		contact.firstName = "FirstName2";
		contact.lastName = "LastName2";
		contact.address = "Address2";
		contact.home = "Home2";
		contact.mobile = "Mobile2";
		contact.work = "Work2";
		contact.email = "Email2";
		contact.emailTwo = "Email22";
		contact.birthDay = "2";
		contact.birthMonth = "January";
		contact.birthYear = "1993";
		contact.secondaryAddress = "SecondaryAddress2";
		contact.secondaryHome = "SecondaryHome2";
		app.getContactHelper().fillContactsForm(contact);
		app.getContactHelper().submitContactsCreation();
		app.getNavigatorHelper().openHomePage();
	}

}
