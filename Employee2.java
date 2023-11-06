import java.util.*;

class Employee2{
	String fname,lname;
	void setfname(String fname){
		this.fname = fname;
	}
	
	void setlname(String lname){
		this.lname = lname;
	}
	
	String getFname(){
		return this.fname;
	}
	String getLname(){
		return this.lname;
	}
	public static void main(String[] args){
		cEmployee e1 = new cEmployee();
		e1.setfname("Swapnith");
		e1.setlname("Kumar");
		e1.setDept("IT");
		e1.setDesg("SDE");
		e1.setSalary(9600000);
		System.out.println("Full name : " + e1.getFullName());
		System.out.println("Department : " + e1.getDepartment());
		System.out.println("Designation : " + e1.getDesignation());
		System.out.println("Salary : " + e1.getSalary() +" per annum.");
		e1.etype();
		e1.setHours(8);
		e1.setWage(100);
		e1.calculateWages();
	}
}

class cEmployee extends Employee{
	String dept,desg;
	int salary;
	void setDept(String dept){
		this.dept = dept;
	}
	void setDesg(String desg){
		this.desg = desg;
	}
	void setSalary(int salary){
		this.salary = salary;
	}
	String getFullName(){
		return this.fname +" " +this.lname;
	}
	String getDepartment(){
		return this.dept;
	}
	String getDesignation(){
		return this.desg;
	}
	int getSalary(){
		return this.salary;
	}
	void etype(){
		System.out.println("Contract based!");
	}
}


class hourly extends cEmployee{
	int h,s;
	System.out.println("Salary of hourly employee for 1 month: "+h*s*30);
	void setHours(int h){
		this.h = h;
	}
	void setWage(int s){
		this.s = s;
	}
	void calculateWages(){
		System.out.println("Salary of hourly employee for 1 month: "+h*s*30);
	}
}















