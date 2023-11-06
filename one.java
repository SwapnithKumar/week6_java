import java.util.*;


class areas{
	int area(int s){
		return s*s;
	}

	int area(int l,int b){
		return l*b;
	}
	
	int perimeter(int s){
		return 4*s;
	}

	int perimeter(int l,int b){
		return 2*(l+b);
	}
	
}

class one{
	public static void main(String[] args){
		areas a = new areas();
		System.out.println("Area of the square : " + a.area(4));
		System.out.println("Perimeter of the square : " + a.perimeter(4));
		System.out.println("Area of the rectangle : " + a.area(2,4));
		System.out.println("Perimeter of the rectangle : " + a.perimeter(2,4));
	}
}
