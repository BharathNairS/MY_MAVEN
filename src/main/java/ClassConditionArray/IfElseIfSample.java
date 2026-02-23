package ClassConditionArray;

public class IfElseIfSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		int b = 200;
		int c = 300;
		
		if (a<b) {
			System.out.println("B is greater");
	}else if (b<c) {
		System.out.println("C is greater");
	}else if (a<c) {
		System.out.println("C is greater");
	}else {
		System.out.println("Invalid");
	}

}
	
}
