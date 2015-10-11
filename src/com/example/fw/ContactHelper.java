package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.ContactsDate;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void submitContactsCreation() {
		click(By.name("submit"));
	}

	public void fillContactsForm(ContactsDate contact) {
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
//		selectByText(By.name("new_group"))), "group 1");
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

	public List<ContactsDate> getContacts() {
		List<ContactsDate> contacts = new ArrayList<ContactsDate>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox: checkboxes) {
			ContactsDate contact = new ContactsDate();
			String title = checkbox.getAttribute("title");
			contact.firstName = title.substring("Select (".length(), title.length() - ")".length());
			contacts.add(contact);
		}
		
		return contacts;
	}




}
