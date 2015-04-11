package com.delicious.dao;

import java.util.List;
import java.util.Map;

public interface LoginDao {
	public List<Map<String,Object>> getUser(Map<String,Object> queryMap);
}
