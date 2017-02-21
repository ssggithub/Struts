package com.ssg.struts;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class TestAwareAction implements ApplicationAware, SessionAware, RequestAware,
	ParameterAware{
	
	public String execute(){
		
		//1. �� application �м���һ������: applicationKey2 - applicationValue2
		application.put("applicationKey2", "applicationValue2");
		
		//2. �� application �ж�ȡһ������ date, ����ӡ. 
		System.out.println(application.get("date"));
		
		
		return "success";
	}
	
	public String save(){
		
		return null;
	}

	private Map<String, Object> application;
	
	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}

	@Override
	public void setParameters(Map<String, String[]> parameters) {
		
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		
	}
	
}
