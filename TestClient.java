package com.client;

import java.util.Scanner;

import com.empcontroller.EmpController;
import com.model.Employee;

public class TestClient {

	public static void main(String[] arg) {
		
		Employee e = new Employee();
		
		EmpController ec = new EmpController(); 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*******Manu*******");
		System.out.println("1.Create Table For Employee DataBase");
		System.out.println("2.Add Employee Details");
		System.out.println("3.View Employee Details");
		System.out.println("4.Update Employee Details");
		System.out.println("5.Delete Record From Database");
		System.out.println("6.Drop Table From Database \n");
		
		System.out.println("Plese Enter Your Choice : ");
		
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:{
			System.out.println("Enter Table Name for Creating Table in Database To Store Employee Details: \n ");
	     	String tablename =sc.next();
	     	ec.createTable(tablename);
			break;
		}
        case 2:{
    		System.out.println("Enter employee details : \n");
    		
            System.out.println("Enter Employee Id : ");
    		int eid =sc.nextInt();
    		e.setEid(eid);
    		
    		System.out.println("Enter Employee name : ");
    		String ename =sc.nextLine();
    		e.setEname(ename);
    		
            System.out.println("Enter Employee address : ");
    		String eaddr =sc.nextLine();
    		e.setEaddr(eaddr);
    	
    		System.out.println("Enter Employee Salary : ");
    		int esalary =sc.nextInt();
    		e.setEsalary(esalary);
    	
            System.out.println("Enter Employee post : ");
    		String epost =sc.nextLine();
    		e.setEpost(epost);
    		
    		
    		ec.addEmployee(e);
    		
    		
        	break;
		}
		case 3:{
			System.out.println("For View Employee Details , Please enter eid");
			int eid = sc.nextInt();
			
			ec.viewEmployee(eid);
			break;
		}
        case 4:{
			
        	System.out.println("For Update employee Details please enter employee id :");
        	int eid = sc.nextInt();
            ec.updateEmployee(eid);
        	
        	
        	break;
		}	
		case 5:{
			System.out.println("For Delete employee Details please enter employee id :");
        	int eid = sc.nextInt();
            ec.deleteEmployee(eid);
			break;
		}
        case 6:{
        	System.out.println("For Drop employee Details table please enter employee table name :");
        	String tablename = sc.next();
            ec.dropTable(tablename);
        	break;
		}    
        default:{
        	System.out.println("You Entered Wronge Choice /n Please Enter Correct Choice ");
        }
        
		}
		
		
	}
}
