package coreJava;

public class ArtithmeticsOperations {
	
	 
	 public static void main(String[] args) {
		 
		int num1 = 10,num2 = 3;
		System.out.println("addition: "+ (num1 + num2));
		System.out.println("soustraction: "+ (num1 - num2));
		System.out.println("produit: "+ (num1 * num2));
		System.out.println("Quotien: "+ (num1 / num2));
		System.out.println("Modulo: "+ (num1 % num2));
		
		
		// incrementing num1 value
		++num1;
		num1++;
		num1 = num1+1;
		num1 += 1;
		
		System.out.println("num 1 value"+ num1);
		
		// decrementing num2 value
				--num2;
				num2--;
				num2 = num2-1;
				num2 -= 1;
				
		System.out.println("num 2 value"+ num2);
	
	}
}
