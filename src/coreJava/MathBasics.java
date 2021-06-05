package coreJava;

import java.math.*;

public class MathBasics {
	public static void main(String[] args) {
		double X = 0.0;
		X = Math.random();
		//Return a random number between 0 et 1 as 0.00013471058
		System.out.println(X);
		
		
		double sin = Math.sin(120); // sinus
		System.out.println(sin);
		
		
		double cos = Math.cos(120); // cosinus
		System.out.println(cos);
		
		
		double tan = Math.tan(120); // tangente
		System.out.println(tan);
		
		
		double abs = Math.abs(-120.25); //absolute value 
		System.out.println(abs);
		
		
		// pow 
		double d = 2;
		double exp = Math.pow(d, 2);
		System.out.println(exp);
	}
}
