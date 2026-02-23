package ClassConditionArray;

public class StudentGrade {
	
	public static void main (String args []){
		int mark=70;
		int a = 90;
		int b = 50;
		int c = 30;
		if (mark>a){
			System.out.println ("Grade A");
		}else if (mark>b){
			System.out.println("Grade B");
		}else if (mark>c){
			System.out.println("Grade C");
		}else {
			System.out.println("Invalid");
		}
	}
}

