package org.apache.struts.register.action;

import org.apache.struts.register.model.Person;

import com.opensymphony.xwork2.ActionSupport;

public class Register extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Person personBean;

	public String execute() throws Exception {
		// call Service class to store personBean's state in database

		return SUCCESS;
	}

	public void validate() {
		if (personBean.getFirstName().length() == 0) {
			addFieldError("personBean.firstName", getText("personBean.firstName.required"));
		}

		if (personBean.getEmail().length() == 0) {
			addFieldError("personBean.email", getText("personBean.email.required"));
		}

		if (personBean.getAge() < 18) {
			addFieldError("personBean.age", getText("personBean.age.requiredEighteenOrOlder"));
		}
	}

	public Person getPersonBean() {
		return personBean;
	}

	public void setPersonBean(Person person) {
		personBean = person;
	}

}
