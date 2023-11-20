import java.util.*;

class BankAccount{
	int acc_number;
	String name;
	double balance;
	void setDetails(int acc_number,String name,double balance){
		this.acc_number = acc_number;
		this.name = name;
		this.balance = balance;
	}
	
	void deposit(double amount){
		balance += amount;
	}
	void withdrawl(int amount){
		balance -= amount;
	}
	void display(){
		System.out.println("Account number : " + acc_number);
		System.out.println("Account holder name : " + name);
		System.out.println("Account balance : " + balance);
	}
}

class SavingsAccount extends BankAccount{
Scanner sc = new Scanner(System.in);
	int r = 2;
	void deposit(double amount){
		System.out.println("Enter the interset rate : ");
		balance += ((r*amount)/100);
	}
}

class CheckingAccount extends BankAccount{
	Scanner sc = new Scanner(System.in);
	double limit = 10000;
	void withdrawl(int amount){
		if(amount > limit){
			System.out.println("Limit Exceeded!");
		}
		else{
			balance -= amount;
		}
	}
}

class bank{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SavingsAccount s = new SavingsAccount();
		CheckingAccount c = new CheckingAccount();
		s.setDetails(123,"Swap",23456);
		s.display();
		s.deposit(100);
		s.display();
		c.withdrawl(100000);
		c.withdrawl(1000);
		
	}
}

