package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.MessageStore;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {
	private static int helloCount = 0;

	private MessageStore messageStore;
	private String userName;

	public String execute() throws Exception {
		messageStore = new MessageStore();

		if (userName != null) {
			messageStore.setMessage(messageStore.getMessage() + " " + userName);
		}

		helloCount++;

		return SUCCESS;
	}

	/*
	 * Since we want to make the MessageStore object available to the view page,
	 * HelloWorld.jsp, we need to follow the JavaBean-style of providing getter and
	 * setter methods where needed.
	 */
	public MessageStore getMessageStore() {
		return messageStore;
	}

	public int getHelloCount() {
		return helloCount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
