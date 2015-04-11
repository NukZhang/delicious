package com.delicious.service;


/**
 * 前台登录service
 * @author Administrator
 *
 */
public interface LoginService {
	/**用户登录
	 * 
	 * @return
	 */
	public boolean getUser(String userName,String password);
}
