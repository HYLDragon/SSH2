package org.ssh.dao.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.query.Query;
//import org.hibernate.Query;//5之后舍掉
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.ssh.dao.BaseDaoI;
@Repository(value="baseDao")
public class BaseDaoImpl<T> implements BaseDaoI<T> {
	//sessionFactory
	@Autowired
	private SessionFactory sessionFactory;
	
	Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public Serializable save(T entity) {
		return this.getSession().save(entity);
	}

	public void delete(T entity) {
		this.getSession().delete(entity);
	}

	public void update(T entity) {
		this.getSession().update(entity);
	}

	public T find(Class<T> c, Serializable id) {
		return (T) this.getSession().get(c,id);
	}

	public T get(String hql, Map<String, Object> params) {
		return (T) this.find(hql,params).get(0);
	}

	public List<T> find(String hql) {
		return this.getSession().createQuery(hql).list();
	}

	public List<T> find(String hql, Object[] params) {
		return null;
	}

	public List<T> find(String hql, Map<String, Object> params) {
		Query query=this.getSession().createQuery(hql);
		if (query !=null && !params.isEmpty()){
			for (String key:params.keySet()) {
				query.setParameter(key,params.get(key));
			}
		}
		return query.list();
	}

	public Integer executeHql(String hql) {
		return null;
	}

	public Integer executeHql(String hql, Object[] params) {
		return null;
	}

	public Integer executeHql(String hql, Map<String, Object> params) {
		Query query=getSession().createQuery(hql);
		if (params!=null && params.size()>0) {
			for (String key : params.keySet()) {
				query.setParameter(key, params.get(key));
			}
		}
		return query.executeUpdate();
	}

	public T get(Class<T> c, Serializable id) {
		return null;
	}

	public void saveOrUpdate(T entity) {
		this.getSession().saveOrUpdate(entity);
	}

}
