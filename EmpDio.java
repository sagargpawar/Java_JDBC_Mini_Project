package com.empdio;

import com.model.Employee;

public interface EmpDio {

	public void createTable(String tablename);
	
	public void addEmployee(Employee e);
	
	public void viewEmployee(int eid);
	
	public void updateEmployee(int eid);
	
	public void deleteEmployee(int eid);
	
	public void dropTable(String tablename);
}
