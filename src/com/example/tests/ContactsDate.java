package com.example.tests;

public class ContactsDate {
	public String firstName;
	public String lastName;
	public String address;
	public String home;
	public String mobile;
	public String work;
	public String email;
	public String emailTwo;
	public String birthDay;
	public String birthMonth;
	public String birthYear;
	public String secondaryAddress;
	public String secondaryHome;

	public ContactsDate() {

	}

	public ContactsDate(String firstName, String lastName, String address, String home, String mobile, String work,
			String email, String emailTwo, String birthDay, String birthMonth, String birthYear,
			String secondaryAddress, String secondaryHome) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.home = home;
		this.mobile = mobile;
		this.work = work;
		this.email = email;
		this.emailTwo = emailTwo;
		this.birthDay = birthDay;
		this.birthMonth = birthMonth;
		this.birthYear = birthYear;
		this.secondaryAddress = secondaryAddress;
		this.secondaryHome = secondaryHome;
	}
}