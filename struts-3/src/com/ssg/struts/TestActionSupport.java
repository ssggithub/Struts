package com.ssg.struts;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class TestActionSupport extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("------------");
		return SUCCESS;
	}
	
}
