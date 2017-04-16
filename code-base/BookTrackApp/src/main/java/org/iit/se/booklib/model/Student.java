package org.iit.se.booklib.model;

public class Student {

	private String userId;
	private String parent_name;
	private String parent_contact;
	private String due_amount;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getParentName() {
		return parent_name;
	}

	public void setParentName(String parent_name) {
		this.parent_name = parent_name;
	}

	public String getParentContact() {
		return parent_contact;
	}

	public void setParentContact(String parent_contact) {
		this.parent_contact = parent_contact;
	}

	public String getDueAmount() {
		return due_amount;
	}

	public void setDueAmount(String due_amount) {
		this.due_amount = due_amount;
	}

}
