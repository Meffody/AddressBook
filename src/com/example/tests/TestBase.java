package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;

public class TestBase {

	protected ApplicationManager app;

	@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager();
	}

	@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	}
	
	
	/* Random Group Generator */
	@DataProvider
	public Iterator<Object[]> randomValidGroupGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		for (int i = 0; i <10; i++) {
			GroupDate group = new GroupDate();
			group.name = generateRandomString();
			group.header = generateRandomString();
			group.footer = generateRandomString();
			list.add(new Object[]{group});
		}
		return list.iterator();
	}
	
	public String generateRandomString() {
		Random rnd = new Random();
		if (rnd.nextInt(2) == 0) {
			return "";
		} else {
			return "test" + rnd.nextInt();
		}
	}
	
	/* Random Contacts Generator */
	
	@DataProvider
	public Iterator<Object[]> randomValidContactsGenerator() {
		List<Object[]> list = new ArrayList<Object[]>();
		Random rnd = new Random();
		for (int i = 0; i < 2; i++) {
			ContactsDate contact = new ContactsDate();
			contact.firstName = generateRandomContactsString();
			contact.lastName = generateRandomContactsString();
			contact.address = generateRandomContactsString();
			contact.home = generateRandomContactsString();
			contact.mobile = generateRandomContactsString();
			contact.work = generateRandomContactsString();
			contact.email = generateRandomContactsString();
			contact.emailTwo = generateRandomContactsString();
			contact.birthDay = Integer.toString(rnd.nextInt(30));
			contact.birthMonth = generateRandomMonth();
			contact.birthYear = Integer.toString(rnd.nextInt(2015));
			contact.secondaryAddress = generateRandomContactsString();
			contact.secondaryHome = generateRandomContactsString();
			list.add(new Object[]{contact});
		}
		return list.iterator();
	}
	
	public String generateRandomContactsString() {
		Random rnd = new Random();
		if (rnd.nextInt(10) == 0) {
			return "Lol" + rnd.nextInt(4);
		} else {
			return "testContacts" + rnd.nextInt();
		}
	}
	
	
	public String generateRandomMonth() {
		String[] month = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		Random rnd = new Random();
		String birthMonth = month[rnd.nextInt(11)];
		return birthMonth;
	}


}
