package com.example.tests;

public class GroupDate implements Comparable<GroupDate> {
	private String name;
	private String header;
	private String footer;

	public GroupDate() {

	}

	public GroupDate(String name, String header, String footer) {
		this.name = name;
		this.header = header;
		this.footer = footer;
	}



	@Override
	public String toString() {
		return "GroupDate [name=" + name + ", header=" + header + ", footer=" + footer + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		GroupDate other = (GroupDate) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(GroupDate other) {
		
		return this.name.toLowerCase().compareTo(other.name.toLowerCase());
	}

	public GroupDate withName(String name) {
		
		this.name = name;
		return this;
	}

	public GroupDate withHeader(String header) {
		this.header = header;
		return this;
	}

	public GroupDate withFooter(String footer) {
		this.footer = footer;
		return null;
	}

	public String getName() {
		return name;
	}

	public String getHeader() {
		return header;
	}

	public String getFooter() {
		return footer;
	}
	
	
	
}