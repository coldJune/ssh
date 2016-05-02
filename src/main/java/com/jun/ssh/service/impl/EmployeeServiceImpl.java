package com.jun.ssh.service.impl;

import java.util.List;

import com.jun.ssh.dao.EmployeeDao;
import com.jun.ssh.pojo.Employee;
import com.jun.ssh.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employeeDao.getAll();
	}

}
