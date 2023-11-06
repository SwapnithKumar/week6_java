import java.util.*;


class methodOverloading{
	int add(int a,int b){ return a+b;}
	int add(int a,int b,int c){ return a+b+c;}
}

//METHOD OVER RIDING
	class Animal{
		void print(){
			System.out.println("Base Class");
			System.out.println("Animals need food to survive!");
		}
	}
	
	class dog extends Animal{
		void print(){
			System.out.println("Derived Class");
			System.out.println("Dog will print");
		}
	}

class two{
	public static void main(String[] args){
		methodOverloading a = new methodOverloading();
		System.out.println("add() with two parameters : "+a.add(2,3));
		System.out.println("add() with three parameters : "+a.add(1,2,3));
		
		dog d = new dog();
		d.print();
		
		Animal b = new Animal();
		b.print();
		
		Animal c = new dog();
		c.print();
	}
}
