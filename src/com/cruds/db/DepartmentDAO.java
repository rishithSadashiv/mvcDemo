package com.cruds.db;

import java.util.List;

import com.cruds.entity.Department;

public interface DepartmentDAO {
	
	public void create(Department dept);
	
	public Department getDepartment(Integer deptid);
	
	public List<Department> listDepartments();
}
