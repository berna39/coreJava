package coreJava;

public class CastingOperation {

	public static void main(String[] args) {

		// two double variables
		double num1 = 10, num2 = 3;
		// int variable for the result
		int result;
		
		// casting results
		result = (int) (num1 / num2);
		
		System.out.print("reslut :"+result);
		
		
		// two int variables
		int num3 = 10, num4 = 3;
		// double variable for the result
		double result2;
		
		// casting results
		result2 = (double) num3 / (double) num4 ;
		
		System.out.print("reslut :"+result2);
		
		// another way to cast
		double d = 1000d;
		float weight = 70.5f;
		
	}

}
