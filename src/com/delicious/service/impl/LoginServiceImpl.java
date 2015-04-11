package com.delicious.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.delicious.dao.LoginDao;
import com.delicious.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	@Resource
	private LoginDao loginDao;
	@Override
	public boolean getUser(String userName, String password) {
		
		Map<String,Object> queryMap = new HashMap<String,Object>();
		queryMap.put("userName", userName);
		queryMap.put("password", password);
		List<Map<String,Object>> list = loginDao.getUser(queryMap);
		if(list!=null&&list.size()>0){
			return true;
		}
		return false;
	}

}
