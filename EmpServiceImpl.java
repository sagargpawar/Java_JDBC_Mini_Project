package com.empservice;

import com.model.Employee;
import com.empdio.EmpDio;
import com.empdio.EmpDioImpl;
public class EmpServiceImpl implements EmpService{

	EmpDioImpl ed = new EmpDioImpl();
						
	
	@Override
	public void createTable(String tablename) {
		 ed.createTable(tablename);
		
	}

	@Override
	public void addEmployee(Employee e) {
		 ed.addEmployee(e);
		
	}

	@Override
	public void viewEmployee(int eid) {
		 ed.viewEmployee(eid);
		
	}

	@Override
	public void updateEmployee(int eid) {
		 ed.updateEmployee(eid);
		
	}

	@Override
	public void deleteEmployee(int eid) {
		 ed.deleteEmployee(eid);
		
	}

	@Override
	public void dropTable(String tablename) {
		 ed.dropTable(tablename);
		
	}

}
