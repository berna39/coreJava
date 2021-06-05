package coreJava;
import java.lang.Integer;

public class Parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// parsing string into integer
		String dummy = "10";
		int number  = Integer.parseInt(dummy);
		System.out.println("parsed :"+number);
		
		// parsing integer into string
		int dummyNumber = 10;
		String string  = String.valueOf(dummyNumber);
		System.out.println("parsed :"+string);
		
	}

}
