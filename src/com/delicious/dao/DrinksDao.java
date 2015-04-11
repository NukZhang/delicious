package com.delicious.dao;

import java.util.List;
import java.util.Map;

public interface DrinksDao {
	/**
	 * 查询列表
	 * @param queryMap
	 * @return
	 */
	public List<Map<String,Object>> getList(Map<String,Object> queryMap);
	/**
	 * 查询详情
	 * @param id
	 * @return
	 */
	public Map<String,Object> getDetail(long id);
	/**
	 * 查询轮播图片列表
	 * @param id
	 * @return
	 */
	public List<Map<String,Object>> getPicList(long id);
	
}
