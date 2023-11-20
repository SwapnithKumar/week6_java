import java.util.*;


abstract class TestQuestion{
	String quest;
	int point;
	void setQuest(String quest){
		this.quest = quest;
	}
	void setPoint(int point){
		this.point = point;
	}
	abstract boolean isCorrect(String answer);
}

class MultChoice extends TestQuestion{
	String choices[] = new String[4];
	int index;
	void setOption(String option,int i){
		choices[i] = option;
	}
	
	void enterIndex(int index){
		this.index = index;
	}
	
	boolean isCorrect(String answer){
		if(answer.equals(choices[index])){
			return true;
		}
		return false;
	}
}

class WriteTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int score = 0;
		MultChoice m = new MultChoice();
		for(int i=0;i<n;i++){
			System.out.print("Enter the question :");
			String q = sc.next();
			m.setQuest(q);
			
			System.out.print("Enter the point value :");
			int point = sc.nextInt();
			m.setPoint(point);
			
			System.out.println("Enter the options : ");
			for(int j=0;j<4;j++){
				String op = sc.next();
				m.setOption(op,j);
			}
			
			System.out.println("Enter the index of correct option : ");
			int ind = sc.nextInt();
			m.enterIndex(ind);
			
			System.out.println("Enter answer : ");
			String ans = sc.next();
			if(m.isCorrect(ans)){
				score += point;
			}
		}
		
		System.out.println("Total score : "+ score);
	}
}
