package com.cruds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cruds.db.DepartmentDAO;
import com.cruds.entity.Department;

@Repository
public class DepartmentService {
	
	@Autowired
	private DepartmentDAO departmentDAO;
	
	public void create(Department d)
	{
		departmentDAO.create(d);
	}
	
	public List<Department> listDepartments()
	{
		return departmentDAO.listDepartments();
	}

}
