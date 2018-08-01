package com.quanlinhansu.springmvc.dao;


import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.quanlinhansu.interfacedao.GenericDao;
import com.quanlinhansu.springmvc.configs.HibernateUtill;


public class AbstractImpl<ID extends Serializable, T> implements GenericDao<ID,T >{
private Class<T> persistenceClass;
public Class<T> getPersistenceClass() {
	return persistenceClass;
}
public void setPersistenceClass(Class<T> persistenceClass) {
	this.persistenceClass = persistenceClass;
}
@SuppressWarnings("unchecked")
public AbstractImpl(){
	this.persistenceClass = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[1];
}
private String getNamepersistence()
{
	return this.persistenceClass.getSimpleName();
	}
@SuppressWarnings("unchecked")
@Override
public List<T> FindAll() {
	List<T> list= null;
	Session ss= HibernateUtill.getFact().openSession();
	org.hibernate.Transaction tx= null;
	try {
		tx=ss.beginTransaction();
		StringBuilder hql=new StringBuilder("FROM ");
		hql.append(this.getNamepersistence());
		list= ss.createQuery(hql.toString()).getResultList();;
		tx.commit();
	} catch (Exception e) {
		tx.rollback();
		System.out.println(e.getMessage());
	}
	return list;
}
@Override
public int Update(T eTiTy) {
	int status=0;
	Session ss= HibernateUtill.getFact().openSession();
	org.hibernate.Transaction tx= null;
	try {
		tx=ss.beginTransaction();
		ss.saveOrUpdate(eTiTy);
		status=1;
		tx.commit();
	} catch (Exception e) {
		tx.rollback();
		System.out.println(e.getMessage());
	}
	return status;
}
@Override
public int DeleteT(T eNtity) {
	int status=0;
	Session ss= HibernateUtill.getFact().openSession();
	org.hibernate.Transaction tx= null;
	try {
		tx=ss.beginTransaction();
		ss.delete(eNtity);
		status=1;
		tx.commit();
	} catch (Exception e) {
		tx.rollback();
		System.out.println(e.getMessage());
	}
	return status;
	
}
@SuppressWarnings("unchecked")
@Override
public Object[] FindbyProperty(String property, Object value, String typeSort, String sortDisrection) {
	Session session=HibernateUtill.getFact().openSession();
	org.hibernate.Transaction tx= null;
	List<T> list= new ArrayList<T>();
	Object toTalitem= 0;
	try {
	tx=session.beginTransaction();
	StringBuilder sql= new StringBuilder("FROM ");
	sql.append(this.getNamepersistence());
	sql.append(" WHERE ");
	if(property!= null && value!=null)
	{
		sql.append(property);
		sql.append(" = :Value");
	}
	if(typeSort!=null&&sortDisrection!=null)
	{
		sql.append(" ORDER BY ");
		sql.append(typeSort );
			sql.append(" "+(sortDisrection));
	}
	Query query1= (Query) session.createQuery(sql.toString());
	query1.setParameter("Value", value);
	list=query1.list();
	toTalitem= list.size();
	tx.commit();
} catch (Exception e) {
	tx.rollback();
	// TODO: handle exception
}
return new Object[]{list,toTalitem};
}
@Override
public int Add(T enTyti) {
	int status=0;
	Session ss= HibernateUtill.getFact().openSession();
	org.hibernate.Transaction tx= null;
	try {
		tx=ss.beginTransaction();
		ss.persist(enTyti);
		status=1;
		tx.commit();
	} catch (Exception e) {
		tx.rollback();
		System.out.println(e.getMessage());
	}
	return status;
}
}
