package com.empdio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.model.Employee;

public class EmpDioImpl implements EmpDio{
	Scanner sc = new Scanner(System.in);
	Employee e = new Employee();
	
	@Override
	public void createTable(String tablename) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
			
			String sql = "create table "+tablename+"(eid int(6) primary key,ename varchar(120),eaddr varchar (120),esalary int(10),epost varchar(120))";
			
			Statement smt = con.createStatement();
			
			smt.execute(sql);
			
			con.close();
			smt.close();
			
			System.out.println("table created successfully");
			
		} catch (Exception e) {
			
			System.out.println("Required java libraries and jar not available");
			e.printStackTrace();
		}
		finally {
			
		}
	}

	@Override
	public void addEmployee(Employee e) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
			
			String sql ="insert into emp values("+e.getEid()+",'"+e.getEname()+"','"+e.getEaddr()+"',"+e.getEsalary()+",'"+e.getEpost()+"')";
			
			Statement smt = con.createStatement();
			
			smt.execute(sql);
			
			con.close();
			smt.close();
			
			System.out.println("data inserted successfully");
			
		} catch (Exception e1) {
			System.out.println("Required java libraries and jar not available");
			e1.printStackTrace();
		}
		
		
	}
		
	

	@Override
	public void viewEmployee(int eid) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
			

	        String sql ="select * from emp where eid="+eid+"";
			
	        
	        
			Statement smt = con.createStatement();
			
			ResultSet rs = smt.executeQuery(sql);
			while(rs.next()) {
				System.out.println("Employee id 	 :"+rs.getInt(1));
				System.out.println("Employee name 	 :"+rs.getString(2));
				System.out.println("Employee address :"+rs.getString(3));
				System.out.println("Employee salary  :"+rs.getInt(4));
				System.out.println("Employee post    :"+rs.getString(5));
				System.out.println();
			}
			con.close();
			smt.close();
			
			System.out.println("data Display successfully");
			
		} catch (Exception e1) {
			System.out.println("Required java libraries and jar not available");
			e1.printStackTrace();
		}
	}

	@Override
	public void updateEmployee(int eid) {
		 
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
		
		System.out.println("please enter field which you want to update ");
		System.out.println("1.Ename");
		System.out.println("2.Eaddress");
		System.out.println("3.Esalary");
		System.out.println("4.Epost");
		
		int ch=sc.nextInt();
		switch(ch) {
		case 1:{
			
			System.out.println("Please enter new employee name :");
			String newname=sc.next();
			String sql ="update emp set ename='"+newname+"' where eid="+eid+"";
			
			 Statement smt = con.createStatement();
			    smt.execute(sql);
				con.close();
				smt.close();
			break;
		}
		
		case 2:{
			System.out.println("Please enter new employee address :");
			String newaddr=sc.next();
			String sql ="update emp set eaddr='"+newaddr+"' where eid="+eid+"";
			
			 Statement smt = con.createStatement();
			    smt.execute(sql);
				con.close();
				smt.close();
			break;
			
		}
		
		case 3:{
			System.out.println("Please enter new employee salary :");
			int newsal=sc.nextInt();
			String sql ="update emp set esalary="+newsal+" where eid="+eid+"";
			
			 Statement smt = con.createStatement();
			    smt.execute(sql);
				con.close();
				smt.close();
			break;
		}
		
		case 4:{
			System.out.println("Please enter new employee post :");
			String newpost=sc.next();
			String sql ="update emp set epost='"+newpost+"' where eid="+eid+"";
			
			 Statement smt = con.createStatement();
			    smt.execute(sql);
				con.close();
				smt.close();
			break;
		}
		}
		
	   
		
		System.out.println("data updated successfully");
		
	} catch (Exception e1) {
		System.out.println("Required java libraries and jar not available");
		e1.printStackTrace();
	}
	}

	@Override
	public void deleteEmployee(int eid) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
			
	       String sql ="delete from emp where eid='"+eid+"'";
			
			Statement smt = con.createStatement();
			
			smt.execute(sql);
			
			con.close();
			smt.close();
			System.out.println("Record with eid="+eid+" deleted Successfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}

	@Override
	public void dropTable(String tablename) {
		 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "1234");
			
		       String sql ="drop table "+tablename+"";
				
				Statement smt = con.createStatement();
				
				smt.execute(sql);
				
				con.close();
				smt.close();
				
				System.out.println("Table Drop Successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
