package com.example.tests;

public class ContactsDate implements Comparable<ContactsDate> {
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

	@Override
	public String toString() {
		return "ContactsDate [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", home="
				+ home + ", mobile=" + mobile + ", work=" + work + ", email=" + email + ", emailTwo=" + emailTwo
				+ ", secondaryAddress=" + secondaryAddress + ", secondaryHome=" + secondaryHome + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactsDate other = (ContactsDate) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(ContactsDate other) {
		return this.firstName.toLowerCase().compareTo(other.firstName.toLowerCase());
	}
	
	
}