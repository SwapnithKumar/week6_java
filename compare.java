import java.util.*;

class compare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		//1
		System.out.println(a.compareTo(b));
		
		//2
		System.out.println("Equals Case: ");
		if(a.equals(b)){
			System.out.println("Both the strings are equal");
		}
		else{
			System.out.println("Not equal");
		}
		if(a.equalsIgnoreCase(b)){
			System.out.println("Both the strings are equal");
		}
		else{
			System.out.println("Not equal");
		}
		
		//3
		System.out.println("Charcater present at Index :" + a.indexOf('o'));
		
		//4
		System.out.println("Concatenated string is : " + a.concat(b));
		
		//5
		String c = a.toLowerCase();
		int vc = 0,cc=0;
		for(int i=0;i<c.length();i++){
			char ch = c.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				vc+=1;
			}
			else{
				cc+=1;
			}
		}
		
		System.out.println("Vowels count : " + vc + "\nConsonants Count : " + cc);
		
		//6
		System.out.println("Length of the string : " + a.length());
		
		//7
		StringBuilder rev = new StringBuilder();
		rev.append(a);
		rev.reverse();
		/*for(int i=a.length()-1;i>=0;i--){
			rev.append(a.charAt(i));
		}*/
		System.out.println("Reverse of the string : "+ a + " = " + rev);
		
		//8
		System.out.println("Substring is : " + a.substring(1,3));
		
		//9
		
		System.out.println("Uppercase is : " + a.toUpperCase());
		System.out.println("Lowercase is : " + a.toLowerCase());
	}
}








