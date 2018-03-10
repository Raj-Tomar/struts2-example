package com.raj.struts2.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String name;
    private Date nowDate;
    
    @Override
    public void validate() {
    	if(name == null || name.length() == 0){
    		addActionError(getText("error.enter.message"));
    	}
    }
    
    @Override
    public String execute() {
    	 nowDate = new Date();
         return SUCCESS;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNowDate() {
		return nowDate;
	}
}
