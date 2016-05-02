package com.jun.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jun.ssh.dao.EmployeeDao;
import com.jun.ssh.pojo.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private SessionFactory sessionFacory;
	
	public void setSessionFacory(SessionFactory sessionFacory) {
		this.sessionFacory = sessionFacory;
	}
	
	public Session getSession(){
		return this.sessionFacory.getCurrentSession();
	}
	@Override
	public List<Employee> getAll() {
		String hql="from Employee";
		return getSession().createQuery(hql).list();
		
	}

}
