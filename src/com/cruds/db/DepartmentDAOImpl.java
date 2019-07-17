package com.cruds.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cruds.entity.Department;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Department dept) {
		String SQL = "insert into department values (?, ?)";
		jdbcTemplate.update(SQL, new Object[]{dept.getDeptId(), dept.getDeptName()});
	}
	
	@Override
	public Department getDepartment(Integer deptid) {
		String SQL = "select * from department where deptid = ?";
		Department dept = (Department) jdbcTemplate.queryForObject(SQL,new Object[]{deptid.intValue()},new DepartmentRowMapper());
		return dept;

	}

	class DepartmentRowMapper implements RowMapper<Department>
	{
	@Override
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
	Department department = new Department();
	department.setDeptId(rs.getInt("deptid"));
	department.setDeptName(rs.getString("deptname"));
	return department;
	}

	}
	
	@Override
	public List<Department> listDepartments() {
		String SQL = "select * from department";
		List<Department> deptList = jdbcTemplate.query(SQL, new DepartmentRowMapper());

		return deptList;

	}
	
}