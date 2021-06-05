package coreJava;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("terminator");
		
		//lower case
		System.out.println(name.toLowerCase());
		
		//upper case
		System.out.println(name.toUpperCase());
		
		//length
		System.out.println(name.length());
		
		//index of
		System.out.println(name.indexOf('t'));
		
		//last index of
		System.out.println(name.lastIndexOf('t'));
		
		//substring
		System.out.println(name.substring(0,5));
		
	}

}
