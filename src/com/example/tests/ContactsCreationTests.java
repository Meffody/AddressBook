package com.example.tests;

import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class ContactsCreationTests extends TestBase {
	
	@Test(dataProvider = "randomValidContactsGenerator")
	public void testNonEmptyContactsCreation(ContactsDate contact) throws Exception {
		app.getNavigatorHelper().openHomePage();
		

		//save old state
		List<ContactsDate> oldList = app.getContactHelper().getContacts();
		
		//actions
		app.getNavigatorHelper().goToAddNewContactsPage();
		app.getContactHelper().fillContactsForm(contact);
		app.getContactHelper().submitContactsCreation();
		app.getNavigatorHelper().openHomePage();
		
		//save new state
		List<ContactsDate> newList = app.getContactHelper().getContacts();
		
		//compare states
		oldList.add(contact);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}

	//@Test
//	public void testNonEmptyContactsCreation2() throws Exception {
//		app.getNavigatorHelper().openHomePage();
//		app.getNavigatorHelper().goToAddNewContactsPage();
//		ContactsDate contact = new ContactsDate();
//		contact.firstName = "FirstName2";
//		contact.lastName = "LastName2";
//		contact.address = "Address2";
//		contact.home = "Home2";
//		contact.mobile = "Mobile2";
//		contact.work = "Work2";
//		contact.email = "Email2";
//		contact.emailTwo = "Email22";
//		contact.birthDay = "2";
//		contact.birthMonth = "January";
//		contact.birthYear = "1993";
//		contact.secondaryAddress = "SecondaryAddress2";
//		contact.secondaryHome = "SecondaryHome2";
//		app.getContactHelper().fillContactsForm(contact);
//		app.getContactHelper().submitContactsCreation();
//		app.getNavigatorHelper().openHomePage();
//	}

}
