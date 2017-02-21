package org.ssh.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;



public interface BaseDaoI<T> {

	//保存
	Serializable save(T entity); 
	
	//删除
	void delete(T entity);
	
	//更新
	void update(T entity);
	
	//按id查找，返回一个对象
	T find(Class<T> c, Serializable id);
	//带参数
	T get(String hql, Map<String, Object> params);
	
	List<T> find(String hql);
	
	//
	List<T> find(String hql, Object[] params);

	List<T> find(String hql, Map<String, Object> params);
	
	/**
	 * 执行HQL语句
	 * 
	 * @param hql
	 * @return 响应数目
	 */
	public Integer executeHql(String hql);
	
	
	public Integer executeHql(String hql, Object[] params);
	
	
	public Integer executeHql(String hql, Map<String, Object> params);
	
	public T get(Class<T> c, Serializable id);
	
	/**
	 * 保存或更新对象
	 * 
	 * @param entity
	 */
	public void saveOrUpdate(T entity);
	
	
}
