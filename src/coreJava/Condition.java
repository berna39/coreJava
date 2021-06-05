package coreJava;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 12, num2 = 10; 
		char gender = 'M';
		
		if(num1 == num2) {
			System.out.print("They are equal");
		}
		
		if(num1 != num2) {
			System.out.print("They are different");
		}
		
		if(num1 > num2) {
			System.out.print("num1 is much more");
		}
		
		if(num1 >= num2) {
			System.out.print("num1 is much more");
		}
		
		// AND operand
		if(num1 >= 10 && num2 < num1) {
			System.out.print("num1 is much more");
		}
		
		// OR operand
		if(num1 >= 10 || num2 < num1) {
			System.out.print("num1 is much more");
		}
		
		// ternary opration
		int superior = (num1 > num2 )? num1 : num2;
		
		
		// switch case
		
		switch (gender) {
			case 'M':
					System.out.println("Hey man");
				break;
			case 'F':
				System.out.println("Hey miss");
			break;
	
			default:
				System.out.println("Have you seen my childhood");
				break;
		}

	}

}
