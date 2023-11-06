import java.util.*;

class Employee{
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
		ContractEmployee e1 = new ContractEmployee();
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
		
		System.out.println("-----");
		RegularEmployee r = new RegularEmployee();
		r.setfname("Shashi Kumar");
		r.setlname("Vemula");
		r.setDept("NLP");
		r.setDesg("HOD");
		r.setSalary(96000000);
		System.out.println("Full name : " + r.getFullName());
		r.etype();
		System.out.println("Department : " + r.getDepartment());
		System.out.println("Designation : " + r.getDesignation());
		System.out.println("Salary : " + r.getSalary() +" per annum.");
	
	}
}

class ContractEmployee extends Employee{
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

class RegularEmployee extends Employee{
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
		System.out.println("Regular based!");
	}
}
