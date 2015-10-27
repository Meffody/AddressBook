package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactsDate;

public class ContactHelper extends HelperBase {
	
	
	public static boolean CREATION = true;
	public static boolean MODIFICATION = false;

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitContactsCreation() {
		click(By.name("submit"));
	}

	public void fillContactsForm(ContactsDate contact, boolean formType) {
		type(By.name("firstname"), contact.firstName);
		type(By.name("lastname"), contact.lastName);
		type(By.name("address"), contact.address);
		type(By.name("home"), contact.home);
		type(By.name("mobile"), contact.mobile);
		type(By.name("work"), contact.work);
		type(By.name("email"), contact.email);
		type(By.name("email2"), contact.emailTwo);
		selectByText(By.name("bday"), contact.birthDay);
		selectByText(By.name("bmonth"), contact.birthMonth);
		type(By.name("byear"), contact.birthYear);
		if (formType == CREATION) {
//		selectByText(By.name("new_group"))), "group 1");
		} else {
			if (driver.findElements(By.name("new_group")).size() != 0) {
				throw new Error("group selector exists in contact modification form");
			}
		}
		
		type(By.name("address2"), contact.secondaryAddress);
		type(By.name("phone2"), contact.secondaryHome);
	}
	

	public void deleteContact() {
		click(By.xpath(".//input[@value='Delete']"));
		
	}

	public void editContact(int i) {
		click(By.xpath(".//*[@id='maintable']//tr[@name='entry'][" + i +"]//img[@alt='Edit']"));
				
		
		
	}

	public void submitUpdate() {
		click(By.xpath(".//input[@value='Update']"));
	}


	public void goToAddNewContactsPage() {
		click(By.linkText("add new"));
	}


}
