package com.delicious.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction  extends ActionSupport{
	 	/**
	 * 
	 */
	private static final long serialVersionUID = 7432578840882672506L;
		private String username;
		private String password;
		@Override
	    public String execute() throws Exception
	    {
			HttpServletResponse response = ServletActionContext.getResponse();
			Cookie cookie = new Cookie("username", username + ","  
	                + password);  
	        System.out.println("添加cookie");  
	        cookie.setMaxAge(60 * 30);// cookie保存两周  
	        response.addCookie(cookie);
	 		System.out.println(username);
	       return SUCCESS;
	    }
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		
}
