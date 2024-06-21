package com.empcontroller;
import com.empservice.EmpService;
import com.empservice.EmpServiceImpl;
import com.model.Employee;

public class EmpController {

	EmpService es = new EmpServiceImpl();

	public void createTable(String tablename) {
		System.out.println("table name : "+tablename);
		es.createTable(tablename);
	}
	
	public void addEmployee(Employee e) {
		es.addEmployee(e);
	}
	
	public void viewEmployee(int eid) {
		es.viewEmployee(eid);
	}
	
	public void updateEmployee(int eid) {
		es.updateEmployee(eid);
	}
	
	public void deleteEmployee(int eid) {
		es.deleteEmployee(eid);
		
	}
	
	public void dropTable(String tablename) {
		es.dropTable(tablename);
	}
	
}
