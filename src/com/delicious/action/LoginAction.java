package com.delicious.action;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.delicious.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
/**
 * Ç°Ì¨µÇÂ¼
 * @author Administrator
 *
 */
public class LoginAction  extends ActionSupport{
	 	/**
	 * 
	 */
	private static final long serialVersionUID = 7432578840882672506L;
		private String username;
		private String password;
		@Resource
		private LoginService loginService;
		@Override
	    public String execute() throws Exception
	    {
			HttpServletRequest request = ServletActionContext.getRequest();
			Cookie[] cookies = request.getCookies();
			/*if(cookies!=null){
				for(Cookie cookie:cookies){
					if(cookie.getName().equals("username")){
						return "islogin";
					}
				}
			}*/
			System.out.println(loginService.getUser(username, password));
			HttpServletResponse response = ServletActionContext.getResponse();
			Cookie cookie = new Cookie("username", username);
			Cookie pwdcookie = new Cookie("password", password);
	        System.out.println("Ìí¼Ócookie");  
	        cookie.setMaxAge(-1);// cookie¹Ø±Õä¯ÀÀÆ÷Ê§Ð§
	        pwdcookie.setMaxAge(-1);
	        response.addCookie(cookie);
	        response.addCookie(pwdcookie);
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
		public LoginService getLoginService() {
			return loginService;
		}
		public void setLoginService(LoginService loginService) {
			this.loginService = loginService;
		}
		
		
		
		
}
